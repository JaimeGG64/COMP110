import java.util.Scanner;
class FacebookLite{
    private Scanner sc;
    private Profile[] profiles;
    private int idx; //index for profiles array
    private int nop; //number of profiles
    private int opt; //option
    
    public FacebookLite() {
        sc = new Scanner(System.in);
        idx = -1;
        nop = 0;
        profiles = new Profile[5];
    }
    public void createProfile(String fname,String lname,int age) {
        if(idx < profiles.length-1) {
            Profile profile = new Profile(fname,lname,age);
            idx++;
            profiles[idx] = profile;
            nop++;
            Util.print("Profile created!\n");
        }
        else {
            Util.print("No room to create a new profile\n");
        }
    }

    public void deleteProfile(){
        if(idx < 0){
            System.out.println("You need a profile");
            return;
        }
        System.out.println("Profile deleted: " + profiles[idx].getUser().getFullName());
        profiles[idx] = null;
        idx--;
        nop--;
    }
    public static void main(String[] args){
        
        FacebookLite fbl = new FacebookLite();
        
        while(true) {
            Util.print("Welcome to Facebook Lite!\n\n0-------------------Exit\n1---------Create profile\n2----Delete last profile\n3---------Switch profile\n4----------Print profile\n5-------------Add friend\n6-----Remove last friend\n7-----Remove all friends\n8---------------Add post\n9-------Remove last post\n10------Remove all posts\n11------------Toggle age\n12--------Toggle friends\n13----------Toggle posts\n14---------Change status\n15---Delete all profiles");
            fbl.opt = Integer.parseInt(fbl.sc.nextLine());
            switch(fbl.opt) {
                case 0: //exit
                Util.print("Goodbye");
                return;
                case 1: //create profile
                    Util.print("Please enter your first name");
                    String name = fbl.sc.nextLine();
                    Util.print("Please enter your last name");
                    String last = fbl.sc.nextLine();
                    Util.print("Please enter your age");
                    int age = Integer.parseInt(fbl.sc.nextLine());
                    fbl.createProfile(name,last,age);
                break;
                case 2: //delete last profile
                    fbl.deleteProfile();
                break;
                case 3:  //switch profiles
                break;
                case 4:  //print profile
                break;
                case 5:  //add friend
                break;
                case 6:  //remove last friend
                break;
                case 7:  //remove all friends
                break;
                case 8:  //add post
                break;
                case 9:  //remove last post
                break;
                case 10: //remove all posts
                break;
                case 11: //toggle age
                break;
                case 12: //toggle friends
                break;
                case 13: //toggle posts
                break;
                case 14: //change status
                break;
                case 15: //delete all profiles
                break;
            }
        }
    }
}