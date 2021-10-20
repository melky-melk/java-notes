public class Bond implements Spy {

	public String encode(String val){
		String result = "";

		// increment each characters ascii value

		for (char c : val.toCharArray()){
			int ascii = c;
			ascii++;
			char newChar = (char) ascii;
			
			result += newChar;
		}

		return result;
	}

	public void talk() {
		System.out.println("The name's Bond, James Bond");
	}

	public static void main(String[] args){
		Bond james = new Bond();
		System.out.println(james.encode("abcwxy"));
	}
}