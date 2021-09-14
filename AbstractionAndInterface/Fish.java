public class Fish extends Animal {

    // remember dont need to have this here because name is defined in the abstract class and thus does not need to be defined here
    // protected String name;
    public int weight = 0;

    // DO NOT NEED TO WRITE THIS LINE BECAUSE THE PARENT CAN DO IT INSTAD
    // public Fish(String name){
    //     this.name = name;
    // }

    // calling the parent constructor to do the work for it (makes it better for debugging and saves line (later if there is more parameters it would save lines))
    public Fish (String name){
        super(name)
    }

    // implementation of the methods that were forced by the abstract
    public void move(){
        System.out.println("swims");
    }

    public void communicate(){
        System.out.println("blub blub");
    }

    // overwrites the other toString method in the Animal abstract 
    public String toString(){
        return "Fish called " + this.name;
    }
}