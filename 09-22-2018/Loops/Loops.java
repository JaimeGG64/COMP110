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
        System.out.println("--- For Loop ---");
        for (int i = 33; i <= 126; i++) {
            char ASCIILoop = (char)i;
            System.out.println("ASCII Number " + i + " - " + ASCIILoop);
        }
        System.out.println("--- End For Loop ---");
    }

    static void getASCIICharactersViaForWhileLoop() {
        System.out.println("--- While Loop ---");
        int i = 33;
        while (i <= 126) {
            char ASCIILoop = (char)i;
            System.out.println("ASCII Number " + i + " - " + ASCIILoop);
            i++;
        }
        System.out.println("--- End While Loop ---");
    }

    static void getASCIICharactersViaDoWhileLoop() {
        System.out.println("--- Do While Loop ---");
        int i = 33;
        do {
            char ASCIILoop = (char)i;
            System.out.println("ASCII Number " + i + " - " + ASCIILoop);
            i++;
        } while(i <= 126);
        System.out.println("--- End Do While Loop ---");
    }

    public static void main(String[] args) {
        // Setting Up
        Scanner userInputScanner = new Scanner(System.in);
        String welcomeMessage = "Please Enter a number \n 0 - Close Program \n 1 - use a for loop \n 2 - use a while loop \n 3 - use a do/while loop";
        int loopSelection;
        
        do {
            System.out.println(welcomeMessage);
            loopSelection = Integer.parseInt(userInputScanner.nextLine());
            
            if (loopSelection == 3) {
                getASCIICharactersViaDoWhileLoop();
            }
            
            else if (loopSelection == 2) {
                getASCIICharactersViaForWhileLoop();
            }
            
            else if (loopSelection == 1) {
                getASCIICharactersViaForLoop();
            }
            
            else if(loopSelection != 0) {
                System.out.println("Please enter a valid number.");
            }
        }
        while(loopSelection != 0);
        userInputScanner.close();
    }
}