class Driver {

   public static void main(String[] args) {
   
      String name = "Max";      
      Lab myLab = new Lab(name);
      System.out.println("My dogs name is " + myLab.getName());
      System.out.println(name + " barks like this [" + myLab.bark() +"]");
      System.out.println(name + " has an average speed of: " + myLab.getSpeed());
      System.out.println("The color of " + name + " is " + myLab.getColor());
      System.out.println("The size of " + name + " is " + myLab.getSize());
   
   }

}
