public abstract class Person{
    private String name;
    private String last;
    private int age;
    // private boolean showAge;

    public Person(String name, String last, int age){
        this.name = name;
        this.last = last;
        this.age = age;
    }
    
    //getters
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    public String getLast(){
        return last;
    }

    public String getFullName(){
        return name + " " + last;
    }
    
    //setter
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLast(String last){
        this.last = last;
    }
    

    // public void printProfile(){
    //     System.out.println("Name: " + name);
    //     System.out.println("Last: " + last);
    //     System.out.println("Age: " + age);
    // }
}