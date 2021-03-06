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
        //Minimum Checker
        int minCheck1 = getMinValue(-1,20);
        int minCheck2 = getMinValue(123,5);
        int minCheck3 = getMinValue(0,5);
        String minCheckerMessage = "The getMinValue() methods gave the following outputs\n" + minCheck1 + "\n" + minCheck2 + "\n" + minCheck3;
        
        //Maximum Checker
        int maxCheck1 = getMaxValue(1234,4533);
        int maxCheck2 = getMaxValue(0,-2);
        int maxCheck3 = getMaxValue(-342,-123);
        String maxCheckerMessage = "The getMaxValue() methods gave the following outputs\n" + maxCheck1 + "\n" + maxCheck2 + "\n" + maxCheck3;
        
        //Odd Checker
        boolean oddcheck1 = isOdd(8);
        boolean oddcheck2 = isOdd(77);
        boolean oddcheck3 = isOdd(21);
        String oddCheckerMessage = "The isOdd() methods gave the following outputs\n" + oddcheck1 + "\n" + oddcheck2 + "\n" + oddcheck3;

        //Even Checker
        boolean evencheck1 = isEven(6);
        boolean evencheck2 = isEven(34567);
        boolean evencheck3 = isEven(0);
        String evenCheckerMessage = "The isEven() methods gave the following outputs\n" + evencheck1 + "\n" + evencheck2 + "\n" + evencheck3;
        
        //Palindrome Checker
        boolean notaPalindrome = isPalindrome("Blue");
        boolean longPalindromeCheck = isPalindrome("tattarrattat");
        boolean palindromecheck = isPalindrome("Anna");
        String palindromeCheckerMessage = "The isPalindrome() methods gave the following outputs\n" + notaPalindrome + "\n" + longPalindromeCheck + "\n" + palindromecheck;
        
        //Character in Checker
        boolean charcheck1 = isCharInString('i',"teamwork");
        boolean charcheck2 = isCharInString('z',"Zoo");
        boolean charcheck3 = isCharInString('d',"dog");
        String charCheckerMessage = "The isCharInString() methods gave the following outputs\n" + charcheck1 + "\n" + charcheck2 + "\n" + charcheck3;
        
        System.out.println(minCheckerMessage);
        System.out.println(maxCheckerMessage);
        System.out.println(oddCheckerMessage);
        System.out.println(evenCheckerMessage);
        System.out.println(palindromeCheckerMessage);
        System.out.println(charCheckerMessage);
    }
}