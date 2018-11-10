abstract class Shape{
    public double width;
    public double height;

    public void setSize(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public abstract double getArea();
}