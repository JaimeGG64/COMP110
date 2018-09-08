import java.io.Console;

//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Date Types and Operators
//Purpose: The application use the variety of data types and operators provided by the Java language

class DataTypesAndOperators {
    public static void main(String[] args) {
        //Declearing Java Primitive Data Types
        boolean isStudent = true;
        char SmallnWithTilde = '\u00F1';
        byte numberOfPokemons = 6;
        short yearOfY2K = 2000;
        int numberOfBooksInLibrary = 107092;
        long numberOfMilesInLightYears = 5878600000000L;
        float PIApproximation = 3.14F;
        double numberOfPeopleUsingTheInternet = 3200000000D;

        String booleanMessage = "Is Jaime a Student - " + Boolean.toString(isStudent);
        String charMessage = "The 15th letter of the Spanish alphabet is " + SmallnWithTilde;
        String byteMessage = "The maximum number of Pokemon balls a player can hold is " + Byte.toString(numberOfPokemons);
        String shortMessage = "Y2K took place in " + Short.toString(yearOfY2K);
        String intMessage = "The CSUN Library checked out approximately " + Integer.toString(numberOfBooksInLibrary) + " Books";
        String longMessage = "The number of miles in a light year is " + Long.toString(numberOfMilesInLightYears);
        String floatMessage = "The simplest approximation of PI is " + Float.toString(PIApproximation);
        String doubleMessage = "The approximent number of people using the internet is " + Double.toString(numberOfPeopleUsingTheInternet);

        System.out.println(booleanMessage);
        System.out.println(charMessage);
        System.out.println(byteMessage);
        System.out.println(shortMessage);
        System.out.println(intMessage);
        System.out.println(longMessage);
        System.out.println(floatMessage);
        System.out.println(doubleMessage);

        //Operators
        int myAge = 19;
        myAge += 2;
        System.out.println("I will be " + myAge + " years old.");
        myAge -= 4;
        System.out.println("I was " + myAge + " years old.");
        int square = 4;
        System.out.println("The photo was " + square + " inches tall and wide");
        square *= 4;
        System.out.println("So the photo had an area of " + square + " inches square");
        square /= 2;
        System.out.println("Half of that is " + square + " inches square");
        square %= 3;
        System.out.println("If it was divided by three then the remainder would be " + square);
    }
}