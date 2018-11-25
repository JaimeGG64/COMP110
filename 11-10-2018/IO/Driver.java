/*
    **Drive must look like this**
    public static void main(String[] args) {
        IO io = new IO();
        io.read();
        io.sort();
        io.write();
    }
*/
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

class Driver{
    public static void main(String[] args){
        try{
            PrintStream writer = new PrintStream( new File("output.txt"));   
            for(int i = 0; i < 100; i++) {    
                    writer.println("hi: " + (Math.random() * 40 + 1));
                }
        }
        catch(IOException ex){
            System.out.print("Bad");
        }
    }
}