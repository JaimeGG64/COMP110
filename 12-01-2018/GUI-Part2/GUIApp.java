// abstract window toolkit (awt)
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Cursor;

// awt events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

// swing
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
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

// swing event
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

// swing tree
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;


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
    private JTree tree;

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

        scrollPane.getViewport().add(tree);

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

        //Create a new frame
        frame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/csun.gif"));
        
        frame.getContentPane().add(labelPanel, BorderLayout.SOUTH);
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        //Show GUI
        frame.setSize(740,540);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }

    private void buildTree(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Tools");
        DefaultMutableTreeNode alg = new DefaultMutableTreeNode("Algorithms");
        DefaultMutableTreeNode odd = new DefaultMutableTreeNode("Odd");
        DefaultMutableTreeNode io = new DefaultMutableTreeNode("IO");
        DefaultMutableTreeNode fileInfo = new DefaultMutableTreeNode("File Info");

        alg.add(odd);
        io.add(fileInfo);

        root.add(alg);
        root.add(io);

        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);
    }

    private void addTreeListeners(){
        tree.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    int selRow = tree.getRowForLocation(e.getX(), e.getY());
                    if(selRow != -1) {
                        treeClicked();
                    }          
                }                       
            }
        );
    }

    private void treeClicked(){
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

        if(node != null && node.isLeaf()){
            statusLabel.setText(node.toString() + "clicked.");
            if(node.toString().equals("Odd")) {
                //OddDialog od = OddDialog.getInstance();
                //if(!od.isVisible()) { 
                //   od.setVisible(true);
                //   desktop.add(od);               
                //}                       
            }
            else if(node.toString().equals("File Info")) {
                //ReadDialog rd = ReadDialog.getInstance();
                //if(!rd.isVisible()) { 
                //   rd.setVisible(true);           
                //  desktop.add(rd);
                //} 
            }
    
        }
    }

    private void initComponents(){
        setLookAndFeel();
        buildDesktop();
        buildTree();
        addTreeListeners();
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