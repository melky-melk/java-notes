public class Runner{
    public static void main(String[] args){

        Animal dog = new Animal();
        // when something is abstact it cannot be created
        // an abstract class forces certain object to not be created and forces a subclass to be created first

        Dog spot = new Dog();
        spot.move();
        // if communicate is not implemented it will do nothing because its inherited from Animal but there is nothing there so it will do nothing
        // if communicate is implemented in Dog then it will print Woof
        spot.communicate();
        // can force this to be implement by using abstract

        // Abstract essentially is a guide for subclasses and forces things to be implemented

        // YOU CAN DO THIS SHIT
        // Parent p = new Child(); Shape s = new Square();
        // Child c = new Parent() Square s = new Shape(); DOESNT WORK parent cant be made from the child

        Animal nemo = new Fish();

        // cant do nemo.weight = 10; because it is not defined in the animal blueprint (remember it is made in the animal class, weight is only defined in the Fish class)
        // if you make something from the parent class, and specify the subclass the object created will not have the attributes only specified in the subclass 

        Fish nemo2 = new Fish();
        nemo.weight = 10; // will work because its made from the fish

        // interfaces are like a super type, not a super class but a super TYPE

        Movable spot2 = new Dog("Spot");
        spot2.move();
        spot2.stop();

        // spot.communicate(); this one wont work because its inherited from the abstract Animal

        Movable car = new Car();
        car.stop();
        car.move();

        ArrayList<Movable> list = new ArrayList<Movable>();
        // can only add things that extend moveable
        list.add(car);
        list.add(spot2);
        // list.add(nemo) doesnt work because nemo is not part of Movable

    }
}