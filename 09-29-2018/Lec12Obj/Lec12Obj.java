//Name: Jaime Garcia Garcia
//Date: 09-29-2018
//Application: Lecture Object Constr
//Purpose: The application demos the different loops

class Lec12Obj {
    public static void main(String[] args) {
        Car myFirstCar = new Car(1994, "Jeep Cherokie");
        // Car mySecondCar = new Car();
        System.out.println("My car was a " + myFirstCar.getMake() + " From " + myFirstCar.getYear());
    }
}