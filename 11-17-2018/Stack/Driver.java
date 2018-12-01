//Name: Jaime Garcia Garcia
//Date: 11-17-2018
//Application: Stack
//Purpose: To use the stack class
class Driver{
    public static void main(String[] args){
        Stack myStack = new Stack(20);
        System.out.println("Is the stack empty? - " + myStack.isEmpty());
        myStack.pop();
        for(int i = 0; i < 13; i++){
            if(i % 2 == 0){
                myStack.push("Hello - " + Integer.toString(i));
            }
            else{
                myStack.push("Sup - " + Integer.toString(i));
            }
        }
        myStack.search(8);
        myStack.peek();
        System.out.println("Is the stack empty? - " + myStack.isEmpty());
        myStack.pop();
        for(int i = 0; i < 15;i++){
            myStack.pop();
        }
        myStack.print();
        // System.out.println("Is the stack empty? - " + myStack.isEmpty());
    }
}