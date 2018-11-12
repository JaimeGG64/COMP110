class CheckersBoard{
    public static void main(String[] args){
        // System.out.print("Hi");
        final int BLANK = 0;
        final int WHITE = 1;
        final int BLUE = 2;
        final int SIZE = 8;

        int[][] checkerboard = new int[SIZE][SIZE];

        for(int row = 0; row < checkerboard.length; row++){
            for(int col = 0; col < checkerboard.length; col++){
                checkerboard[row][col] = row + col;
                if(checkerboard[row][col] % 2 == 0 && row < ((SIZE/2) - 1)){
                    System.out.print(WHITE + " ");
                }
                else if(checkerboard[row][col] % 2 == 0 && row > ((SIZE/2))){
                    System.out.print(BLUE + " ");
                }
                else{
                    System.out.print(BLANK + " ");
                }
            }
            System.out.println();
        }
    }
}