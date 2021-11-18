import java.util.Arrays;

public class Pascals {
	/* 
	Pascals triangle 
	
			1
		   1 1
		  1 2 1
		 1 3 3 1
		1 4 6 4 1
	*/

	// gives the nth row, if it was pascal(5) it would give 1 4 6 4 1 
    public static List<Integer> pascal(int n) {
        List<Integer> values = new ArrayList<>();

        //base cases
        if (n == 0) {
            values.add(1);
            return values;
        }
        if (n == 1) {
            values.add(1);
            values.add(1);
            return values;
        }

        //recursive case

		// add the 1 to the beginning first
        values.add(1);

		// get the row above it
        List<Integer> lineAbove = pascal(n-1);

		// goes through the line on top and adds the 2 values above 
        for(int i = 1; i < lineAbove.size(); i++) {

			// for line 5 the line above is line 4, so 1 3 3 1
			// 1 has already been added
			// 1 + 3 = 4, so the one underneath in line 5 is 4
			// the return list now having 1, 4
            int num = lineAbove.get(i-1) + lineAbove.get(i);
            values.add(num);
        }
		
		//then adds to the end of the list 
        values.add(1);

        return values;
    }

    public static void main(String[] args) {
        System.out.println(pascal(4).toString());
        System.out.println(pascal(8).toString());
    }
}