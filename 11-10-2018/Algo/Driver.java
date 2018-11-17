class Driver{
    public static void main(String[] args) {
        int[] testIntArray = {93, 434, 342, 35, 154};
        String[] testStringArray = {"Jim", "Bob", "Frank", "Randy"};
        String[] sortedString = Algo.bubbleSortStringArray(testStringArray);
        double tempValue = Algo.getAreaOfCircle(23);
        int[] sorted = Algo.bubbleSortIntegerArray(testIntArray);
        int minValue = Algo.getNumberOfOddNumbersInArray(testIntArray);
        System.out.println(tempValue);
        System.out.println(minValue);
        for(int i = 0; i < sortedString.length; i++){
            System.out.println(sortedString[i]);
        }
    }
}