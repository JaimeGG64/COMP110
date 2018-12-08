//Name: Jaime Garcia Garcia
//Date: 12-08-2018
//Application: GUI Part 1
//Purpose: Learn about Java Swing.
class Driver{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                MyFirstGUIApp gui = new MyFirstGUIApp();
            }
        });
    }
}