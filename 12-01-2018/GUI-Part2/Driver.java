//Name: Jaime Garcia Garcia
//Date: 12-08-2018
//Application: GUI Part 2
//Purpose: Learn about Java Swing.
import javax.swing.SwingUtilities;

class Driver{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                GUIApp gui = new GUIApp();
            }
        });
    }
}