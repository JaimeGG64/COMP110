import java.util.Scanner;
class FacebookLite{
    public static void main(String[] args){
        /*
        Person person1 = new Person("Kenny", "McCormick",10);
        Person person2 = new Person("Butter", "Stotch", 10);
        User user1 = new User("Randy", "March", 42);
        person1.printProfile();
        person2.printProfile();
        user1.printUserProfile();
        System.out.println(person1.getName());
        */
        // private Scanner sc;
        
        private Profile[] profiles;
        private int idx;//index for profiles array
        private int nop;//number of profiles
        private int opt;//option

        public void FacebookLite(){
            profile = new Profile[5];
            sc = new Scanner(System.in);
            idx = -1;
            nop = 0;
        }

        public createProfile(String name, String last, int age){
            if(idx < profiles.length - 1){
                Profile profile = new Profile(name,last,age);
                idx ++;
                profiles[idx] = profile;
                nop++;
            }
            else{
                Util.print("No room to create profile");
            }
        }

        FacebookLite fbl = new FacebookLite();

        while(true){
            printMenu();
            opt = Integer.parseInt(sc.nextLine());
            switch(opt){
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
                case 0:
                    Util.print("Bye!");
                    return;
                case 1:
                    System.out.print("Please enter name");
                    String name = sc.nextLine();
                    System.out.print("Please enter last name");
                    String last = sc.nextLine();
                    int age = Integer.parseInt(sc.nextLine());
                    fbl.createProfile(name, last, age);
                    break;
                case 2:
                    if(fbl.nop == 0){
                        Util.print("Create profile first");
                    }
                    else{
                        fbl.removeLastProfile();
                    }
                    break;
            }
        }
    }
}