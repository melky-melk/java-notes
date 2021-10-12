//to write a subclass specify the name of the new subclass you are making then write extends  
// a subclass only inherits public and protected methods and attributs from the parent class
public class Wolf extends Dog{
	/* these attributes are taken from the dog class because it is extended and thus do not need to be rewritten
	
	private String name;
	private int age;
	private boolean friendly;
	
	the pack size is a new attribute that does not initially belong to the Dog class*/  
	private int packSize;


	public Wolf(String name, int age, int packSize){
		// wolf class needs to call the Dog constructor (the parent consrtuctor) 
		// to pass in the variables for name and age like usual then goes back to the wolf class for the next ones
		// create sthe dog class then adds the extra wolf variables to it
		// takes the super's contructor for the name and the age
		super(name, age);
		this.packSize = packSize;
		this.friendly = false;
	}

	/* these methods are already taken from the dog class and do not need to be re-written
	public String getName() {return this.name}
	public int getAge() {return this.age}
	public boolean getFriendly() {return this.friendly}

	public void bark(){
		System.out.println("woof");
	}
	*/

	//because packsize is not initially part of the dog class a getter method needs to be made
	public int getPackSize(){return this.packSize;}
}