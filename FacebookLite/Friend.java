class Friend implements IDisplayable{
    private Stack friends;
    private boolean isFriendsVisible;
    public Friend(){
        friend = new Stack[5]; //5 for testing
        isFriendsVisible = true;
    }
    public void addFriend(String name){
        friends.push(name);
    }
    public void removeFriends(){
        friends.pop();
    }
    public removeAllFriends(){
        friends.reset();
    }
}