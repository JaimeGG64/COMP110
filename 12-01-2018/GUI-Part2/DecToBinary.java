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

class DecToBinary extends JInternalFrame {
    private static DecToBinary instance = null;

    private JTextField tf;
    private JButton btn;
    private JLabel lbl, lbl2;
    private JPanel upperPanel, lowerPanel;

    public static DecToBinary getInstance() {
        if(instance == null){
            instance = new DecToBinary();
        }
        return instance;
    }

    private void DecToBinaryPerformed() {
        int input = 0;
        int temp;
        String BinaryOutput = "";
        lbl2.setText("");
        try {
            input = Integer.parseInt(tf.getText());
            while(input > 0){
                temp = input % 2;
                BinaryOutput = BinaryOutput + "" + temp;
                input = input / 2;
            }
            lbl2.setText(BinaryOutput);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Bad input! Try again.");
        }
    }

    private DecToBinary() {
        super("Decimal To Binary", false, true, false, false);

        tf = new JTextField(10);
        btn = new JButton("Covert");
        lbl = new JLabel("Binary: ");
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
                    DecToBinaryPerformed();
                }
            }
        );

        setBounds(40, 40, 250, 120);
        setLocation(100,100);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }// end DecToBinary()
}