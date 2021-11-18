import java.util.Scanner;
import java.io.*;

public class Exceptions {
	public static void main(String[] args) {
 		Scanner keyboard = new Scanner(System.in);
	
		try {
			System.out.println("Enter number of donuts:");
			int donutCount = keyboard.nextInt();
			
			System.out.println("Enter number of glasses of milk:");
			int milkCount = keyboard.nextInt();
			
			// throwing exceptions
			if (milkCount < 1)
				throw new Exception("Exception: No milk!");
			
			double donutsPerGlass = donutCount / (double)milkCount;
			System.out.println(donutCount + " donuts.");
			System.out.println(milkCount + " glasses of milk.");
			System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk.");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Go buy some milk.");
		}
	
	System.out.println("End of program.");
	}
}