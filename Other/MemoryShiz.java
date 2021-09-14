public class MemoryShiz{
    public static void main(String[] args){
        // every time a method is called it will be placed on s astack
        // the Heap is a seperate memory space which objects are dynamically created
        // whenever new is used the moemory for the object 
        // stack deletes things when it is not being used annymore
        // heap deletes things when it is no longer in the scope

        // the array has a chunk of memory next to each otehr 
        // when you assign an array to the same thing it points to the same array rather than making a copy of it equals something else
        int x = 5;
        int[] array = new int[16];
        int[] alias = array;
        
        int y = x; // different allocation
        // when you use int is has 2 different places in the memory assigned to it 
        // reference types = simply point 

        // garbage collector collects everything and deletes everything that is not being used anymore
        // because of this we dont worry about memory management anymore

        // in c and c++ you have to delete things manually

        // when you create a new object then later use the object to create a new one again, then the old object is not deleted and thus will take up memory for no reason
        // if the garbage collector sees this it makes the old one for deletion

        // if the garbage collector sees that there is an item that has other variables depending on it then it will not delete it 
    }
}