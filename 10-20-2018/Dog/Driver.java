//Name: Jaime Garcia Garcia
//Date: 10-06-2018
//Application: Inheritance
//Purpose: To learn about inheritance in the Java langauge

class Driver {
    public static void lineDivider(){
        int maxLine = 50;
        int i = 0;
        while(i <= maxLine){
            if(i == maxLine){
                System.out.print("\n");
            }
            else{
                System.out.print("-");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        //Given Code
        String name = "Max";
        Lab myLab = new Lab(name);
        System.out.println("My dogs name is " + myLab.getName());
        System.out.println(name + " barks like this [" + myLab.bark() +"]");
        System.out.println(name + " has an average speed of: " + myLab.getSpeed());
        System.out.println("The color of " + name + " is " + myLab.getColor());
        System.out.println("The size of " + name + " is " + myLab.getSize());

        lineDivider();

        //Breed #1
        Beagle myBeagle = new Beagle();
        System.out.println("My dogs name is " + myBeagle.getName());
        System.out.println(myBeagle.getName() + " barks like this [" + myBeagle.bark() +"]");
        System.out.println(myBeagle.getName() + " has an average speed of: " + myBeagle.getSpeed());
        System.out.println("The color of " + myBeagle.getName() + " is " + myBeagle.getColor());
        System.out.println("The size of " + myBeagle.getName() + " is " + myBeagle.getSize());
        lineDivider();

        //Breed #2
        Jindo myJindo = new Jindo();
        System.out.println("My dogs name is " + myJindo.getName());
        System.out.println(myJindo.getName() + " barks like this [" + myJindo.bark() +"]");
        System.out.println(myJindo.getName() + " has an average speed of: " + myJindo.getSpeed());
        System.out.println("The color of " + myJindo.getName() + " is " + myJindo.getColor());
        System.out.println("The size of " + myJindo.getName() + " is " + myJindo.getSize());
        lineDivider();

        //Breed #3
        Dalmatian myDalmatian = new Dalmatian();
        System.out.println("My dogs name is " + myDalmatian.getName());
        System.out.println(myDalmatian.getName() + " barks like this [" + myDalmatian.bark() +"]");
        System.out.println(myDalmatian.getName() + " has an average speed of: " + myDalmatian.getSpeed());
        System.out.println("The color of " + myDalmatian.getName() + " is " + myDalmatian.getColor());
        System.out.println("The size of " + myDalmatian.getName() + " is " + myDalmatian.getSize());
        lineDivider();

        //Breed #4
        OldEnglishSheepdog myOldEnglishSheepdog = new OldEnglishSheepdog();
        System.out.println("My dogs name is " + myOldEnglishSheepdog.getName());
        System.out.println(myOldEnglishSheepdog.getName() + " barks like this [" + myOldEnglishSheepdog.bark() +"]");
        System.out.println(myOldEnglishSheepdog.getName() + " has an average speed of: " + myOldEnglishSheepdog.getSpeed());
        System.out.println("The color of " + myOldEnglishSheepdog.getName() + " is " + myOldEnglishSheepdog.getColor());
        System.out.println("The size of " + myOldEnglishSheepdog.getName() + " is " + myOldEnglishSheepdog.getSize());
        lineDivider();
        
        //Breed #5
        DutchShepherd myDutchShepherd = new DutchShepherd("Steve");
        System.out.println("My dogs name is " + myDutchShepherd.getName());
        System.out.println(myDutchShepherd.getName() + " barks like this [" + myDutchShepherd.bark() +"]");
        System.out.println(myDutchShepherd.getName() + " has an average speed of: " + myDutchShepherd.getSpeed());
        System.out.println("The color of " + myDutchShepherd.getName() + " is " + myDutchShepherd.getColor());
        System.out.println("The size of " + myDutchShepherd.getName() + " is " + myDutchShepherd.getSize());
        lineDivider();
    }
}
