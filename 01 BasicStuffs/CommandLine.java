public class CommandLine{
    //makes and array from String[] from the command line. args are the strings within  
    public static void main(String[] args){
        //takes the command line arguments assigned in the previos lines of code. i.e. the String[] array and assigns it to the variable "name"
        String name = args[0];
        String name1 = args[1];

        System.out.println(name + " " + name1);
    }
}