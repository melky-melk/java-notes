import java.util.*;

public class GuessingGameRedux {
	public static void main(String[] args){
		
		String number = args[0];
		// this weird string checks if it is a number
		if (NumberUtils.isParsable(number)){
			Integer.parseInt(number);
		} 
		else {
			System.out.println("arguement in command line must be a number");
			System.exit(0);
		}

		Scanner input = new Scanner(System.in);
		
		// First prints this bit
		System.out.print("Guess what number it is: ");
		
		while (true){
			// gets the user's number that will be guessed
			String guessedNumber = input.nextLine();

			if (NumberUtils.isParsable(guessedNumber)){
				Integer.parseInt(guessedNumber);

				if (guessedNumber == number){
					System.out.println("Correct!");
				} 
				else {
					System.out.print("Incorrect guess, try again: ");
				}
			}

			else {
				System.out.println("Must enter a number.");
				break;
			}
		}
	}
}