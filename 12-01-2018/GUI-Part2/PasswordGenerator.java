import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class PasswordGenerator extends JInternalFrame {
    private static PasswordGenerator instance = null;

    private JButton btn;
    private JLabel lbl, lbl2;
    private JPanel upperPanel, lowerPanel;

    public static PasswordGenerator getInstance() {
        if(instance == null){
            instance = new PasswordGenerator();
        }
        return instance;
    }

    private void PasswordGeneratorPerformed() {
        lbl2.setText("");
        try {
            String passWord = "";
            for(int i = 0; i < 15; i++){
                int number = (int)(Math.random() * 126 + 1);
                if(number <= 126 && number >= 33){
                    char randomCha = (char)number;                    
                    passWord = Character.toString(randomCha) + passWord;
                }
            }
            lbl2.setText(passWord);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Bad input! Try again.");
        }
    }

    private PasswordGenerator() {
        super("Password Generator", false, true, false, false);

        btn = new JButton("Generate");
        lbl = new JLabel("Password: ");
        lbl2 = new JLabel();
        upperPanel = new JPanel();
        lowerPanel = new JPanel();

        upperPanel.setLayout(new FlowLayout());
        upperPanel.setLayout(new FlowLayout());

        upperPanel.add(btn);

        lowerPanel.add(lbl);
        lowerPanel.add(lbl2);

        add(upperPanel, BorderLayout.NORTH);
        add(lowerPanel, BorderLayout.SOUTH);

        btn.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    PasswordGeneratorPerformed();
                }
            }
        );

        setBounds(50, 50, 250, 100);
        setLocation(100,100);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }// end PasswordGenerator()
}