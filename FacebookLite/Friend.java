class Friend implements IDisplayable{
    private Stack friends;
    private boolean isFriendsVisible;

    public Friend(){
        friends = new Stack(5); //5 for testing
        isFriendsVisible = true;
    }
    public void display(){
        if(isFriendsVisible){
            Util.print("Friends: ");
            friends.print();
        }
    }

    public void toggleVisibility(){
        isFriendsVisible = !isFriendsVisible;
    }

    public void addFriend(String name){
        friends.push(name);
    }

    public void removeFriend(){
        friends.pop();
    }
    public void removeAllFriends(){
        friends.reset();
    }
}