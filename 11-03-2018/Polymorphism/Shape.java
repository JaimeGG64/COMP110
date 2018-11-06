/* 
Abstract class called “Shape”
declare public member variables
    “width”  of type double
    “height” of type double
declare and implement a method called “setSize”
    2 parameters: “width”, “height” of type double
    This method sets/initializes the member variables width and height
declare an abstract method called “getArea”
    The return type of this method should be double
    No parameters
*/
public abstract class Shape{
    double width, height;

    public abstract double setSize(double width, double height);
    public abstract double getArea();
}