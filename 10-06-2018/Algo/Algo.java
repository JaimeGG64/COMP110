/*
-min
-max
-odd
-even 
-palindrome 
-find if char exists in a string (returns a boolean)
-All methods discussed in class (Slide #3)
-Call each method 3 times from `main` providing different arguments each time
*/
//Name: Jaime Garcia Garcia
//Date: 10-06-2018
//Application: Algo
//Purpose: Using methods
class Algo{
    public static int getMinValue(int numberInput1, int numberInput2){
        if(numberInput1 < numberInput2){
            return numberInput1;
        }
        return numberInput2;
    }

    public static int getMaxValue(int numberInput1, int numberInput2){
        if(numberInput1 > numberInput2){
            return numberInput1;
        }
        return numberInput2;
    }

    public static boolean isOdd(int number){
        if(number % 2 != 0){
            return true;
        }
        return false;
    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

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

    public static boolean isCharInString(char characterToCheck, String word){
        for(int i = 0 ; i < word.length();i++){
            if(word.charAt(i) == characterToCheck){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int agecheck = getMinValue(3,4);
        boolean oddcheck = isOdd(77);
        boolean palindromecheck = isPalindrome("anna");
        boolean charcheck = isCharInString('z',"hell");
        System.out.println(agecheck);
        System.out.println(oddcheck);
        System.out.println(palindromecheck);
        System.out.println(charcheck);
    }
}