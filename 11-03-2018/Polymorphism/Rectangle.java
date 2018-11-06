/*
Rectangle class inherits members of Shape class
This class has only one method called “getArea”
“getArea” method should return the area of a rectangle
*/
public class Rectangle extends Shape{
    @Override
    public double getArea(){
        return width*height;
    }
}