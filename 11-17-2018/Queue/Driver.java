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
        Stack myStack = new Stack(15);
        System.out.println("Is the stack empty? - " + myStack.isEmpty());
        myStack.pop();
        
        myStack.push("Sup");
        myStack.push("Good Day");
        myStack.push("Good morrow");
        myStack.push("Konichiwa");
        myStack.push("Hola");
        myStack.push("Hey");
        myStack.push("Hello");
        myStack.push("Good Morning");
        System.out.println("************************");
        myStack.search(10);
        myStack.peek();
        // myStack.print();
        // System.out.print(myStack);
    }
}