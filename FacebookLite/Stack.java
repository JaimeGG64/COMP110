public class Stack{
    private int size;
    private int top; //master index
    private String[] stack;

    public Stack(int size){
        this.size = size;
        stack = new String[size];
        top = -1;
    }
    public int getSize(){
        return size;
    }

    //Checks for status of the array
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == size - 1);
    }

    public void push(String item){
        if(isFull()){
            Util.print("Is Full");
        }
        else{
            stack[++top] = item;
        }
    }

    public String pop(){
        if(isEmpty()){
            Util.print("It Empty");
            return "";
        }
        else{
            return stack[top--];
        }        
    }

    public void reset(){
        for(int i = 0; i < getSize(); i++){
            stack[i] = "";
        }
        top =- 1;
    }

    public void print(){
        for(int i = 0; i < getSize(); i++){
            Util.print(stack[i]);
        }
    }
}