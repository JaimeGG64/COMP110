class IntegerSorter {
    private int[] arrayOfInt;
    private int maxNumber;

    public void arrayOfInt(int arrayOfInt[]){
        this.arrayOfInt = arrayOfInt;
    }

    public int[] getArray(){
        return arrayOfInt;
    }

    public int[] generate(int arrayOfInt[], int maxNumber){
        arrayOfInt = new int[maxNumber];
        for(int i = 0; i < arrayOfInt.length; i++){
            arrayOfInt[i] = (int)(Math.random() * maxNumber + 1);
        }
        return arrayOfInt;
    }

    public int[] sort(int arrayOfInt[]){
        for(int i = 0; i < arrayOfInt.length - 1; i++){
            for(int j = 0; j < arrayOfInt.length - i - 1; j++){
                if(arrayOfInt[j] > arrayOfInt[j + 1]){
                    int temporaryLargeNumber = arrayOfInt[j];
                    arrayOfInt[j] = arrayOfInt[j + 1];
                    arrayOfInt[j + 1] = temporaryLargeNumber;
                }
            }
        }
        return arrayOfInt;
    }
}