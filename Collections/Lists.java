import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class Lists{
	public static void main(String[] args){
		//ArrayList = a resizable array. Elements can be added and removed after the comilation phase, only store reference data types
		//if you wanted arraylist of integers it would not be ArrayList<int> rather, ArrayList<Integer> 
		//because int is a primitive type whereas Integer is a reference type
		//The typical syntax for an arrat list goes"
		//ArrayList<Class> listName = new ArrayList<Class>();
		ArrayList<String> food = new ArrayList<String>();

		//to add things to an array list:
		food.add("pizza");//
		food.add("hamburger");
		food.add("hotdog");

		//and you can loop through array lists like any other array 

		LinkedList<String> linky = new LinkedList<String>();
		
		//each value in the list knows the element in front of it and behind it
		linky.add("Melk");
		linky.add("Bean");
		linky.add("Lemon");
		linky.add("Lime");
		
		//prints in the order where you added it. also doesnt need to go to string, it can just be printed
		System.out.println(linky);	

		//removes from the front of the list
		linky.remove();

		//removes everything in the list
		linky.clear(); 

		//gets the first element can getLast
		linky.getFirst();

		linky.get(1); //gets Bean

		//makes an iterator ¯\_(ツ)_/¯
		Iterator it = linky.iterator();
		//while the iterator is true ¯\_(ツ)_/¯ i dunno this is a bit weird
		while(it.hasNext()){
			//if the string in the next part of the ito
			if ((String) it.next() == "melk");
			
			System.out.println("we found melk");
		}


		/*
		Differences between linked list an array lists BAD EXPLAINATION TBH THIS IS MAINLY FOR ME TO REMEMBER THE POINTS IN THE VIDEO
		https://www.youtube.com/watch?v=M_0q6rGUsNc THE VIDEO IS BETTER I SWEAR

		Array lists are an array that can grow in size array list initially allocated a size when a list gets full 
		it finds a new chunk of memory that is empty and that the elements inside the array can occupy. 
		then it has enough space to occupy when you delete numbers in an array list it does not shrink the size of array
		when you delete something in the middle of an array it needs to shift all the numbers back 
		array list entries are

		Linked lists are not store contigiously in memory. in different locations, it has a pointer that points to the next element
		it wouldnt have to shift the elements it just moves the pointer to the next number in the sequence

		grabbing things in an array list is much faster. in a relatively small list
		removing elements is also much faster in an array list. in middle of a list 

		linked lists removes things faster from the BEGINNING OF THE LIST for larger lists sizes
		*/
	}
}