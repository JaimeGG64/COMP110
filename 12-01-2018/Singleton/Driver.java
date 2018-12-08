//Name: Jaime Garcia Garcia
//Date: 12-08-2018
//Application: Singleton
//Purpose: Learn about the Singleton Pattern
class Driver {
    public static void main(String[] args) {
        Singleton sObj1;
        sObj1 = Singleton.getInstance();
        sObj1.setValue(5);
        Singleton sObj2 = Singleton.getInstance();
        sObj2.setValue(70);

        System.out.println(sObj1.getValue());
        System.out.println(sObj2.getValue());
    }
}