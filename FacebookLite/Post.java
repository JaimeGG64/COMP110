public class Post implements IDisplayable{
    private Stack posts;
    private boolean isPostsVisible;
    
    public Post() {
        posts = new Stack(5);
    }
    
    public void display() {
        posts.print();
    }
    
    public void toggleVisibility() {
        isPostsVisible = !isPostsVisible;
    }
}