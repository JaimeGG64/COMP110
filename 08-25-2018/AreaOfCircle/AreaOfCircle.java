//Name: Jaime Garcia Garcia
//Date: 08-25-2018
//Application: Area of a Circle
//Purpose: The Application will calculate the area of a circle

class AreaOfCircle {
    public static void main(String[] args) {
        //Number Values
        double circleRadius = 6;
        final double PI = 3.14159;
        double circleArea = (circleRadius*circleRadius)*PI;

        //Messages
        String circleRadiusMessage = "The circle radius is: ";
        String areaOfCircleMessage = "The area of the circle is: ";

        //Print Statements
        System.out.println(circleRadiusMessage + circleRadius);
        System.out.println(areaOfCircleMessage + circleArea);
    }
}