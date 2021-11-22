import java.util.*;

public class FamilyMember {
	private String name;
	private int age;
	private ArrayList<FamilyMember> children;

	public FamilyMember(String name, int age){
		this.name = name;
		this.age = age;
		this.children = new ArrayList<>();
	}
	
	//need to get all of the children from inside
	public ArrayList<FamilyMember> getAll() {
		ArrayList<FamilyMember> currentChildren = new ArrayList<>();
		// it adds itself first no matter what (this ensures that every element in the tree is added because once this is called it will add itself and later it ensure that every child in the tree is called)
		currentChildren.add(this);

		// base case is when it reaches the family member has no children inside then its tree is just itself
		if (this.children.size() == 0){
			return currentChildren;
		}
		
		for (FamilyMember child : this.children){
			// assume that this will return all the children in the tree
			currentChildren.addAll(child.getAll());
		}

		return currentChildren;
	}

	
	// will get all the emebers that do have children 
	public ArrayList<FamilyMember> getParents() {
		ArrayList<FamilyMember> currentChildren = new ArrayList<>();
		// it adds itself first no matter what 
		// base case is when it reaches the family member has no children inside then its tree is empty
		if (this.children.size() == 0){
			return currentChildren;
		} 

		// only adds itself if it has children
		currentChildren.add(this);

		// otherwise, if they do have children it is added to the tree
		for (FamilyMember child : this.children){
			// assume that this will return all the children in the tree
			currentChildren.addAll(child.getParents());
		}

		return currentChildren;
	}

	
	public ArrayList<FamilyMember> getChildren() {
		ArrayList<FamilyMember> currentChildren = new ArrayList<>();
		// base case is when it reaches the family member has no children inside then its tree is empty
		if (this.children.size() == 0){
			// only adds itself it doesnty have any children
			currentChildren.add(this);
			return currentChildren;
		} 
		
		// otherwise, if they do have children it is added to the tree
		for (FamilyMember child : this.children){
			// assume that this will return all the children in the tree
			currentChildren.addAll(child.getChildren());
		}

		return currentChildren;
	}
	
	public void addChild(FamilyMember child) {this.children.add(child);}

	public static void main(String[] args) {
		FamilyMember jeremy = new FamilyMember("Jeremy", 69);
		FamilyMember sarah = new FamilyMember("Sarah", 69);
		FamilyMember meredith = new FamilyMember("Meredith", 69);
		FamilyMember kelly = new FamilyMember("Kelly", 69);
		FamilyMember james = new FamilyMember("James", 69);
		FamilyMember fred = new FamilyMember("Fred", 69);
		FamilyMember david = new FamilyMember("David", 69);
		FamilyMember fiona = new FamilyMember("Fiona", 69);

		james.addChild(david);
		james.addChild(fiona);

		sarah.addChild(james);
		sarah.addChild(fred);
				
		meredith.addChild(kelly);
		
		jeremy.addChild(sarah);
		jeremy.addChild(meredith);

		ArrayList<FamilyMember> tree = jeremy.getParents();
		for(FamilyMember e: tree) {
			System.out.println(e.name);
		}
	}
}