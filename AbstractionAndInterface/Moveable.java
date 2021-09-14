//interfaces dont group things based on parent classes or inheritance, they just group things based on whether or not those things use the same methods
// it is similar to abstract but does not involve any inheritance, again it forces methods to be implemented
public interface Movable {
    //like abstract you dont write the method
    // methods are expected to be undefined in an interface so it follows the syntax without the braces and just the semicolon
    // this will force the objects that extend it to implement this method, otherwise it wont compile
    public void move();

    // in this method however it the method to be implemented here
    // it is predefined to just print stop
    public default void stop(){
        System.out.println("stop");
    }
    
}