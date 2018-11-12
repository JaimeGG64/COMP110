/*
    **Drive must look like this**
    public static void main(String[] args) {
        IO io = new IO();
        io.read();
        io.sort();
        io.write();
    }
*/
class Driver{
    public static void main(String[] args){
        int myIntArr[] = {23, 232, 342, 2, 535};
        char ASCIICH = 121;
        System.out.println("Hi");
        System.out.println(ASCIICH);
        Sort mySort = new Sort();
        Sort.bubbleSort(myIntArr);
        Sort.printArray(myIntArr);
    }
}