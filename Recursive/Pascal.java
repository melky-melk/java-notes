import java.util.*;

public class Pascal {

	/*
			1
		   1 1
		  1 2 1
		 1 3 3 1
		1 4 6 4 1
	  1 5 10 10 5 1
	*/
	private static ArrayList<Long> pascal(int n){
		ArrayList<Long> currentRow = new ArrayList<>();

		// every row begins with a 1
		currentRow.add((long)1);

		// base case is when n = 1, decriment n each time till you get to 1 where you then return it
		if (n == 0) {
			System.out.println(1);
			return currentRow;
		}

		ArrayList<Long> aboveRow = pascal(n - 1); 

		// the aboveRow ends early because the 1 at the end is added a 1 regardless
		for (int i = 0; i < aboveRow.size() - 1; i++){
			currentRow.add(aboveRow.get(i) + aboveRow.get(i + 1));
		}
		
		// ending with the 1
		currentRow.add((long)1);

		String line = "";
		for (long number : currentRow){
			line += (number + " ");
		}

		System.out.println(line.trim());

		return currentRow;
	}

	public static void main(String[] args){
		if (args.length == 0){
			System.out.println("Not enough arguments.");
			return;
		}
		if (args.length > 1){
			System.out.println("Too many arguments.");
			return;
		}

		int n = Integer.parseInt(args[0]);
		pascal(n);
	}
}