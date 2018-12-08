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

class DecToHex extends JInternalFrame {
    private static DecToHex instance = null;

    private JTextField tf;
    private JButton btn;
    private JLabel lbl, lbl2;
    private JPanel upperPanel, lowerPanel;

    public static DecToHex getInstance() {
        if(instance == null){
            instance = new DecToHex();
        }
        return instance;
    }

    private void DecToHexPerformed() {
        int input = 0;
        int temp;
        char hexCharRef[] = {'F','E','D','C','B','A'};
        String hexOutput = "";
        lbl2.setText("");
        try {
            input = Integer.parseInt(tf.getText());
            while(input > 0){
                temp = input % 16;
                if(temp > 9){
                    hexOutput = hexCharRef[15 - temp] + hexOutput;
                }
                else{
                    hexOutput = Integer.toString(temp) + hexOutput;
                }
                input = input/16;
            }
            lbl2.setText(hexOutput);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Bad input! Try again.");
        }
    }

    private DecToHex() {
        super("Decimal To Hex", false, true, false, false);

        tf = new JTextField(10);
        btn = new JButton("Covert");
        lbl = new JLabel("Hex: ");
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
                    DecToHexPerformed();
                }
            }
        );

        setBounds(40, 40, 250, 120);
        setLocation(100,100);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }// end DecToHex()
}