public class Methods {
    // camelCase is used most in java
    //if something is public then any file can access the code underneath if it is private it can only be accessed from within the same file
    
	// to make methods within the same file follow the syntax:
    //static final returnType nameOfFunction(parameters)
	
	//public static void: void because this doesnt return anything, if it returns something you have to declare the type it is returning
    //static means thats its bound to the class, you dont need to make an object to use the method
    //these methods are similar to functions in python
    //methods that occur before the main are part of the overall class, in this case the class is Method and doesnt need to be called. i.e. doesnt need to be Method.hello() its just hello when inside the main 
    public static void hello(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
        //will print Hello
        hello();
    }
}