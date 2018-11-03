class FacebookLite{
    public static void main(String[] args){
        Person person1 = new Person("Kenny", "McCormick",10);
        Person person2 = new Person("Butter", "Stotch", 10);
        User user1 = new User("Randy", "March", 42);
        person1.printProfile();
        person2.printProfile();
        user1.printUserProfile();
        System.out.println(person1.getName());
    }
}