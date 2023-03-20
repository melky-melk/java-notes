public class Loops{
    public static void main(String[] args){
        //four kinds of loops
        //while loop
        //for loop
        //do while loop
        //for each loop

        int i = 0;

        while (i < 10 ){ //while condiyion
            System.out.println(i);
            i++; //i += 1;

        }

        //a do while loop runs the code inside the brackets first then checks the condition. it always runs at least once
        //if the condition is not met the first time it does not run because the condition comes out at the bottom
        //checks condition after the loop
        //while checks before it runs

        int i = 10;

        do {
            System.out.println(i);
            i --; //i -= 1;
        } while (i < 0);
        
        //it will do the block of code inside and THEN check the condition to see if it will do it again
        //even if the number entered was already negative, say i was equal to -1 it will still print - 1 once before the condition is not true and it stops
        
        //for (initialisation; condition; change) {do something} very compact way of doing a while loop
        for (int i = 0; i < 10; i ++){
            System.out.println(i);
        }

        //iterates through everything inside a collection or array, like you typical for loop in python
        //for item in list: 
        
        //to create an empty array
        int[] arrayName = new int[specify length of array];

        //can change variable name for the elements like item or some shit
        //have to declare the variable type for the elements inside the loop
        for (int elem : arrayName) {
            System.out.println(elem); //prints each element in the array
            //cannot tell what indice or index you are at better using a for loop and iterating
            //for getting a sum or something this is better
        }   
        
    } 
}