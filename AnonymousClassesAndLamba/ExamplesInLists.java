import java.util.ArrayList;

public class ExamplesInLists {
	public static void main(String[] args){
		//----------------------SORTING AND STREAMS-------------------------

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);
		System.out.println(list);
		
		// needs a comparator to sort??
		// read the java doc on list.sort() it needs to take a lamba comparator
		list.sort((a, b) -> a - b);
		// list.sort((a, b) -> a.height - b.height); 
		// if you had a case where you wanted to sort based on specific objects you can make it so that it sorts based off the height variables in those objects.
		// (read on how the comparator thing works in arraylist)

		System.out.println(list);

		// a stream is a constant flow of data, instead of it being a fixed object it is a flow of objects?
		// if you want to get an arraylist stream, arraylist implements list which extends collection 


		// streams have this method called filter which takes the parameters of class type Predicate
		// Predicate is a functional interface, meaning that it has only 1 non-default method. (1 method that you are able to implement)
		// Predicate's method is called test, where it checks if the expression you entered is true or false
		// filter will remove all elements that do not past the test 

		// in this case the predicate is true if the element inside is even so it will remove all odd
		list.stream()
			.filter((t) -> t % 2 == 0) //the t in this case is every element
			.forEach((t) -> System.out.println(t)); //goes through every element and prints it

		// to check if a string worked you can use the forEach method inside stream
		// takes a Consumer which is another functional interface
	}
}