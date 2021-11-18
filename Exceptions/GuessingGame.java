import java.util.*;

public class GuessingGame {
	public static void main(String[] args){
		int number = 0;

		try {
			number = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException e){
			System.out.println("Incorrect args in command line, must be number java GuessingGame <number>");
			System.out.println("Terminating system");
			System.exit(0);
		}

		Scanner input = new Scanner(System.in);
		// First prints this bit
		System.out.print("Guess what number it is: ");
		String guessedNumber = input.next();

		// infinte loop
		while (true){
			// tries to convert the string into an integer, if there is an number format conversion issue with it that means it was not an integer 
			try {
				// tries to convert
				Integer.parseInt(guessedNumber);
				
				// if it matches then the number is correct
				if (guessedNumber == number){
					System.out.println("Correct!");
					break;
				}
				
				System.out.print("Incorrect guess, try again: ");
			}
			catch (NumberFormatException e){
				System.out.println("Must enter a number.");
				break;
			}
		}
	}
}