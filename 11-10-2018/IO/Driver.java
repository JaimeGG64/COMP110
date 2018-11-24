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
import java.io.PrintWriter;

class Driver{
    public static void main(String[] args){
        File myFile = new File("test.txt");

        try{
            PrintWriter myOutput = new PrintWriter(myFile);
            myOutput.println("John Doe");
            myOutput.println(24);
            myOutput.close();
        }
        catch(IOException ex){
            System.out.print("Bad");
        }
    }
}