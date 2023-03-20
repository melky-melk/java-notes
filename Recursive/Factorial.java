public class Factorial {
	public static int fact(int n){
		// stackoverflow error when you call too many functions on the stack 
		// there is a gigabite worth of stack when you run out of space the error is called 
		// to make a recusrive function you need a function that calls itself and has a base case for it to stop
		// %! = 5 * 4 * 3 * 2 * 1
		// n! = n * (n - 1)! where n > 0, 0! = 1

		if (n > 0){
			// recursive call with a change in parameters, so it will eventually reach the base case
			return n * fact(n - 1);
		// base case 1
		} else if (n == 0){
			return 1;
		// base case 2
		} else {
			return -1;
		}

		// once it hits 0, it will do all the stack cases again but backwards starting from 1 then going up?
	}

	public static void main(String[] args){
		System.out.println(fact(5));
	}
}