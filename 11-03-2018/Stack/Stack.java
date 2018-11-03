public class Stack{
    private int SIZE;
    private int top;
    private String[] Stack;

    public Stack(int size){
        this.size = size;
        Stack = new String[size];
        top = -1;
    }

    //Checks for status of the array
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == SIZE-1);
    }

    public void push(String item){
        if(isFull()){
            System.out.print("Is Full");
        }
        top++;
        Stack[top] = item;
        // return stack[top--];
    }

    public void pop(String item){
        if(isEmpty()){
            System.out.print("It Empty");
            return;
        }
        System.out.print("I poping the following item" + stack[top--]);
        return stack[top--];
        
    }
}