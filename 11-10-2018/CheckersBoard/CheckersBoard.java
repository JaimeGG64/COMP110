class CheckersBoard{
    public static void main(String[] args){
        // System.out.print("Hi");
        final int BLANK = 0;
        final int WHITE = 1;
        final int BLUE = 2;
        final int SIZE = 5;

        int[][] checkerboard = new int[SIZE][SIZE];

        for(int row = 0; row < checkerboard.length; row++){
            for(int col = 0; col < checkerboard.length; col++){
                checkerboard[row][col] = row + col;
                System.out.print(checkerboard[row][col] + "  ");
            }
            System.out.println();
        }
    }
}