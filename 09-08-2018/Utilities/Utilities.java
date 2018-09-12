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

// import java.util.Scanner;
// import javax.swing.JOptionPane;

class Utilities {
    public static void main(String[] args) {
        //Demo String
        String myWord = "blueberry";
        System.out.println("The word is: " + myWord + ".");
        String letterChecker = "e";
        if(myWord.endsWith(letterChecker)) {
            System.out.println("The word " + myWord + " ends with " + letterChecker + ".");
        }
        else {
            System.out.println("The word " + myWord + " does not end with " + letterChecker + ".");
        }
        int lengthOfWord = myWord.length();
        System.out.println("The word has " + Integer.toString(lengthOfWord) + " letters.");
        String upperCaseWord = myWord.toUpperCase();
        System.out.println(upperCaseWord + " is another way to spell " + myWord + ".");
        
        //Demo Math
        // double sinOfX = Math.sin(1);
        // System.out.print(sinOfX);
        
        //Demo Scanner
        // int input = 0;
        // Scanner myScanner = new Scanner (System.in);

        // System.out.println("Please enter a value");
        // input = myScanner.nextInt();

        // System.out.println("You entered: " + input);

        // myScanner.close();

        //Demo JOptionPane
        // JOptionPane.showMessageDialog(null, "This is so cool");
    }
}