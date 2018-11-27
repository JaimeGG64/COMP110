/*
Create a new object of type Stack and perform the following operations
isEmpty()
pop()
push(...) 13 items (yes, 13)
search(...)
peek()
pop()
peek()
isEmpty()
pop() 15 times (yes, 15)
*/
class Driver{
    public static void main(String[] args){
        Stack myStack = new Stack(10);
        myStack.print();
    }
}