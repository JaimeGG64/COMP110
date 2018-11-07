import java.util.Scanner;
class FacebookLite{
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        /* options
            0 - exit
            1 - create profile
            2 - delete last profile
            3 - switch profile
            4 - print profile
            5 - add friend
            6 - remove last friends
            7 - remove all friends
            8 - add post
            9 - remove last post
            10 - remove all post
            11 - toggle age
            12 - toggle friends
            13 - toggle post
            14 - change status
            15 - delete all profiles
        */
        int optionSelection = Integer.parseInt(userInput.nextLine());
        while(optionSelection != 0){
            // printMenu();
            switch(optionSelection){
                case 0:
                    System.out.println("Bye!");
                    optionSelection = Integer.parseInt(userInput.nextLine());
                    return;
                case 1:
                    System.out.println("Create Profile");
                    optionSelection = Integer.parseInt(userInput.nextLine());
                    break;
                case 2:
                    System.out.println("Wher is your profile");
                    optionSelection = Integer.parseInt(userInput.nextLine());
                    break;
                default:
                    System.out.println("WTF");
                    optionSelection = Integer.parseInt(userInput.nextLine());
                    break;
            }
            // int optionSelection = Integer.parseInt(sc.nextLine());
        }
        userInput.close();
    }
}