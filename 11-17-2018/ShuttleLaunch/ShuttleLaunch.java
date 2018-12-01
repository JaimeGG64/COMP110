//Name: Jaime Garcia Garcia
//Date: 11-17-2018
//Application: Shuttle Launch
//Purpose: To mimic a shuttle Launch
class ShuttleLaunch{
    final static int SLEEP_TIME_MILLISECONDS = 1000;
    public static void main(String[] args) {
        String shuttleLaunchMessage = "Hello!\nWelcome to the Shuttle Launch!\n";
        int lengthOfCountDown = 11;
        String[] countDownMessage = new String[lengthOfCountDown];
        for(int i = 0; i < countDownMessage.length; i++){
            countDownMessage[i] = "T - " + Integer.toString(i);
        }
        for(int i = 0; i < shuttleLaunchMessage.length(); i++){
            try{
                System.out.print(shuttleLaunchMessage.charAt(i));
                Thread.sleep(SLEEP_TIME_MILLISECONDS/10);
            }
            catch(InterruptedException e){
                System.out.print("Interrupted Exception");
            }
        }
        for(int i = lengthOfCountDown - 1; i >= 0; i--){
            try{
                if(i == 2){
                    System.out.println(countDownMessage[i]);
                    System.out.println("Ignition...");
                    Thread.sleep(SLEEP_TIME_MILLISECONDS);
                }
                else if(i == 0){
                    System.out.println(countDownMessage[i]);
                    System.out.println("We have a liftoff!");
                    Thread.sleep(SLEEP_TIME_MILLISECONDS);
                }
                else{
                    System.out.println(countDownMessage[i]);
                    Thread.sleep(SLEEP_TIME_MILLISECONDS);
                }
            }
            catch(InterruptedException e){
                System.out.print("Interrupted Exception");
            }
        }
    }
}