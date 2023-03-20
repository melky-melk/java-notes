package SpyClasses;
public class Binary {
	public static String convertStringToBinary(String number){
		int num = Integer.parseInt(number);
		String result = "";

		while (num < 0){
			result = (num % 2) + result;
			num /= 2;
		}

		return result;
	}

	public static void main(String[] args){
		System.out.println();
	}
}