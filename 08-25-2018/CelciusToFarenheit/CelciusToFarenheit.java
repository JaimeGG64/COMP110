//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Circumference of a Circle
//Purpose: The Application use escape character to print the following message

class CelciusToFarenheit {
    public static void main(String[] args) {
        //Number Values
        int celsiusValue = 31;
        final double onePointEight  = 1.8;
        final int thirtyTwo = 32;
        double celciusFarenheitToValue = celsiusValue * onePointEight + thirtyTwo;

        //Special Characters
        char degreeSymbol = '\u00B0';

        //Messages
        String celsiusMessage = Double.toString(celsiusValue) + degreeSymbol + "C";
        String farenheitToCelciusMessage = Double.toString(celciusFarenheitToValue) + degreeSymbol + "F";
        
        //Print Statements
        System.out.println(celsiusMessage + " is " + farenheitToCelciusMessage);
    }
}