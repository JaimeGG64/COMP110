import java.util.Scanner;

class Loops {
    /*

    */
    static void getASCIICharactersViaForLoop() {
        System.out.println("For Loop");
        for (int i = 33; i < 110; i++) {
            char ASCIILoop = (char)i;
            System.out.println("ASCII Number " + i + " - " + ASCIILoop);
        }
    }

    static void getASCIICharactersViaForWhileLoop() {
        System.out.println("While Loop");
        int i = 33;
        while (i < 60) {
            char ASCIILoop = (char)i;
            System.out.println("ASCII Number " + i + " - " + ASCIILoop);

            i++;
        }
    }

    public static void main(String[] args) {
        int userInput = 1;
        
        new userInputScanner = new Scanner(System.in);

        forLoopSelection = userInputScanner.nextInt();
        // if( userInput == 3) {}
        if (userInputScanner == 2) {
            getASCIICharactersViaForWhileLoop();
        }
        else if (userInputScanner == 1) {
            getASCIICharactersViaForLoop();
        }
        // else if (userInput == 0) {}
        // else {}
    }
}