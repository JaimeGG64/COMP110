import javax.swing.JFrame;
import javax.swing.JLabel;

//Menu Bar
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MyFirstGUIApp{
    //constructor
    public MyFirstGUIApp(){
        initComponents();
    }
    private void initComponents(){
        //give title to GUI window
        JFrame frame = new JFrame("GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add labe to GUI
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        //build menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem aboutItem = new JMenuItem("About");
        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        
        //Show GUI
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setVisible(true);
    }
}