public class FormatTest{
    public static void main(String[] args){
        String msg = "hehe nice";
        int num = 69;
        
        //%s specifies that it is a string like in {} ut with specific data types. the number 20 infront specifies how much it is being padded
        //%3 would make the number padded out by 3. but putting %03 makes the number padded out with 0's till the length is 3 d specifies that it is an integer :|
        //%n is a line seperator in print formatting only
        System.out.printf( "%-20s%03d \n", msg, num);

		double money = 24.50; 
		// will be to 2 decimal points
		System.out.printf("$%.2f", money)
    }
}