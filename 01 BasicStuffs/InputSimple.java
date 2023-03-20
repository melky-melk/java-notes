//before you can do anything, you want to import the scanner first
import java.util.Scanner;

public class InputSimple {
	public static void main(String[] args){
		//before you can gather input you have to like "create" the scanner as a "variable" (technically, its- not a variable but ¯\_(ツ)_/¯)
		//like with other variables you have to declare the datatype aka Scanner
		//then you put in a variable name (i like to use input but you can name it whatever the fuck you want)
		//then new Scanner(System.in); which- doesnt make a lot of sense yet but just go with it
		Scanner input = new Scanner(System.in);

		//the scanner's main thing is that you can use it to collect input from the console the method/function (the command you use) is next
		//so im saving the input as a String initially 
		//whatever the user types will be saved as the variable line
		String line = input.nextLine(); //for example if i put "bean lemon lime melk"
		
		// will print whatever the user just typed (cuz its taking the line just input into the console, saving it, then printing)
		System.out.println(line); // will print bean lemon lime melk 

		//the .next() command will only get the next word 
		String word = input.next(); //for example if i put in "tater tots"

		System.out.println(word); //will only print tater
	}
}