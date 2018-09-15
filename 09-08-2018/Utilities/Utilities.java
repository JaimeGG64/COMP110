//Name: Jaime Garcia Garcia
//Date: 09-08-2018
//Application: Utilities
//Purpose: The application will demo the String, Math, Scanner and JOptions Classes
/*
•	StringDemo
o	Visit the Java docs for the String class and use 3 different methods (pick your favorite)
•	MathDemo
o	Visit the Java docs for the Math class and use 3 different methods (pick your favorite)
•	ScannerDemo
o	Visit the Java docs for the Scanner class, scan 3 different inputs (different primitive types) from the user
•	JOptionPaneDemo
o	Use the following methods (see last slide for examples)
	showMessageDialog
	showConfirmDialog  - confirmation question dialog (store and output the option user selects)
	showInputDialog - output the text user enters in the box
•	One single class for all demos
•	Remember formatting, indentation, naming convention, good coding practice!

*/

import java.util.Scanner;
// import javax.swing.JOptionPane;

class Utilities {
    public static void main(String[] args) {
    //Global Data Types
    char equalSymbol = '\u003d';
    char sqrtRootSymbol = '\u221a';
    int integerInput = 0;
    String stringInput = "";
    boolean booleanInput = false;

    // String Input - 1
    Scanner userInputScanner = new Scanner (System.in); 
    System.out.println("Please enter a word");

    stringInput = userInputScanner.next();
    System.out.println("You entered: " + stringInput);     
    
    //Letter Checker
    String letterToCheck = "e";
    boolean letterChecker = stringInput.endsWith(letterToCheck);
    if(letterChecker) {
        String endWithEMessage = "The word " + stringInput + " ends with " + letterToCheck + ".";
        System.out.println(endWithEMessage);
    }
    else {
        String doesNotEndWithEMessage = "The word " + stringInput + " does not end with " + letterToCheck + ".";
        System.out.println(doesNotEndWithEMessage);
    }

    //Letter Counter
    int lengthOfWord = stringInput.length();
    String lengthOfWordMessage = "The word has " + Integer.toString(lengthOfWord) + " letters.";
    System.out.println(lengthOfWordMessage);
    
    //Uppercase Transform
    String upperCaseWord = stringInput.toUpperCase();
    String upperCaseWordMessage = "Here " + upperCaseWord + " in uppercase";
    System.out.println(upperCaseWordMessage);
    
    // Int Input - 2
    System.out.println("Please enter a value");
    integerInput = userInputScanner.nextInt();
    System.out.println("You entered: " + integerInput);
    double intToDoubleConvert = integerInput;

    //Square Root
    double sqrtRootOutput = Math.sqrt(intToDoubleConvert);
    String sqrtRootOutputMessage = sqrtRootSymbol + "(" + Double.toString(intToDoubleConvert) + ")" + equalSymbol +  Double.toString(sqrtRootOutput);
    System.out.println(sqrtRootOutputMessage);

    //Sine 
    double sineOutput = Math.sin(intToDoubleConvert);
    String sinIdentitiesOutputMessage = "sin(" + Double.toString(integerInput) + ")" + equalSymbol + Double.toString(sineOutput);
    System.out.println(sinIdentitiesOutputMessage);

    //Square
    final double squareExponent = 2;
    double powerEquationOutput = Math.pow(intToDoubleConvert,squareExponent);
    String powerEquationOutputMessage = Double.toString(intToDoubleConvert) + "^(" + Double.toString(squareExponent) + ")" + equalSymbol + Double.toString(powerEquationOutput);
    System.out.println(powerEquationOutputMessage);

    System.out.println("Did you have a good morning? Type true or false.");

    //Boolean Input - 3
    booleanInput = userInputScanner.nextBoolean();

    System.out.println("You entered: " + booleanInput);

    if(booleanInput) {
        System.out.println("Congratulations!!!");
    }
    else {
        System.out.println("Sorry to hear that.");
    }
    
    userInputScanner.close();

        //Demo JOptionPane
        // JOptionPane.showMessageDialog(null, "This is so cool");
    }
}