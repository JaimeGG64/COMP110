class Person{
    private String name;
    private String last;
    private int age;

    public Person(String name, String last, int age){
        this.name = name;
        this.last = last;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }
}