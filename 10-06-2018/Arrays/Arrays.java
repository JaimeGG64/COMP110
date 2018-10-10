/*
sumOfAnArray() - static method which sums up all the elements (integers) in an array
maxValueInArray() - static method which returns the max value in an array of integers 
isStringInArray() - static method which returns true if a string exists in an array, false otherwise
Call each method 3 times from main (provide different arguments each time)
*/
//Name: Jaime Garcia Garcia
//Date: 10-06-2018
//Application: Arrays
//Purpose: Using methods and Arrays
class Arrays{
    public static int sumOfArray(int[] a){     
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static int maxValueInArray(int[] a){
        int max = 0;
        for(int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i]; 
            }
        }
        return max;
    }

    public static boolean isStringInArray(String wordtoFind, String[] stringArray){
        for(int i = 0; i < stringArray.length; i++){
            if(stringArray[i].equals(wordtoFind)){
              return true;  
            } 
        }
        return false;
    }    

    public static void main(String[] args){
        int[] intArray = new int[6];
        intArray[0] = 0;
        intArray[1] = 2;
        intArray[2] = 54;
        intArray[3] = 22;
        intArray[4] = 125;
        intArray[5] = 8;

        int[] someNumbers = {
            34,
            3425,
            254,
            252,
            342
        };

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

        boolean wordcheck = isStringInArray("bird", pets);
        System.out.println(wordcheck);

        System.out.println(intArray[3]);
        System.out.println(shoppingList[4]);

        System.out.println(pets[1]);
        System.out.println(someNumbers[2]);

        int sumnum = sumOfArray(intArray);

        int maxInt = maxValueInArray(intArray);

        System.out.println(sumnum);
        System.out.println(maxInt);
    }
}
