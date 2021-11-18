public class SocialAccount {

	private String firstName;
	private String lastName;
	private String location;
	private String phoneNumber;
	private String email;
	private String profileURl;
	private String bio;
	private int age;
	private SocialAccount[] importedFriends;


	public SocialAccount(String firstName, String lastName, int age, String location, String phoneNumber, String email, String profileURl, String bio, SocialAccount[] importedFriends){
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.profileURl = profileURl;
		this.bio = bio;
		this.age = age;
		this.importedFriends = importedFriends;
	}

	// public SocialAccount(String firstName, String lastName){
	// 	this.firstName = firstName;
	// 	this.lastName = lastName;
	// }

	// public SocialAccount(String firstName, String lastName, int age){
	// 	this.firstName = firstName;
	// 	this.lastName = lastName;
	// 	this.age = age;
	// }

	//DOESNT WORK BECAUSE THERE ARE 2 STRING PARAMETER OVERLOAD
	/*
	public SocialAccount(String firstName, String lastName, String phoneNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	public SocialAccount(String firstName, String lastName, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	*/

	public static void main(String[] args){
		SocialAccount alex = new SocialAccount("Alex", "Smith", 21, null, null, null, null, "www.profile.com", "");
		SocialAccount bill = new SocialAccount("Bill", "Damon", 19, null, "314159265", null, null, "Small bio");
		SocialAccount carl = new SocialAccount("Carl", "Grimes", 16, "Georgia", null, null, null, null);

		SocialAccount gregs = new SocialAccount("GREG", "GREG", 0, null, null, null, null, null);
		SocialAccount marijuanaBuilder = new SocialAccountBuilder("Mary", "Jane").build();
		// marijuanaBuilder.setAge(20);
		// marijuanaBuilder.setEmail("mary@gmail.com");
		// SocialAccount mary = marijuanaBuilder.builder();

		// REFACTOR APP USING THIS
		SocialAccount greg = new SocialAccountBuilder("GREG!", "GREG!").setAge(20)
																	   .setEmail("greg!@gmail.com")
																	   .build();

		SocialAccount greg = new SocialAccountBuilder("GREG!", "GREG!").setAge(20).setEmail("greg!@gmail.com").build();
		
		
	}
}