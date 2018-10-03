//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Celcius To Farenheit
//Purpose: The application convert celcius to farenheit 

class CelciusToFarenheit {
    public static void main(String[] args) {
        //Number Values
        int celsiusValue = 50;
        final float nineOverEight  = 9/5F;
        final int thirtyTwo = 32;
        float celciusFarenheitToValue = celsiusValue * nineOverEight + thirtyTwo;

        //Special Characters
        char degreeSymbol = '\u00B0';

        //Messages
        String celsiusMessage = Integer.toString(celsiusValue) + degreeSymbol + "C";
        String farenheitToCelciusMessage = Float.toString(celciusFarenheitToValue) + degreeSymbol + "F";
        
        //Print Statements
        System.out.println(celsiusMessage + " is " + farenheitToCelciusMessage);
    }
}