import java.util.*;

public class Fibonacci2 {

	// now has a hashmap inside to store the previous answers
	// the key being the n in F(n) and the value being the integer F(n) = x, the x
    public static HashMap<Integer, Integer> fibMemory = new HashMap<>();

    public static int f(int n) {
		// when its called it first checks if this value was calculated before it if was, it is returned
        if (fibMemory.containsKey(n)) {
            return fibMemory.get(n);
        }
		
        if (n < 0) {return -1;}

        //base cases
        if (n == 0) {
            fibMemory.put(n, 0);
            return 0;
        }
        if (n == 1) {
            fibMemory.put(n, 1);
            return 1;
        }

        //recursive case
        int result = f(n-1) + f(n-2);
        fibMemory.put(n, result);
        return (result);
    }

    public static void main(String[] args) {
        System.out.println(f(0));
        System.out.println(f(4));
        System.out.println(f(7));
    }
}