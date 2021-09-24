import java.util.*;

public class Iterators {
	public static void main(String[] args){

		ArrayList<String> list = new ArrayList<String>();

		list.add("melk");
		list.add("lemon");
		list.add("lime");
		list.add("bean");

		/*
		for (String s: list) {
			System.out.println(s);
		}
		a simple for each loop actually calls upon the method iterator, w
		*/

		// return an iterator object
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()){
			String s = iter.next();
			System.out.println(s);
		}

		// is the exact same thing as the for each loop

		// to create a class that uses generics and implements collections in a for each loop is 
		// you can use a for loop on anything that implements the iterable interface
		// from the javadocs, implementing the iterable interface allows an object to be the target of the "for-each loop"
	}
}