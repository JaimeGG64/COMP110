import javax.swing.JFrame;
import javax.swing.JLabel;

//Menu Bar
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

//Side Pane
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

//Menu Item Listeners
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class GUIApp{
    //Member Variables
    private JFrame frame;
    private JDesktopPane desktop;
    private JScrollPane scrollPane;
    private JLabel statusLabel;
    private JPanel panel;
    private JPanel labelPanel;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu helpMenu;
    private JMenuItem exitItem;
    private JMenuItem aboutItem;
    private JSplitPane splitPane;

    //constructor
    public GUIApp(){
        initComponents();
        statusLabel.setText("Initialization complete.");
    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName()
            );
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void buildDesktop(){
        desktop = new JDesktopPane();
    }

    private void buildMenu(){
        //build menu
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        exitItem = new JMenuItem("Exit");
        aboutItem = new JMenuItem("About");
        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
    }

    private void buildPane(){
        panel = new JPanel();
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        scrollPane = new JScrollPane();
        statusLabel = new JLabel();
        labelPanel = new JPanel();

        //Set border, size and layout
        statusLabel.setBorder(BorderFactory.createLoweredBevelBorder());
        statusLabel.setMinimumSize(new Dimension(0,18));
        statusLabel.setPreferredSize(new Dimension(0,18));

        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(200);
        splitPane.setContinuousLayout(true);
        splitPane.add(desktop, JSplitPane.RIGHT);
        splitPane.add(scrollPane, JSplitPane.LEFT);

        panel.setLayout(new BorderLayout());
        panel.add(splitPane, BorderLayout.CENTER);

        labelPanel.add(statusLabel, BorderLayout.CENTER);
        labelPanel.setLayout(new BorderLayout());
    }

    private void buildFrame(){
        frame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.getContentPane().add(labelPanel, BorderLayout.SOUTH);
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        //Show GUI
        frame.setSize(740,540);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }

    private void initComponents(){
        setLookAndFeel();
        buildDesktop();
        buildMenu();
        addMenuListeners();
        buildPane();
        buildFrame();
    }// end initComponents()

    private void addMenuListeners(){
        exitItem.addActionListener(
            new java.awt.event.ActionListener(){
                public void actionPerformed(ActionEvent e){
                    exitActionPerformed();
                }
            }
        );

        aboutItem.addActionListener(
            new java.awt.event.ActionListener(){
                public void actionPerformed(ActionEvent e){
                    aboutActionPerformed();
                }
            }
        );
    }

    private void exitActionPerformed(){
        frame.dispose();
    }

    public void aboutActionPerformed(){
        JOptionPane.showMessageDialog(null, "Thanks for using my app!");
    }
}// end GUIApp