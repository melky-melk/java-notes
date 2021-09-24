import java.util.HashMap;

public class Hashmap{
    public static void main(String[] args){
        //Hash maps are an array where instead of indices is determined by some coded version of the key 
        //like a python dictionary
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //have a placeholder sand "generics" because we dont want to write a new class for a collection of different objects you use a has map
        // dont want to write string and integer as its own class. generics use some reference type then later can create the full class

        //in the hashmap above you create a key string and an integer as its holder
        // all the keys have to be disctinct while the numbers inside can be the same
        //making a new key
        map.put("One", 1);

        //getting a key using mapName.get(key);
        map.get("One"); //will return 1

        map.get("melk"); //will print null because melk is not put in the map yet
    }
}