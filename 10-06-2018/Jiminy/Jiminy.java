//Name: Jaime Garcia Garcia
//Date: 10-06-2018
//Application: Jiminy
//Purpose: Jiminy
import java.text.SimpleDateFormat;
import java.util.Date;
public class Jiminy{
    public static void main(String[] args){
        Date getCurrentDateAndTime = new Date();
        String jiminyWelcomeMessage = "Welcome to Jiminy!\n";
        String jiminyExample = "To use the app type\n" + "java Jiminy <options>\n" + "Example: java Jiminy -time\n";
        String[] jiminyMenuOptions = {
            "-date -- displays current date\n",
            "-time -- displays current time\n",
            "-proc -- displays number of available processors\n",
            "-freemem -- displays the amount of free memory\n",
            "-maxmem -- displays the amount of max memory\n",
            "-totmem -- displays the amount of total memory",
        };

        //Builds the list of options into one string
        StringBuilder createOptionList = new StringBuilder();
        for(int countOptions = 0; countOptions < jiminyMenuOptions.length; countOptions++){
            createOptionList.append(jiminyMenuOptions[countOptions]);
        }
        String jiminyCompleteteMenuOptions = createOptionList.toString();
        
        //Jiminy default greeting
        String jiminyCompleteGreeting = jiminyWelcomeMessage + jiminyExample + jiminyCompleteteMenuOptions;
        
        //Check which options the user input
        int i = 0;
        while(i < args.length){
            switch(args[i]){
                case "-date": 
                    SimpleDateFormat todayDate;
                    todayDate = new SimpleDateFormat("MM-dd-yyyy");
                    System.out.println("Date: " + todayDate.format(getCurrentDateAndTime));
                    break;
                case "-time":
                    SimpleDateFormat currentTime;
                    currentTime = new SimpleDateFormat("kk:mm:ss");
                    System.out.println("Time: " + currentTime.format(getCurrentDateAndTime));
                    break;
                case "-proc":
                    int numAvailableProcessors = Runtime.getRuntime().availableProcessors();
                    System.out.println("Available Processors: " + numAvailableProcessors);
                    break;
                case "-freemem":
                    long freeMemory = Runtime.getRuntime().freeMemory();
                    System.out.println("Free Memory: " + freeMemory + " Bytes");
                    break;
                case "-maxmem":
                    long maxMemory = Runtime.getRuntime().maxMemory();
                    System.out.println("Max Memory: " + maxMemory + " Bytes");
                    break;
                case "-totmem":
                    long totalMemory = Runtime.getRuntime().totalMemory();
                    System.out.println("Total Memory: " + totalMemory + " Bytes");
                    break;
                case "-v":
                    System.out.println("version 1.0");
                    break;
                default: System.out.println(jiminyCompleteGreeting);
            }
            i++;
        }
        
        //If the user fails to put any arguments then the app would display the default greeting message
        if(args.length == 0){
            System.out.println(jiminyCompleteGreeting);
        }
    }
}