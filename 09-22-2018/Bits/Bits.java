//Name: Jaime Garcia Garcia
//Date: 09-22-2018
//Application: Bits
//Purpose: The application demo bitwise Operators

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
    int resultOneAnd = intAndOne & intAndTwo;
    String resultOneAndStr = String.format("%32s", Integer.toBinaryString(resultOneAnd)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, Integer.toString(intAndOne) + " & " + Integer.toString(intAndTwo) + " = " + Integer.toString(resultOneAnd) + "\n" + resultOneAndStr);

    /* The | Operator (Bitwise Inclusive OR)
        10100 (10)
       |11110 (30)
        -----
        11110 (30)
    */
    int intIncOrOne = 10;
    int intIncOrTwo = 30;
    int resultOneIncOr = intIncOrOne | intIncOrTwo;
    String resultOneIncOrStr = String.format("%32s", Integer.toBinaryString(resultOneIncOr)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, Integer.toString(intIncOrOne) + " | " + Integer.toString(intIncOrTwo) + " = " + Integer.toString(resultOneIncOr) + "\n" + resultOneIncOrStr);

    /* The ^ Operator (Bitwise Exclusive OR)
        01110 (14)
       ^10100 (20)
        -----
        11010 (30)
    */
    int intExcOrOne = 14;
    int intExcOrTwo = 20;
    int resultOneExcOr = intExcOrOne ^ intExcOrTwo;
    String resultOneExcOrStr = String.format("%32s", Integer.toBinaryString(resultOneExcOr)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, Integer.toString(intExcOrOne) + " ^ " + Integer.toString(intExcOrTwo) + " = " + Integer.toString(resultOneExcOr) + "\n" + resultOneExcOrStr);

    /* The ~ Operator (Bitwise Inverts ~)
        ~(1001010)
        -----------
        111111111111111111001010
    */
    int intInvOne = 74;
    int resultInv = ~(intInvOne);
    String resultInvStr = String.format("%32s", Integer.toBinaryString(resultInv)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, "~ " + Integer.toString(intInvOne) + " = " + Integer.toString(resultInv) + "\n" + resultInvStr);
    
    /* The >> Operator (Bitwise Right Shift)
    
    */
    int intRightShiftOne = 56;
    int intRightShiftTwo = 4;
    int resultRightShift = intRightShiftOne >> intRightShiftTwo;
    String resultRightShiftStr = String.format(Integer.toBinaryString(resultRightShift));
    JOptionPane.showMessageDialog(null, intRightShiftOne +" >> " + intRightShiftTwo + " = " + resultRightShiftStr + "\n");

    /* The << Operator (Bitwise Left Shift)
    
    */
    int intLeftShiftOne = 25;
    int intLeftShiftTwo = 2;
    int resultLeftShift = intLeftShiftOne << intLeftShiftTwo;
    String resultLeftShiftStr = String.format(Integer.toBinaryString(resultLeftShift));
    JOptionPane.showMessageDialog(null, intLeftShiftOne +" >> " + intLeftShiftTwo + " = " + resultLeftShiftStr + "\n");

    /* The >>> Operator (Bitwise Zero Right Shift)
    
    */
    int intZeroFillRightShiftOne = 56;
    int intZeroFillRightShiftTwo = 3;
    int resultZeroFillRightShift = intZeroFillRightShiftOne >>> intZeroFillRightShiftTwo;
    String resultZeroFillRightShiftStr = String.format(Integer.toBinaryString(resultZeroFillRightShift));
    JOptionPane.showMessageDialog(null, intZeroFillRightShiftOne +" >> " + intZeroFillRightShiftTwo + " = " + resultZeroFillRightShiftStr + "\n");
    }
}