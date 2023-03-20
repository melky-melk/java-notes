import java.util.ArrayList;

public class ArrayLists {
	public static main(String[] args){
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
		// to access items with it you use the word
		food.get(1)// to get index 1 

		//to get the length
		food.size() //how many items are in the arraylist
	}
}