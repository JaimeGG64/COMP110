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

    public static void main(String[] args){
        int[] intArray = new int[6];

        intArray[0] = 45;
        intArray[1] = 2;
        intArray[2] = 54;
        intArray[3] = 22;
        intArray[4] = 24;
        intArray[5] = 8;

        System.out.println(intArray[3]);

        int sumnum = sumOfArray(intArray);
        System.out.println(sumnum);
    }
}
