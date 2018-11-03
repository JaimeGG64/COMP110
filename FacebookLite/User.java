class User extends Person implements IDisplayable{
    /*
    public void printUserProfile(){
        String status = "Happy";
        System.out.println("Name:" + getName());
        System.out.println("Status:" + status);
    }*/
    private String status;
    private boolean isAgeVisible;

    public User(String name,String last, int age){
        super(name,last,age);   
        status = "what are you doing today";
        isAgeVisiable = true;
    }
    public void display(){
        System.out.println("Name:" + getName());
        System.out.println("Status:" + status);
        if(isAgeVisible){
            System.out.print("Age:" + getAge());
        }
    }
    public void toggleAgeVisible(){
        isAgeVisible =! isAgeVisible;
    }
}