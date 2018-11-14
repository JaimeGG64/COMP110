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

    public static double getCelsiusToFahrenheit(double celsius) {
        double farhrenheit = ((9 * celsius)/5) + 32;
        return farhrenheit;
    }

    public static double getAreaOfCircle(double radius){
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        return areaOfCircle;
    }

    static double getCircumferenceOfCircle(double radius) {
        double circumferenceOfCircle = 2 * Math.PI * radius;
        return circumferenceOfCircle;
    }
    // Max value in array (int, array)
    static int getMaxValueInArray(int[] arrayOfInteger){
        int max = 0;
        for(int i = 1; i < arrayOfInteger.length; i++){
            if(arrayOfInteger[i] > max){
                max = arrayOfInteger[i];
            }
        }
        return max;
    }

    // Min value in array (int, array)
    static int getMinValueInArray(int[] arrayOfInteger){
        int min = arrayOfInteger[0];
        for(int i = 1; i < arrayOfInteger.length; i++){
            if(arrayOfInteger[i] < min){
                min = arrayOfInteger[i];
            }
        }
        return min;
    }

    // # of Even #s in array (int, array)
    static int getNumberOfEvenNumbersInArray(int[] arrayOfInteger){
        int counter = 0;
        for(int i = 0; i < arrayOfInteger.length; i++){
            if(arrayOfInteger[i]%2 == 0){
                counter += 1;
            }
        }
        return counter;
    }

    // # of Odd #s in array  (int, array)
    static int getNumberOfOddNumbersInArray(int[] arrayOfInteger){
        int counter = 0;
        for(int i = 0; i < arrayOfInteger.length; i++){
            if(arrayOfInteger[i]%2 != 0){
                counter += 1;
            }
        }
        return counter;
    }

    // Palindrome
    public static boolean isPalindrome(String word){
        int begin = 0;
        int end = word.length() - 1;
        while(begin < end) {
            if(word.charAt(begin) != word.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    // Is char in String
    public static boolean isCharInString(char characterToCheck, String word){
        for(int i = 0 ; i < word.length();i++){
            if(word.charAt(i) == characterToCheck){
                return true;
            }
        }
        return false;
    }

    // First repeating char in String
    // Last repeating char in String
    // First non-repeating char in String
    // Count digits in String[]
    // Count even numbers in String[]
    // Reverse array
    // Reverse String
    // String split using any delemiter (String, delim) (returns a String[])
    // Bubble sort int[]
    // Bubble sort String[]
    // Prime number
}