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

class MilesToKilometers extends JInternalFrame {
    private static MilesToKilometers instance = null;

    private JTextField tf;
    private JButton btn;
    private JLabel lbl, lbl2;
    private JPanel upperPanel, lowerPanel;

    public static MilesToKilometers getInstance() {
        if(instance == null){
            instance = new MilesToKilometers();
        }
        return instance;
    }

    private void MilesToKilometersPerformed() {
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

    private MilesToKilometers() {
        super("Miles To Kilometers", false, true, false, false);

        tf = new JTextField(10);
        btn = new JButton("Covert");
        lbl = new JLabel("Kilometers: ");
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
                    MilesToKilometersPerformed();
                }
            }
        );

        setBounds(40, 40, 250, 120);
        setLocation(100,100);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }// end MilesToKilometers()
}