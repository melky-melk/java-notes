import java.util.Arrays;

public class Pascals {
	/* 
	Pascals triangle 
	
			1
		   1 1
		  1 2 1
		 1 3 3 1
		1 4 6 4 1
	*/

	// gives the nth row of the tree
	public static int[] pascals(int n){
		
		if (n == 0){
			return new int[] {1};
		} else {
			int[] aboveRow = pascals(n - 1);
			
			// the length of the rows correspond to n + 1
			int[] returnArray = new int[n + 1]

			// if you look at the pyramid above the first and last values are always 1
			returnArray[0] = 1;
			returnArray[n] = 1;

			//second element going to the second last element (to avoid the 1's )
			for (int i = 1; i < n; i ++){
				// in the fibonacci sequence you add the two numbers ontop of the number together for the 6 in the bottom row, 3 + 3 = 6
				returnArray[i] = above[i - 1] + above[i];
			}

			return returnArray;
		}
	}

	public static void main(String[] args){
		System.out.println(Arrays.toString(fib(0))); //1
	}
}