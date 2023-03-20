public class Variables {
	public static void main(String[] args){
		/* 
		You can save data as a variable, in java you have to specify the what type the data is before the variable name
		in this case, the type of variable is a String. anything that are "" quotation marks are known as strings, so String is the data type
		here x is the variable name, you can make the variable name equal whatever you want as long as it matches the data type
		by putting the equals sign next to the variable it you are assigning the string "Hello World" to x
		*/ 
		String x = "Hello, World!";

		// now if you were to print x
		System.out.println(x); // Would print Hello, World! 
		//its essentially the same thing as printing System.out.println("Hello, World!") because the x is being replaced by "Hello, World" 

		// you can also change the variable after
		// when you have already specified the data type, you dont specify it again
		x = "beab? beab.";
		System.out.println(x); //will print beab? beab.
		
		//Saving numbers
		//for whole numbers the data type is known as an integer, but you use int
		int a = 1; //again, you can name a and be literally anything 
		int b = 2; 

		//you can now use the variables togetehr
		System.out.println(a + b); // will print 3

		//similarly for decimal point numbers you use the data type double
		double decimalPointNumber = 1.5;
		double decimalPointNumber2 = 0.1;

		System.out.println(decimalPointNumber + decimalPointNumber2); // will print 3

		//can use shit from before
		System.out.println(a + decimalPointNumber2); // will print 1.1 

		//you cant call variables before theyre made, because the computer wont know what the fuck your talking about or what the fuck the variable is supposed to represent
		System.out.println(banana); //will not let the program run because the it doesnt know what banana is supposed to equal 

		// the syntax for saving variables is:
		// dataType variableName = whateverTheFuckYouWantToSave;
	}
}