import java.util.*;

public class ParentClass {
	private String name;

	public ParentClass(String name){
		this.name = name;
	}

	public void setName(String name) {this.name = name;}
	public String getName()	{return this.name;}
}

//subclass of parent class, inherits private name
class Applicant extends ParentClass {
	public String[] applicantSkills;

	public Applicant(String name, String[] applicantSkills){
		// uses the super's constuctor to create the object with the name
		super(name);
		// then assigns the array to the subclass's attribute
		this.applicantSkills = applicantSkills;
	}
}

class Employer extends ParentClass {
	private String[] desiredSkills;

	public Employer(String name, String[] desiredSkills){
		super(name);
		this.desiredSkills = desiredSkills;
	} 

	public List<String> ShortlistedApplicants(List<Applicant> listOfApplicants) {
		ArrayList<String> namesOfApplicants = new ArrayList<String>();

		//goes through the applicant objects
		for (Applicant applicant : listOfApplicants){
			
			//then gets the skill array from the applicant and gets the string and goes through every single skill
			for (String applicantSkill : applicant.applicantSkills) {
				
				//then checks all of desired skills within the employer's array to see for a match
				for (String desiredSkill : desiredSkills) {
					
					// then checks if the applicant's skill matches
					if (applicantSkill.toUpperCase().equals(desiredSkill.toUpperCase())){

						//then adds it to the applicants that have the skill
						namesOfApplicants.add(applicant.getName());
					}
				}
			}
		}
		//after the loop is completed the duplicate applicants have to be removed
		//then makes a new set from the array list to remove all duplicates, linked hashset makes sure its still the same order
		Set<String> set = new LinkedHashSet<>(namesOfApplicants);

		//removes all items from the original list
		namesOfApplicants.clear();
		// then adds all the new (without duplicates) set back into the list
		namesOfApplicants.addAll(set);
		
		return namesOfApplicants;
	}
}