// an interface with a single NON-DEFAULT METHOD is called a functional interface
// here you can make objects that implement and overide the method in a single line
interface Calculate {
	public double calculate(int x, int y);
}

public class SimpleCalculation {
	public static void main(String[] args){
		// creating an object from the functional interface, the parameters (x,y) are being used here to do (x + y)
		Calculate addition = (x, y) -> (x + y);
		Calculate subtraction = (x, y) -> (x - y);
		Calculate multiplication = (x, y) -> (x * y);
		Calculate division = (x, y) -> (x / y);
		Calculate powerTo = Math::pow;
		Calculate powerToPart2 = (x, y) -> Math.pow(x, y);


		// now when it uses the interface's method it uses the overridden method specified when the object was created above
		System.out.println(addition.calculate(6, 3));        //9
		System.out.println(subtraction.calculate(6, 3));	 //5
		System.out.println(multiplication.calculate(6, 3));  //18
		System.out.println(division.calculate(6, 3));		 //2
		System.out.println(powerTo.calculate(6, 3));		
	}
}
