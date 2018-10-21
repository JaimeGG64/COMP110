/*
-Extend this class 5 times, using a different dog breed (pick your favorite breeds)
-Breed #1(Beagle): must use default name and override at least 1 other (different) feature/method
-Breed #2(Jindo): must use default bark and override at least 1 other (different) feature/method
-Breed #3(Dalmatian): must use default size and override at least 1 other (different) feature/method
-Breed #4(Old English Sheepdog): must use default color and override at least 1 other (different) feature/method
-Breed #5(Dutch Shepherd): must use default speed and override at least 1 other (different) feature/method

*/
//Note refer to Inherentance
class Driver {
    public static void main(String[] args) {
        String name = "Max";
        Lab myLab = new Lab(name);
        System.out.println("My dogs name is " + myLab.getName());
        System.out.println(name + " barks like this [" + myLab.bark() +"]");
        System.out.println(name + " has an average speed of: " + myLab.getSpeed());
        System.out.println("The color of " + name + " is " + myLab.getColor());
        System.out.println("The size of " + name + " is " + myLab.getSize());
        
        // for(int i = 0; i < 50; i++){
        //     System.out.print("-");
        // }

        //My dog breeds
        Beagle myBeagle = new Beagle();
        System.out.println("My dogs name is " + myBeagle.getName());
        System.out.println(myBeagle.getName() + " barks like this [" + myBeagle.bark() +"]");
        System.out.println(myBeagle.getName() + " has an average speed of: " + myBeagle.getSpeed());
        System.out.println("The color of " + myBeagle.getName() + " is " + myBeagle.getColor());
        System.out.println("The size of " + myBeagle.getName() + " is " + myBeagle.getSize());

        Jindo myJindo = new Jindo();
        System.out.println("My dogs name is " + myJindo.getName());
        System.out.println(myJindo.getName() + " barks like this [" + myJindo.bark() +"]");
        System.out.println(myJindo.getName() + " has an average speed of: " + myJindo.getSpeed());
        System.out.println("The color of " + myJindo.getName() + " is " + myJindo.getColor());
        System.out.println("The size of " + myJindo.getName() + " is " + myJindo.getSize());

        Dalmatian myDalmatian = new Dalmatian();
        System.out.println("My dogs name is " + myDalmatian.getName());
        System.out.println(myDalmatian.getName() + " barks like this [" + myDalmatian.bark() +"]");
        System.out.println(myDalmatian.getName() + " has an average speed of: " + myDalmatian.getSpeed());
        System.out.println("The color of " + myDalmatian.getName() + " is " + myDalmatian.getColor());
        System.out.println("The size of " + myDalmatian.getName() + " is " + myDalmatian.getSize());
    }
}
