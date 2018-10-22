//Name: Jaime Garcia Garcia
//Date: 09-29-2018
//Application: Lecture Object Constr
//Purpose: Learn how to use object constructor

class Lec12Obj {
    public static void main(String[] args) {
        Car myFirstCar = new Car(1994, "Jeep Cherokie");
        // Car mySecondCar = new Car();
        System.out.println("My car was a " + myFirstCar.getMake() + " From " + myFirstCar.getYear());
    }
}