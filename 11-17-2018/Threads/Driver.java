class Driver{
    public static void main(String[] args){
        int[] randomIntArray = new int[100000];
        for(int i = 0; i < randomIntArray.length; i++){
            randomIntArray[i] = (int)(Math.random() * 100000 + 1);
        }
        IntegerSorter.bubbleSortIntegerArray(randomIntArray);
        for(int i = 0; i < randomIntArray.length; i++){
            System.out.println(randomIntArray[i]);
        }
    }
}