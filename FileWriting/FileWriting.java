import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args){
        if (args.length < 2){
            System.out.println("Not enough arguements in the command line");
            return;
        }

        String input = args[0];
        String output = args[1];

        //reads the first command line argument as the file input and puts it into the scanner to read it
        //you need to handle file not found errors otherwise it wont compile
        try{
            File f = new File(input);
            Scanner sc = new Scanner(f);
            //creates an instance of the PrintWriter class, which has all the same methods as System.out 
            //System.out is actually an instance of the PrintWriter class
            //but in this case the output is not the terminal and is instead the output file
            PrintWriter pw = new PrintWriter(output);

            //if it gets to the end of the file it stops reading
            while (sc.hasNextLine()){
                String line = sc.nextLine();

                StringBuilder build = new StringBuilder(line);
                StringBuilder reverse = build.reverse(); 
                System.out.println(reverse);

                //will print to the output file
                pw.println(line);
            }

            //need to close files after WRITING in it
            pw.flush();
            pw.close();
        }
        catch (FileNotFoundException e) { 
            //prints FileNotFoundException message withot the try catch it wont compile
            e.printStackTrace();
        }
    }
}