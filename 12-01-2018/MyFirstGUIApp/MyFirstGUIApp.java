import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstGUIApp{
    //constructor
    public MyFirstGUIApp(){
        initComponents();
    }
    private void initComponents(){
        JFrame frame = new JFrame("GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}