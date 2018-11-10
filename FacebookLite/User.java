class User extends Person implements IDisplayable{
    private String status;
    private boolean isAgeVisible;

    public User(String name,String last, int age){
        super(name,last,age);   
        status = "What are you doing today?";
        isAgeVisible = true;
    }
    public void display(){
        System.out.println("Name:" + getName() + " " + getLast());
        // System.out.println("Status:" + status);
        if(isAgeVisible){
            System.out.print("Age:" + getAge());
        }
    }
    public void toggleAgeVisible(){
        isAgeVisible =! isAgeVisible;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}