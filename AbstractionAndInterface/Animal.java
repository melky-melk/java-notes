// Abstract meaning you cant physically create the class itself 
// an abstract class is like a parent class but empty, and has parts that HAVE TO be implemented in the subclasses
// Abstract is there for the inhertence of classes, kind of just a blueprint for all the subclasses and making sure things are implemented
public abstract class Animal {
    protected String name;

    // this is later called by the sub classes
    public Animal(String name){
        this.name = name;
    }

    // the method move is weird because dont know what this method should do until you know the sub classes
    // dont know how the animal moves until you know what kind of animal it is i.e. bird fly, fish swim, cheetah run etc
    // it is initially left blank because again, abstract classes can set the methods, but the subclasses are where it is implemented
    // by making a method in abstract it forces the subclass to implement the methods 
    // if the subclass does not implement the empty an error will be thrown 
    public abstract void move();

    // again dont know how the animal should communicate unless you know the subtype: dogs bark, cats meow and so on
    //again because its empty it will force the subclasses to implement it
    public abstract void communicate();

    // can make a default method that abstract has and will be inherited by the subclasses, the subclasses dont need to implement these methods
    public String toString(){
        return this.name;
    }
}