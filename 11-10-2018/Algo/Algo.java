/*
    **Consolidate all in one class called: Algo.java (write a Driver and call/test each algo)**
    Fahrenheit to Celsius
    Celsius to Fahrenheit
    AreaOfCircle
    CircumferenceOfCircle
    Max value in array (int, array)
    Min value in array (int, array)
    # of Even #s in array (int, array)
    # of Odd #s in array  (int, array)
    Palindrome
    Is char in String
    First repeating char in String
    Last repeating char in String
    First non-repeating char in String
    Count digits in String[]
    Count even numbers in String[]
    Reverse array
    Reverse String
    String split using any delemiter (String, delim) (returns a String[])
    Bubble sort int[]
    Bubble sort String[]
    Prime number
    --Extra Note--
    DO NOT USE SCANNER
    3 test cases per method
*/
class Algo{
    public static double getFahrenheitToCelsius(double farhrenheit) {
        double celsius = ((farhrenheit - 32) * 5)/9;
        return celsius;
    }
}