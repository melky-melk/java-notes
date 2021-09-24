public class Line{

    //creates a method that returns a Point2D class 
    //like how you had methods that return int or String, this returns the Point2D class
    public static Point2D findPoint(Point2D a, Point2D b, double d) {
        //d can only be between 0 and 1, return null if it not.
        if (d < 0 || d > 1){
            return null;
        }

        //uses the formula given in the challenge prompt it gets the values
        double x = a.getX() + ((b.getX()- a.getX()) * d);
        double y = a.getY() + ((b.getY()- a.getY()) * d);

        //then creates a new object from the class Point2D
        //its the same way you create a new Scanner from the scanner, it follows the same syntax Scanner scan = new Scanner(System.in);
        //this time it will take 2 variables because in the constructor (in Point2D.java) it takes 2 double values to create an instance of the class
        Point2D P = new Point2D(x, y);
        
        //then finially returns the Point2D object
        return P;
    }
    public static void main(String[] args){
    }
}