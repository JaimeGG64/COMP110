class User extends Person{
    // @Override
    public User(String name,String last, int age){
        super(name,last,age);   
    }

    public void printUserProfile(){
        String status = "Happy";
        System.out.println("Name:" + getName());
        System.out.println("Status:" + status);
    }
}