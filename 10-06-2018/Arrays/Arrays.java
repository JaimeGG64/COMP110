//Name: Jaime Garcia Garcia
//Date: 10-06-2018
//Application: Arrays
//Purpose: Using methods and Arrays
class Arrays{
    public static int sumOfArray(int[] arrayOfInteger){     
        int sum = 0;
        for(int i = 0; i < arrayOfInteger.length; i++){
            sum += arrayOfInteger[i];
        }
        return sum;
    }

    public static int maxValueInArray(int[] arrayOfInteger){
        int max = 0;
        for(int i = 1; i < arrayOfInteger.length; i++){
            if (arrayOfInteger[i] > max){
                max = arrayOfInteger[i]; 
            }
        }
        return max;
    }

    public static boolean isStringInArray(String wordToFind, String[] arrayOfString){
        for(int i = 0; i < arrayOfString.length; i++){
            if(arrayOfString[i].equals(wordToFind)){
              return true;  
            } 
        }
        return false;
    }    

    public static void main(String[] args){
        //Integer Arrays
        int[] randomNumbers = new int[6];
        randomNumbers[0] = 0;
        randomNumbers[1] = 2;
        randomNumbers[2] = 54;
        randomNumbers[3] = 22;
        randomNumbers[4] = -125;
        randomNumbers[5] = 8;

        int[] fibonacciNumbers = {
            1,
            2,
            3,
            5,
            8,
            13,
            21
        };

        int[] eightBitNumbers = {0,1,2,4,16,32,64,128,256};

        //String Arrays
        String[] pets = new String[3];
        pets[0] = "dog";
        pets[1] = "cat";
        pets[2] = "fish";

        String[] shoppingList = {
            "eggs",
            "milk",
            "cheese",
            "bread",
            "ham"
        };

        String[] SouthParkCharacters = {"Kenny", "Stan", "Kyle", "Cartman" ,"Butters", "Wendy", "Token", "Mr. Garison"};

        int sumRandomNumbers = sumOfArray(randomNumbers);
        int sumFibonacciNumbers = sumOfArray(fibonacciNumbers);
        int sumEightBitNumbers = sumOfArray(eightBitNumbers);
        String sumOfArrayMessage = "The sumOfArray() method Gave the following outputs\n" + sumRandomNumbers + "\n" + sumFibonacciNumbers + "\n" + sumEightBitNumbers;

        int maxRandomNumbers = maxValueInArray(randomNumbers);
        int maxFibonacciNumbers = maxValueInArray(fibonacciNumbers);
        int maxEightBitNumbers = maxValueInArray(eightBitNumbers);
        String maxValueInArrayMessage = "The maxValueInArray() method Gave the following outputs\n" + maxRandomNumbers + "\n" + maxFibonacciNumbers + "\n" + maxEightBitNumbers;

        boolean checkPets = isStringInArray("cats", pets);
        boolean checkShoppingList = isStringInArray("milk", shoppingList);
        boolean checkSouthParkCharacters = isStringInArray("Fry", SouthParkCharacters);
        String isStringInArrayMessage = "The isStringInArray() method Gave the following outputs\n" + checkPets + "\n" + checkShoppingList + "\n" + checkSouthParkCharacters;

        System.out.println(sumOfArrayMessage);
        System.out.println(maxValueInArrayMessage);
        System.out.println(isStringInArrayMessage);
    }
}
