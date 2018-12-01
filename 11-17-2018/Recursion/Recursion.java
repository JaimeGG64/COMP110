
class Recursion{
    public static int simpleRecursion(int n) {    
        if(1 == n) {
            return n;
        }
        return simpleRecursion(n-1);
    }
    
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n*factorial(n -1);
    }
    public static int fib(int n){
        if(n <= 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args){
        int simpleRecursionTest1 = simpleRecursion(20);
        int simpleRecursionTest2 = simpleRecursion(7);
        int simpleRecursionTest3 = simpleRecursion(4);

        System.out.println("Simple Recursion method test: " + simpleRecursionTest1 + " " + simpleRecursionTest2 + " " + simpleRecursionTest3);
        
        int factorialTest1 = factorial(20);
        int factorialTest2 = factorial(7);
        int factorialTest3 = factorial(-2);

        System.out.println("Factorial method test: " + factorialTest1 + " " + factorialTest2 + " " + factorialTest3);
        
        int fibTest1 = fib(20);
        int fibTest2 = fib(7);
        int fibTest3 = fib(-2);

        System.out.println("Fibonacci method test: " + fibTest1 + " " + fibTest2 + " " + fibTest3);
    }
    
}