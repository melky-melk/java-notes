/*
Using the following class Song,Write an anonymous class/lambda that will allow you to sort the
elements in a list of Songs with a certain property.
Implement the different sorting methods.
• Sort the list of songs using title
• Sort the list of songs using author
• Sort the list of songs using duration
*/

class Song {
	private String title;
	private String author;
	private double duration;
	
	public Song(String title, String author, double duration) {
		this.title = title;
		this.author = author;
		this.duration = duration;
	}
	
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	public double getDuration() {return duration;}

 	public static void sortByTitle(List<Song> songs) {
        Collections.sort(songs, (Song s1, Song s2) -> s1.getTitle().compareTo(s2.getTitle()));
		
    }

	public static void sortByTitleNotLambda(List<Song> songs){

		// creates a new comparator OBJECT from the Comparator class 
		Collections.sort(songs, new Comparator<Song>() {
            public int compare(Song s1, Song s2) {
                return s1.getTitle().compareTo(s2.getTitle());
            }
        });

		//---------------THE SAME AS-------------------

		Comparator comparator = new Comparator(){
			public int compare(Song s1, Song s2) {
                return s1.getTitle().compareTo(s2.getTitle());
            }
		};

		Collections.sort(songs, comparator);
	}

    public static void sortByAuthor(List<Song> songs) {
        Collections.sort(songs, (Song s1, Song s2) -> s1.getAuthor().compareTo(s2.getAuthor()));

		// comaparator methods overwrite the functional interface method compare, which returns an integer
		Comparator comparator = (Song s1, Song s2) -> s1.getAuthor().compareTo(s2.getAuthor());
		Collections.sort(songs, comparator);
    }

    public static void sortByDuration(List<Song> songs) {
        Collections.sort(songs, (Song s1, Song s2) -> s1.getDuration() < s2.getDuration() ? -1 : 1 );
    }
}

public class Comparator {
	public static void main(String[] args){
		List<Song> songs = new ArrayList<Song>();
    
        songs.add(new Song("Lake's End", "Cicada", 4.53));
        songs.add(new Song("Metropolis", "Berndsen", 3.18));
        songs.add(new Song("Told You!", "Cicada", 3.10));
    
        sortByTitle(songs);
        System.out.println(songs);
    
        sortByAuthor(songs);
        System.out.println(songs);
    
        sortByDuration(songs);
        System.out.println(songs);

		// 
		HashMap<String, Integer> map = new HashMap<>();

		map.put("name", 1);
		// int num = map.get("name");
		// value.contains
		map.values().removeIf((value) -> value.equals(1));
	}
}

/*
After finishing the previous exercise, rewrite your comparator objects with lambda expression for
your program. The comparator interface is a functional interface that requires implementing just one
method.

An anonymous class in Java is a class not given a name and is both declared and instantiated in a single statement. 
You should consider using an anonymous class whenever you need to create a class that will be instantiated only once.
*/