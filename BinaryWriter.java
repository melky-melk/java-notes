import java.io.*;

public class BinaryWriter {
    public static void main(String[] args){
        try{
            // same as the file you have to make for scanner, gotta make a File but use FileOutputStream instead of File
            FileOutputStream f = new FileOutputStream("newfile.bin");
            // instead of using scanner with the file inside use file Output stream
            DataOutputStream output = new DataOutputStream(f);

            //uses the object to write the integer inside
            output.writeInt(50);
            // takes string and writes it in
            output.writeUTF("INFO1113")

			// writes the binary symbol for a unit seperator in java
			output.writeUTF("\u001F");
			
            // after writing in a file you cannot not close it
            output.close();
        }

        // have to catch the file not found exception
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        // have to catch IO exception otherwise wont compile and will give error message saying you need to catch the potential error
        catch (IOException e){
            e.printStackTrace();
        }

        //using command xxd -b filename.bin you can read the binary file
        // integer takes 4 bytes
    }
}