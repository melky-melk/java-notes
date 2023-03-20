package SpyClasses;
import java.util.*;

// STREAM NEEDS ITS OWN IMPORT
import java.util.stream.*;


class Bond {

	public char[] encode(String string) {
		return null;
	}

}


/*
ANONYMOUS CLASSES CAN USE MORE THAN JUST THE FUNCTIONAL INTERFACE BECAUSE IT CAN DEFINE THE METHOD THEN OVERRIDE IT

WHEREAS LAMBDAS CAN ONLY USE THE FUNCTIONAL INTERFACE BECAUSE IT ONL OVERRIDES THE ONE METHOD
*/
public class Main{
	public static void main(String[] args){
		Bond bond = new Bond();
		System.out.println(bond.encode("12345abcde"));
		
		// takes the interface and implements the method inside another method
		// ---------------------------------implementing the method on the spot----------------------
		// example of anonymous class implementation
		Spy x = new Spy() {
			public String encode(String val){
				//pig -> igpay
				String result = "";

				for (int i = 1; i < val.length(); i++){
					result += val.charAt(i);
				}

				result += val.charAt(0);
				result += "ay";

				//String x = decode(val) works because it is inside the scope of same class

				return result;
			}
		};

		// now the x can use the method just made
		System.out.println(x.encode("pig"));
		System.out.println(x.encode("latin"));

		// System.out.println(x.decode("igpay")); //doesnt compile because it only works for the 1 method in the interface, you cant introduce a new method here
		
		/* NOT ENTIRELY SURE HOW THIS NEXT PART WORKS BUT OK
		if you had the classes Animal and dog

		if you did Animal d = new Dog()
		d.bark(); would not work 
		but if you did

		Dog d = new Dog();
		d.bark(); this will work
		need to declare the lowest level ?
		*/

		// these are called lamba expressions. single use expressions or variables
		// according to the java ethos, you shouldnt really have a variable that has a unique method thats only used once
		// java has functional interface, where you have an interface with only 1 non default method, meaning its waiting for you to implent it
		// one abstract method

		// ----------------------------Functional interfaces + lamba---------------------------
		// also dont need parameter types because it understand that the parameter will have the same return type as the superclass
		// Syntax: FunctionalInterface x = (parameter) -> (method);
		
		// spy is a lamba expression that takes in a value and returns the hashCode equivalent when encode is called.
		// this is because encode is the only method that is waiting to be implemented, meaning the only method that is not default
		// anything that is entered into spy.encode() will return a hashcode  
		// instead of using the typical encode method it overwrites it and uses the val's hashCode()
		Spy spy = (val) -> (val.hashCode() + ""); //sneaky way to convert values to a string is to add ""
		System.out.println(spy.encode("abc"));

		// ---------------STEALING STATIC METHODS FROM OTHER CLASSES AND PUTTING THEM IN LAMBDA---------
		// want to make a spy object that steals the function in binary and uses it 
		
		// Spy spy2 = (val) -> Binary.convertStringToBinary(val); can be written as
		Spy spy2 = Binary::convertStringToBinary;  
		// its only method non default method is overwritten

		spy2.outputEncoding("7"); //will use the binary encode method instead 

		// ----------STEALING INSTANCE METHODS FROM OTHER CLASSES AND PUTTING THEM IN LAMBDA----------
		// first need to make a decoder object so you can steal the decoder class

		// same thing except because its an instance method you first need to make an instance of it
		Decoder decoder = new Decoder();
		Spy spy3 = decoder::decode;
	}
}

// anonymous classes are classes you create once you create inside a method. it is a singular specialisation of another type
// so you make new classes inside your code
// you need to specify SuperType x = new SuperType() {[fields] [methods]};
// single classes, x will be the only instace of this speciallisation
// create variables which will have their own behaviour 
