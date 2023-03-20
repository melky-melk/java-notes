// Generics are a container class, it holds a value. and we can retrieve it
// so you put in a placeholder type you can use, so when you try to use the type you have to specify later
/* like how in arraylists you specify the type inside the alligator brackets inside and the type inside the brackets can change
ClassName<dataType> variableName = new ClassName<dataType>(); 

ArrayLists are a generic and can specify  can be a string
ArrayList<String> list = new ArrayList<String>();

or can be an integer:
ArrayList<Integer> list = new ArrayList<Integer>();

*/

// the <T> meaning the type is specified later, you can decide later on what type it is
public class Generic<T> {
	// right now its just stores 1 data type it cannot store anything else, because the type is fixed
	// public int value; 

	// but if you put the value as T, it uses the type specified inside the alligator brackets when the object is made.
	// T is called a reference type placeholder
	// when its compiled it will go through and replace all the T with the reference type specified, for the object box it will replace T with String 
	public T value;

	public Generic(T value) {
		this.value = value;
	}

	public T getValue() {return this.value;}

	public static void main(String[] args) {
		// will compile
		Generic<String> box = new Generic<String>("Hello");
		
		System.out.println(box.getValue());

		// it needs to be a reference type rather than a primitive type
		// Generic<int> a = new Generic<int>(1);
		Generic<Integer> a = new Generic<Integer>(1);
	}
}