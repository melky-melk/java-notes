//name of class must match the name of the file
public class HelloWorld {
    //maain is the method that java runs everything written should be written inside a class
    //inside the main class in the main method. main is how the program starts you need a main method in every java program
    //java is a compliling languge meaning theat first the program needs to compile using javac -insert file name-.java then run using java -file name- 
    //public means access modifier, can be accessed from any file
    // private can only be accessed from within the certain file
    // static means no objects are created for the class(yknow how you made a soldier class and made soldiers which can do things yeah not that)
    // void means return type. like how methods and functions return something. it is not returning anything it is "void" 
    //changing the public static void to public static int it will return an error saying that there is no return statement for int
    public static void main(String[] args){
        //it is telling the java system (System) to output somthing
        //need semicolons otherwise wont compile
        System.out.println("Hello World!");
    }
}