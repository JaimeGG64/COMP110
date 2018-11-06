/*
Triangle class inherits members of Shape class
This class has only one method called “getArea”
“getArea” method should return the area of a triangle
*/
class Triangle extends Shape{
    public double getArea(){
        return ((width*height)/2);
    }
}