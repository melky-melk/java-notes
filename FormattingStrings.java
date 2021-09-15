public class FormattingStrings{
    public static void main(String[] args){
        String msg = "hehe nice";
        int num = 69;
        
        //%s specifies that it is a string like in {} ut with specific data types. the number 20 infront specifies how much it is being padded by, and the negative infront of the 20 means its on the right side
        //%3 would make the number padded out by 3. but putting %03 makes the number padded out with 0's till the length is 3 d specifies that it is an integer
        // \n meaning a new line character
        System.out.printf( "%-20s%03d \n", msg, num);
		//will print
		//hehe nice           069

		double money = 24.5; 
		// will be to 2 decimal points, the f specifies that its a floating point number, in this case a double
		System.out.printf("$%.2f\n", money);
		//will print:
		//$24.50
    }
}