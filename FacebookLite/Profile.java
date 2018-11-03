class Profile{
    private User user;
    private Friend friends;
    private Post post;

    public Profile(String name, String last, int age){
        user = new User(name,last, age);
        friends = new Friend();
        post = new Post();
    }

    public void printProfile(){
        user.display();
        friends.display();
        post.display();
    }

    public void setStatus(String status){
        user.setStatus(status);
    }

    public void togglePost(){
        p.toggleVisibility();
    }
}