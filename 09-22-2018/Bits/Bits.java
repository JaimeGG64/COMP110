import javax.swing.JOptionPane;

public class Bits {
    public static void main(String[] args) {
    // Bitwise and Bitshift Operators

    /* The & Operator (Bitwise AND)
    10100 (20)
    &11001 (25)
    -----
    10000 (16)
    */
    int intAndOne = 20;
    int intAndTwo = 25;
    int resultOne = intAndOne & intAndTwo;
    String resultOneStr = String.format("%32s", Integer.toBinaryString(resultOne)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, "20 & 25 = " + resultOne);

    /* The | Operator (Bitwise Inclusive OR)
    10101 (21)
    |11000 (24)
    -----
    11101 (29)
    */
    int intOrOne = 21;
    int intOrTwo = 24;
    int resultTwo = intOrOne | intOrTwo;
    String resultTwoStr = String.format("%32s", Integer.toBinaryString(resultTwo)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, "21 | 24 = " + resultTwoStr);
    }
}