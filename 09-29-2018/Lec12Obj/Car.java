public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int year, String m){
        yearModel = year;
        make = m;
        speed = 0;
    }

    public Car(){
        
    }

    //Standard Accessory Methods
    public int getYear() {
        return yearModel;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }

    //Methods
    public void accelerate(){
        speed = speed + 5;
    }

    public void brake(){
        speed = speed - 5;
    }
}