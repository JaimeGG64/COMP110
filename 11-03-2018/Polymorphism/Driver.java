/*
main method
Declare/init a new object of type Triangle
Declare/init a new object of type Rectangle

Declare an object of type Shape and assign it to the the triangle object
Using the Shape object, call setSize method providing arguments width/height

Reassign the shape object to the rectangle object
Using the Shape object, call setSize method providing arguments width/height

Using the triangle object, print out the area of the triangle by calling getArea()
Using the rectangle object, print out the area of the rectangle by calling getArea()
*/
class Driver{
    public static void main(String[] args) {
        // System.out.print("Hi");
        Shape findRect = new Rectangle();
        findRect.setSize(4,5);
        System.out.println(findRect.getArea());
    }
}