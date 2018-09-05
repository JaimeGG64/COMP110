//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Circumference of a Circle
//Purpose: The Application use escape character to print the following message

class CelciusToFarenheit {
    public static void main(String[] args) {
        //Number Values
        double farenheitValue = 75;
        final double thirtyTwo  = 32;
        final double fiveOverNine = 5/9;
        double celciusToFarenheitValue = (farenheitValue - thirtyTwo) * fiveOverNine;

        //Special Characters
        char degreeSymbol = '\u00B0';

        //Messages
        String celciusToFarenheitMessage = celciusToFarenheitValue + degreeSymbol + " C is " + farenheitValue + degreeSymbol + "F";
        
        //Print Statements
        System.out.println(celciusToFarenheitMessage);
    }
}