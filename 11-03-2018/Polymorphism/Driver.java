//Name: Jaime Garcia Garcia
//Date: 6-22-2018
//Application: Shape
//Purpose: To learn about inheritance and abstract class.
class Driver{
    public static void main(String[] args) {
        Shape myRect = new Rectangle();
        myRect.setSize(4,5);
        Shape myTri = new Triangle();
        myTri.setSize(5,3);
        System.out.println(myRect.getArea());
        System.out.println(myTri.getArea());
    }
}