import javax.swing.JOptionPane;

public class Bits {
    public static void main(String[] args) {
    // Bitwise and Bitshift Operators

    /* The & Operator (Bitwise AND)
    
    */
    int intAndOne = 20;
    int intAndTwo = 25;
    int resultOneAnd = intAndOne & intAndTwo;
    String resultOneAndStr = String.format("%32s", Integer.toBinaryString(resultOneAnd)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, Integer.toString(intAndOne) + " & " + Integer.toString(intAndTwo) + " = " + Integer.toString(resultOneAnd) + "\n" + resultOneAndStr);

    /* The | Operator (Bitwise Inclusive OR)
    
    */
    int intIncOrOne = 10;
    int intIncOrTwo = 30;
    int resultOneIncOr = intIncOrOne | intIncOrTwo;
    String resultOneIncOrStr = String.format("%32s", Integer.toBinaryString(resultOneIncOr)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, Integer.toString(intIncOrOne) + " | " + Integer.toString(intIncOrTwo) + " = " + Integer.toString(resultOneIncOr) + "\n" + resultOneIncOrStr);

    /* The ^ Operator (Bitwise Exclusive OR)
    
    */
    int intExcOrOne = 14;
    int intExcOrTwo = 20;
    int resultOneExcOr = intExcOrOne ^ intExcOrTwo;
    String resultOneExcOrStr = String.format("%32s", Integer.toBinaryString(resultOneExcOr)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, Integer.toString(intExcOrOne) + " ^ " + Integer.toString(intExcOrTwo) + " = " + Integer.toString(resultOneExcOr) + "\n" + resultOneExcOrStr);

    /* The ~ Operator (Bitwise Inverts ~)
    
    */
    int intInvOne = 75;
    int resultInv = ~(intInvOne);
    String resultInvStr = String.format("%32s", Integer.toBinaryString(resultInv)).replace(' ', '0');
    JOptionPane.showMessageDialog(null, "~ " + Integer.toString(intInvOne) + " = " + Integer.toString(resultInv) + "\n" + resultInvStr);
    }

    /* The >> Operator (Bitwise Right Shift)
    
    */
    // int intRightShift = 56;
    // int resultRightShift = ~(intRightShift >> 4);
    // String resultRightShiftStr = String.format("%32s", Integer.toBinaryString(resultRightShift)).replace(' ', '0');
    // JOptionPane.showMessageDialog(null, ">> " + Integer.toString(intRightShift) + " = " + Integer.toString(resultRightShift) + "\n" + resultRightShiftStr);
}