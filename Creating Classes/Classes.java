//this is just making a class however this class will only work inside of this file, because it is not a public class (a little confusing but you can dm me if you need melk#9755)
class Book {
	//creating attibutes goes in this space before
    //these are all instance attributes
    //private vairables are only accessivble from within the class file itself if there was a runner file that tried to access the private title there would be an error 
    private String title; 
    public String author;
    public int numOfPages;
    //can make some of the attributes pre-initialised
    public String genre = "Fantasy";
    //constructor for making objects from clases this just makes the things put within the brackets of the constructor the attributes of the object
    public Book(String title, String author, int numOfPages){
        //need to use this. to tell java that you want to modify the instance attributes to the parameters provided when the user creates the class
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }
    //getter and setter methods make it so where you can access private attributes without changing the variable
    //it is not public static string because it is an instance of an object, and thus is not static.
    public String getTitle(){
        return this.title;
    }

    //similarly, setter methods enable private attributes to be changed in runner classes
    public void setNumberOfPages (int numberOfPages){
        this.numOfPages = numberOfPages;
    }
}

//this is the one thats run
public class Main {
    public static void main(String[] args){
        //creating an object of the class book. the same way to how you would make scanner objects
        //like in python, putting the values needed for the attributes
        Book hobbit = new Book("The Hobbit", "Tolkien", 301);
        //can also change the attributes outside like this: (this is usually frowned upon because changing things outside is a bit more messy) 
        hobbit.numOfPages = 100;
    }
}