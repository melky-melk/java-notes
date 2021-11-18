public class Fibonacci{
	// using caches to store numbers specifically so that you can use precalled methods instead of calling the mthods over and over
	// if you call fib(6) you need to calculate numbers multiple times, fib(3) will need to be calculated 3 times
	// why dont we save the number calculated initially for fib(3) and reuse that, rather than calling the method again 
	// recursive uses lots of methods, caches lessen the strain on the computer and take bigO from 2^n -> 2n - 1

	public int fib(int n){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0,0);
		map.put(1,1);
		fibHelper(n, map);
	}

	int fibHelper(int n, HashMap<Integer, Integer> map){
		// when calculating the sequence, if the map has already seen that number been calculated before then it gets the answer to that number
		if map(containsKey(n)){
			return map.get(n);
		}
		// otherwise it calculates the fibonacci sequence like usual then saves it
		else {
			int answer = fibHelper(n - 1, map) + fibHelper(n - 2, map);
			map.put(n, answer)
			return answer;
		}
	}
}

