/*
Application shall run forever
The following options shall be available to the user
0 - exit
1 - use of for loop
2 - use of while loop
3 - use of do/while loop
Any other number is invalid (repeat asking the user for input)
Once the user enters a valid loop options (1-3)
Then the application shall ask for a start character Dec. #33-126 (see ASCII table)
Print all the characters from start to finish (last character shall always be Dec. #126)

*/

import java.util.Scanner;

class Loops {
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

        String welcomeMessage = "Please Enter a number \n 0 - Close Program \n 1 - use a for loop \n 2 - use a while loop \n 3 - use a do/while loop \n";

        System.out.print(welcomeMessage);
        
        Scanner userInputScanner = new Scanner(System.in);

        int forLoopSelection = userInputScanner.nextInt();
        // if( userInput == 3) {}
        if (forLoopSelection == 2) {
            getASCIICharactersViaForWhileLoop();
        }
        else if (forLoopSelection == 1) {
            getASCIICharactersViaForLoop();
        }
        else if (forLoopSelection == 0) {
            userInputScanner.close();
        }
        // else {}
    }
}