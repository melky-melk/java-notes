//imports the Scanner class
import java.util.Scanner;

//public enables the shit to be accessed by others
//class name which has to be the same as the filename (in this case class name is Input and file name is Input.java)
public class Input{ //opening brackets that contain the entire program
    //static means that you can run the class without creating an object within it
    //main method (starting point)
    //String[] command line arguements are saved as an array. in python remember that sys.argv gave the command line as a list, in java it is an array
    public static void main(String[] args){
        
		//system.out as in the system is outputting to the screen
        System.out.println("Hello! This will output to the screen");
        
		//setting integerVar to 1. the int is put in front to declar the variable type and the 1
        int integerVar = 1;
        
		//sets d1 as type double 
        double d1 = 1.5;

        //creates a scanner object from the class imported at the top (note this is making a object out of a class that was IMPORTED) it doesnt contradict the static thing stated earlier 
        //the keyboard (the object made from the scanner class) can accept input from the system (System.in) 
        Scanner keyboard = new Scanner(System.in);
        
		//assigns the value s to a string 
        String s = "This is a string!";

        //s is now assigned to the input the user gives in the lines and changes it to something else
        
		s = keyboard.nextLine();
        //then it prints s
        System.out.println(s);
    }
}