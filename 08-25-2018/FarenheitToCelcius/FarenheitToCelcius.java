//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Circumference of a Circle
//Purpose: The Application use escape character to print the following message

class FarenheitToCelcius {
    public static void main(String[] args) {
        //Number Values
        int farenheitValue = 20;
        final float five  = 5;
        final float nine = 9;
        final float thirtyTwo = 32;
        float farenheitToCelciusValue = (((farenheitValue - thirtyTwo)*five)/nine);

        //Special Characters
        char degree = '\u00B0';

        //Messages
        String farenheitMessage = degree + "F";
        String celciusMessage = degree + "C";
        
        //Print Statements
        System.out.println(farenheitValue + farenheitMessage + " is " + farenheitToCelciusValue + celciusMessage);
    }
}