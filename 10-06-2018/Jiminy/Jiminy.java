/*
Jiminy
- Assistant app called Jiminy
- App can be used in the terminal (like: date, time, pwd commands in Linux)
- Provide user info (output on the terminal) depending on the arguments given in the command line
- Make use of “String[] args” of the “main” method
- **How should you design your app?**
- If the user doesn’t enter an option (aka. argument), then print a menu showing the available options for your app
- How do I know the user didn’t provide an option?
- HINT: args.length == 0
- Start of with 2 options: “-date” & “-time”
- Use switch case statement to see which option was given by the user
- How do I run/test my app?
- Execute the following in the terminal: 
    “java Jiminy”
    “java Jiminy -date”
    “java Jiminy -time”
    “java Jiminy -date -time”
- Jiminy must support the following options
    -date
    -time
    -proc - Available processors
    -freemem - Free memory
    -maxmem- Maximum memory
    -totmem -Total Memory
*/
//Name: Jaime Garcia Garcia
//Date: 10-06-2018
//Application: Jiminy
//Purpose: Jiminy
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Jiminy{



    public static void main(String[] args){
        // Date getCurrentDateAndTime = new Date();
        // Scanner userInput = new Scanner(System.in);
        Date getCurrentDateAndTime = new Date();
        SimpleDateFormat currentTime;
        SimpleDateFormat todayDate;
        currentTime = new SimpleDateFormat("kk:mm:ss");
        todayDate = new SimpleDateFormat("MM-dd-yyyy");
        
        String[] userOptions = {
            "date",
            "time",
            "proc",
            "freemem",
            "maxmem",
            "totmem"
        };
        
        //Menu
        if(true){
            String jiminyOpitionsMenu = "-date\n" + "-time\n" + "-proc\n" + "-freemem\n" + "-maxmem\n" + "-totmem";
            String jiminyWelcomeMessage = "Welcome to Jiminy!\n";
            String jiminyCompleteGreeting = jiminyWelcomeMessage + jiminyOpitionsMenu;
            System.out.println(jiminyCompleteGreeting);
        }

        //Date
        if(true){
            System.out.println(todayDate.format(getCurrentDateAndTime));
        }
        
        //Time
        if(true){
            System.out.println(currentTime.format(getCurrentDateAndTime));
            
        }

        //CPU
        if(true){
            int processors = Runtime.getRuntime().availableProcessors();
            System.out.println("CPU cores: " + processors);
        }

        //Free Memory
        if(true){
            long freeMemory = Runtime.getRuntime().freeMemory();
            System.out.println("Free Memory: " + freeMemory + " Bytes");
        }

        //Max Memory
        if(true){
            long maxMemory = Runtime.getRuntime().maxMemory();
            System.out.println("Max Memory: " + maxMemory + " Bytes");
        }

        //Total Memory
        if(true){
            long totalMemory = Runtime.getRuntime().totalMemory();
            System.out.println("Total Memory: " + totalMemory + " Bytes");
        }
    }
}