public class Point2D{
    //first for the class, define the attributes the class will eventually have
    //private means that it cannot be changed or read once it has been initialised, unless you created a method to specifically retrieve or edit the attribute
    private double x,y;
	/*same thing as
	private double x;
	private double y;
    */

    //public means that this method can be accessed anywhere
    //this is the constructor used to create objects from the class 2D
    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    //this would be used like so (the variables in the brackets aren't necessarily 1.5 and 2.3 this is just an example):
    //Point2D objectName = new Point2D(1.5, 2.3);

    //the following are getter methods, used to retrive a private attribute. it will simply return the attribute, 
    public double getX() {return this.x;} //this will return the x value
    public double getY() {return this.y;} //this will return the y value
    //would be used like so, to get the Y
    //objectName.getY();

    //this is another get method except it return an array of both x and y
    public double[] getCoords() {
        //first creates the array
        double[] coords = new double[2];
        
        //then sets the insides of the array to x and y
        coords[1] = this.x;
        coords[2] = this.y;

        //then returns the array
        return coords;
    }
}