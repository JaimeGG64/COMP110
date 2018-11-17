class Driver{
    public static void main(String[] args) {
        int[] testArray = {93, 434, 342, 35, 154};
        double tempValue = Algo.getAreaOfCircle(23);
        int[] sorted = Algo.bubbleSortIntegerArray(testArray);
        int minValue = Algo.getNumberOfOddNumbersInArray(testArray);
        System.out.println(tempValue);
        System.out.println(minValue);
        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }
}