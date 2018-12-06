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

    private JTextField tf;
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
        double input = 0;
        lbl2.setText("");
        try {
            input = Integer.parseInt(tf.getText());
            double kilometers = input*1.6;
            lbl2.setText(Double.toString(kilometers));
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Bad input! Try again.");
        }
    }

    private PasswordGenerator() {
        super("Password Generator", false, true, false, false);

        tf = new JTextField(3);
        btn = new JButton("Generate");
        lbl = new JLabel("Password: ");
        lbl2 = new JLabel();
        upperPanel = new JPanel();
        lowerPanel = new JPanel();

        upperPanel.setLayout(new FlowLayout());
        upperPanel.setLayout(new FlowLayout());

        upperPanel.add(tf);
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

        setBounds(40, 40, 250, 120);
        setLocation(100,100);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }// end PasswordGenerator()
}