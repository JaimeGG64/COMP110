//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Circumference of a Circle
//Purpose: The Application use escape character to print the following message

class CircumferenceOfCircle {
    public static void main(String[] args) {
        //Number Values
        double circleRadius = 3;
        final double PI = 3.14159;
        double circleCircumference = 2*PI*circleRadius;

        //Messages
        String circleRadiusMessage = "The circle radius is: ";
        String circumferenceOfCircleMessage = "The circumference of the circle is: ";

        //Print Statements
        System.out.println(circleRadiusMessage + circleRadius);
        System.out.println(circumferenceOfCircleMessage + circleCircumference);
    }
}