
class Recursion{
    static void preDecrementMethod(int n){
        if(1 == n){
            return;
        }
        preDecrementMethod(--n);
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
        int test = 20;
        fib(20);
        System.out.println(factorial(20));
        
        // System.out.print(test);
    }
    
}