/*
Extend this class 5 times, using a different dog breed (pick your favorite breeds)
Breed #1(Beagle): must use default name and override at least 1 other (different) feature/method
Breed #2(Jindo): must use default bark and override at least 1 other (different) feature/method
Breed #3(Dalmatian): must use default size and override at least 1 other (different) feature/method
Breed #4(Dutch Shepherd): must use default color and override at least 1 other (different) feature/method
Breed #5(Old English Sheepdog): must use default speed and override at least 1 other (different) feature/method

*/
//Note refer to Inherentance
class Driver {
    public static void main(String[] args) {
        
        //Provided by Asadorin
        String name = "Max";
        Lab myLab = new Lab(name);
        System.out.println("My dogs name is " + myLab.getName());
        System.out.println(name + " barks like this [" + myLab.bark() +"]");
        System.out.println(name + " has an average speed of: " + myLab.getSpeed());
        System.out.println("The color of " + name + " is " + myLab.getColor());
        System.out.println("The size of " + name + " is " + myLab.getSize());
   
        //My dog breeds
        Beagle myBeagle = new Beagle();
        System.out.println("My dogs name is " + myBeagle.getName());
        System.out.println(myBeagle.getName() + " barks like this [" + myBeagle.bark() +"]");
        System.out.println(myBeagle.getName() + " has an average speed of: " + myBeagle.getSpeed());
        System.out.println("The color of " + myBeagle.getName() + " is " + myBeagle.getColor());
        System.out.println("The size of " + myBeagle.getName() + " is " + myBeagle.getSize());
    }
}
