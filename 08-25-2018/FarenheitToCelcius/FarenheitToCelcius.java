//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Circumference of a Circle
//Purpose: The Application use escape character to print the following message

class FarenheitToCelcius {
    public static void main(String[] args) {
        //Number Values
        int farenheitValue = 50;
        final double pointFive  = 0.5555;
        final int thirtyTwo = 32;
        double farenheitToCelciusValue = (farenheitValue - thirtyTwo) * pointFive;

        //Special Characters
        char degreeSymbol = '\u00B0';

        //Messages
        String farenheitMessage = Double.toString(farenheitValue) + degreeSymbol + "F";
        String farenheitToCelciusMessage = Double.toString(farenheitToCelciusValue) + degreeSymbol + "C";
        
        //Print Statements
        System.out.println(farenheitMessage + " is " + farenheitToCelciusMessage);
    }
}