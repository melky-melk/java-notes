import java.util.*;

interface Property<T>{
	public boolean test(T obj);
}

class Algorithm<T> {
	public int countIf(Collection<T> c, Property<T> p) {
		//increment through the collection, then return the number
		int counter = 0;
		// increments through
		for (T item: c){
			// if it passes the test then increment
			if (p.test(item)) {counter ++;}
		} 

		return counter;
	}
}

public class CountRedux {
	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Algorithm<Integer> a = new Algorithm<>();
		// creates a lambda from the property functional interface
		Property<Integer> oddTester = (number) -> (number % 2 == 1);
		int count = a.countIf(list, oddTester);
		System.out.println("Number of odd integers = " + count);

		Collection<String> listString = new LinkedList<>();
		listString.add("Eye");
		listString.add("Kayak");
		listString.add("Salsa"); 
		listString.add("melk"); 
		listString.add("Racecar");
		Algorithm<String> s = new Algorithm<>();

		// creates a lambda from the property functional interface
		Property<String> palindromeTester = (original) -> {
			StringBuilder str = new StringBuilder(original);
			StringBuilder reverse = str.reverse(); // reverse changes the original string not return a new one
			str = new StringBuilder(original); //need to make the original

			return reverse.toString().equalsIgnoreCase(str.toString());
		};

		count = s.countIf(listString, palindromeTester);
		System.out.println("Number of palindromes = " + count);

	}
}