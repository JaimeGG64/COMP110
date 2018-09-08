//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Farenheit to Celcius
//Purpose: The application will convert farenheit to celcius

class FarenheitToCelcius {
    public static void main(String[] args) {
        //Number Values
        int farenheitValue = 70;
        final float nineOverEight  = 9/5F;
        final int thirtyTwo = 32;
        float farenheitToCelciusValue = (farenheitValue - thirtyTwo) / nineOverEight;

        //Special Characters
        char degreeSymbol = '\u00B0';

        //Messages
        String farenheitMessage = Integer.toString(farenheitValue) + degreeSymbol + "F";
        String farenheitToCelciusMessage = Float.toString(farenheitToCelciusValue) + degreeSymbol + "C";
        
        //Print Statements
        System.out.println(farenheitMessage + " is " + farenheitToCelciusMessage);
    }
}