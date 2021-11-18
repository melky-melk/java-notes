import java.util.*;
import java.io.*;

public class AnonymousClasses{
	public static void main(String[] args){
		
		// implements the class with the methods, and overwrites them on the spot
		EncodeAndSayHi x = new EncodeAndSayHi(){
			
			// must match the return types
			// for every character in the string, it gets the unicode equivalent
			public String encode(String message){
				String result = "";
				
				for (int i = 0; i < message.length(); i++){
					result += (int) message.charAt(i) + " ";
				}

				return result;
			}

			public void sayHi(){
				System.out.println("hi");
			}
		};

		System.out.println(x.encode("BLEG"));
		x.sayHi();
	}
}