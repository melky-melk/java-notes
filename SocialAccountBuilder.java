public class SocialAccountBuilder{

	private String firstName;
	private String lastName;
	private String location;
	private String phoneNumber;
	private String email;
	private String profileURl;
	private String bio;
	private int age;
	private SocialAccount[] importedFriends;

	public SocialAccountBuilder(String firstName, String lastName){
		assert firstName != null && lastName != null;
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// returns the social account so you can stack method calls on top 
	public SocialAccountBuilder setAge(int age){this.age = age;}
	public SocialAccountBuilder setFirstName(String firstName) {this.firstName = firstName;}
	public SocialAccountBuilder setLastName(String lastName) {this.lastName = lastName;}
	public SocialAccountBuilder setLocation(String location) {this.location = location;}
	public SocialAccountBuilder setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public SocialAccountBuilder setEmail(String email) {this.email = email;}
	public SocialAccountBuilder setProfileURl(String profileURl) {this.profileURl = profileURl;}
	public SocialAccountBuilder setBio(String bio) {this.bio = bio;}

	public SocialAccount build(){
		// anything that hasnt been initialised will be made into null
		return new SocialAccount(firstName, lastName, location, phoneNumber, email, profileURl, bio, age, importedFriends);
	}
}