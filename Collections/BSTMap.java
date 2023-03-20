/*
Binary Search Tree: 

Tree data structure where noes have 0, 1 or 2 children
For all nodes n: 

	n.key > n.left.key
	n.key < n.right.key

			10 
		  /    \
		5		15
	  /   \    /  \ 
	1 	  8  12   18

a tree data structure is essentially like a linked list where a node can have mutiple has .nexts'

a node can have multiple children, 10 is the root where 5 and 15 are its' children, we refer to its children as left and right
for all nodes in the structure the key of each node is greater than the key of it's left child, (10 is greater than 5)
but the key on thr right node must be greater than the node (15 is greater than 10)
same with all ths subchildren

say you are looking for a number, 12.

you start at 10, then go to the right because 12 is greater than 10
then get to 15 12 is less than 15 so it will be to the left of 15. 
*/ 
import java.lang.Comparable;

// starts with a public class that has 2 values for generics, K and V with K and V being reference types given when an object of the class is created e.g.
// BSTMap<String, Integer> K = String, V = Integer
// K extends Comparable<K> because K needs to be able to be compared with other keys by extending comparable you allow the code to use something like:
// key.compareTo(otherKey) this is explained more later on
// (K meaning key, V meaning value like a hashmap) 
public class BSTMap<K extends Comparable<K> , V> {

	// initial value it starts at
	public BSTNode<K, V> root;
	public long size; 

	public long getSize(){return this.size;}

	public BSTMap() {
		this.size = 0;
		this.root = null; 
	}

	/*
	for this its a bit more tricky because you need to search and where it can actually fit in the tree
	if it already exists then replace and overwrite
	if it doesnt then put in a new value 
	*/
	public void put(K key, V value) {
		
		
		BSTNode<K, V> node = new BSTNode<K, V> (key, value);

		// if there is nothing in the tree, just set it to be this node
		if (this.root == null) {
			this.root = node;
			this.size ++;
			return;
		}
		// to compare things you can use the interface comparable that is in K 

		//gets the original node as the temporary
		BSTNode<K, V> temp = this.root;

		while (temp != null) {
			//  key given in the parameters (where the person wants to put it) is compared to the key in the root node
			int comparisonValue = key.compareTo(temp.key);

			// if it returns 0 the keys are teh exact same you just replace the temp wit the new value (overwrite the old one)
			if (comparisonValue == 0) {
				temp.value = value;
			} 
			
			// if the comparison value is larger than 0 then the key is larger
			else if (comparisonValue > 0) {
				// if there is not a value yet given to the node, the new node can be added and the method is exited
				if (temp.right == null){
					temp.right = node; 
					return;
				}
				// otherwise it moves along to the next node and the loop repeats
				temp = temp.right;
	
			// if it is smaller 0 than the key is smaller than the current node, 
			} else {
				if (temp.left == null) {
					temp.left = node; 
					return;
				}
				// otherwise it moves along to the next node and the loop repeats
				temp = temp.left;
			}
		}
	}

	public V get(K key){
		if (this.root == null){
			return null;	
		}

		BSTNode<K, V> temp = this.root;

		while (temp != null) {
			//  key given in the parameters (where the person wants to put it) is compared to the key in the root node
			int comparisonValue = key.compareTo(temp.key);

			// if it returns 0 the keys are teh exact same you just return the value of the current node
			if (comparisonValue == 0) {
				return temp.value;
			} 
			
			// if the comparison value is larger than 0 then the key is larger
			else if (comparisonValue > 0) {
				// if there is not a value yet given to the node, the new node can be added and the method is exited
				// otherwise it moves along to the next node and the loop repeats until the value is found
				temp = temp.right;
			// if it is smaller 0 than the key is smaller than the current node, 
			} else {
				// otherwise it moves along to the next node and the loop repeats until the value is found
				temp = temp.left;
			}
		}

		//if the while loop is exited then the key must not exist within the tree
		return null;
	}

	public static void main(String[] args) {
		//Creates a string that implements comparable
		Comparable<String> a = "abc";
		String b = "bcd";

		// compares the two, will return -1 because a is less than b
		System.out.println(a.compareTo(b));


		BSTMap<String, Integer> map = new BSTMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 3);

		// prints C
		System.out.println(map.get("C"));
		// null
		System.out.println(map.get("Q"));
	}
}
// make sure that this K also extends Comparable
class BSTNode<K extends Comparable<K>, V> {

	// again because its geneic it can just define attributes like so
	public K key;
	public V value;
	// each node has 2 nodes for left and right left being the one smaller than, right being larger than
	public BSTNode<K, V> left;
	public BSTNode<K, V> right;

	public BSTNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
}