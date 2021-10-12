// every class actually just instends the root class Object 
//this is the parent class, Dog
public class Dog{
	//normally private but it needs to be accessed by the wolf class so instead attributes are protected
	protected String name; 
	protected int age;
	protected boolean friendly;
	
	public Dog(String[], int age){
		this.name = name;
		this.age = age;
		this.friendly = true;
	}

	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public boolean getFriendly() {return this.friendly;}

	// overloading methods
	public void bark(){
		System.out.println("woof");
	}

	/*
	overloading methods only works if the thing has different parameters
	public int bark(){
		return 1; wont work because bark() is already defined
	}
	cant have different return types with the SAME parameters
	*/
	
	// overloading methods now if bark(true) or bark(false) is called it will do this chunk instead of the one above
	public void bark(boolean happy){
		String response = (happy ? "wags tail" : "growl");
		System.out.println(response);
	}

	public static void main(String[] args){
		Dog spot = new Dog("Spot", 4);
		System.out.println();
	}
}