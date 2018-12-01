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
            System.out.println("Is Full");
        }
        else{
            stack[++top] = item;
        }
    }

    public void search(int item){
        if(top >= item){
            System.out.println(stack[item]);
        }
        else{
            System.out.println("item not found");
        }
    }

    public void peek(){
        System.out.println(stack[top]);
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("It Empty");
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
            System.out.println(stack[i]);
        }
    }
}