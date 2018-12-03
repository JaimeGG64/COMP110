import javax.swing.SwingUtilities;

class Driver{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                GUIApp gui = new GUIApp();
            }
        });
    }
}