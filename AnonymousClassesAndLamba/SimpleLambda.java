import java.util.HashMap;

interface Say {
	public void greeting(String str);
}

public class SimpleLambda{
	public static void main(String[] args){
		Say english = (str) -> System.out.println(str); 
		english.greeting("this will be the parameter greeting and will print greeting");
		english.greeting("everytime i use english.greeting() it will just print the statement");

		Say troll = (str) -> System.out.println("sike get jbaited");
		troll.greeting("this will print sike get jbaited");

		
		HashMap<String, Integer> map = new HashMap<>();

		map.put("name", 1);

		// int num = map.get("name");
		// value.contains
		map.values().removeIf((value) -> value.equals(1));
	}
}