class ShuttleLaunch{
    final static int SLEEP_TIME_MILLISECONDS = 1000;
    public static void main(String[] args) {
        String shuttleLaunchMessage = "Hello!\nWelcome to the Shuttle Launch!\n";
        int[] countDown = new int[10];
        for(int i = 0; i < shuttleLaunchMessage.length(); i++){
            try{
                System.out.print(shuttleLaunchMessage.charAt(i));
                Thread.sleep(SLEEP_TIME_MILLISECONDS/10);
            }
            catch(InterruptedException e){
                System.out.print("Interrupted Exception");
            }
        }
    }
}