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

class RandomPhoneNumber extends JInternalFrame {
    private static RandomPhoneNumber instance = null;

    private JTextField tf;
    private JButton btn;
    private JLabel lbl, lbl2;
    private JPanel upperPanel, lowerPanel;

    public static RandomPhoneNumber getInstance() {
        if(instance == null){
            instance = new RandomPhoneNumber();
        }
        return instance;
    }

    private void RandomPhoneNumberPerformed() {
        lbl2.setText("");
        try {
            String input = "";
            String generatedNumber = "";
            input = tf.getText();
            int length = input.length();
            boolean checkIfNumbers = input.matches("[0-9]");
            if(checkIfNumbers && length == 3){
                for(int i = 0; i < 7; i++){
                    int number = (int)(Math.random() * 5 + 1);
                    generatedNumber = Integer.toString(number) + generatedNumber;
                }
                // lbl2.setText(input + "-" + generatedNumber.substring(0,3) + "-" + generatedNumber.substring(4,7));
                lbl2.setText(input + "-" + generatedNumber);
                lbl2.setText(generatedNumber);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Bad input! Try again.");
        }
    }

    private RandomPhoneNumber() {
        super("Random Phone Number", false, true, false, false);

        tf = new JTextField(10);
        btn = new JButton("Generate");
        lbl = new JLabel("New Number: ");
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
                    RandomPhoneNumberPerformed();
                }
            }
        );

        setBounds(50, 50, 280, 150);
        setLocation(100,100);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }// end RandomPhoneNumber()
}