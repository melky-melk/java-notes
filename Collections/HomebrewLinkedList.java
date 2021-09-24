public class HomebrewLinkedList<T> {
	private Node<T> head;
	private long size;

	public HomebrewLinkedList(){
		//when you create it initially there is nothing inside
		this.size = 0;
		this.head = null;
	}

	public long size(){return this.size;}

	// adding a node with the T value to the very end of the linked list 
	public void add(T value){
		// create a new node from the value because its at the end set the next as null (pointing to nothing)
		Node newNode = new newNode(value);
		newNode.setNext(null);

		// if there is nothing inside the list set the first node, the head as the newNode
		if (this.size == 0){
			head = newNode;
			return;
		} 

		//initially sets the node current node as head (the first node in the sequence) 
		Node<T> current = this.head;

		//when current node points to null that means it points to nothing meaning that node is the last in the list
		// therefore this loop wont break until it gets to the last in the list (kind of like a stupid for each loop but very much not)
		while(currentNode.getNext() != null){
			// by making currentNode = currentNode.next, it moves the current node to the next node in the list until it gets to the next
			// returns the LOCATION of the next node rather than the object of it so current node is actually the thing 
			currentNode = currentNode.getNext();
		}

		// after the loop the current node is the last node in the list
		// so by setting the .next as the newNode it attaches the newNode at the end (also remember when newNode was created it's next was assigned to null)
		currentNode.setNext(newNode);
		
		this.size ++;
	}

	// replaces old node with a new element and returns the old element
	public void set(int index, T val){
		//again does the whole current node thing
		Node<T> currentNode = this.head;
		int count = 0;
		
		// goes through the linked list until the index is reached
		while(count < index){
			//each time the count is increased it gets the corresponding node
			currentNode = currentNode.getNext();
			count ++;
		}

		// once the loop is finished the current node is the one specified in the index and thus you can simply set the new valuez
		currentNode.setValue(element);
		// (because the tutorial was stupid it wanted you to return the old element so this is here just cuz ) T oldElement = currentNode.getValue(); return old element
	}

	// if you were to get the node would you get the pointer
	public void get(int index){
		//same shit as the previous method
		Node<T> currentNode = this.head;
		int count = 0;
		
		while(count < index){
			currentNode = currentNode.getNext();
		}

		// return currentNode.getValue(); 
	}

	//remove the node at the index, get the previous node and the one the node at the index was pointing to and make the previous node point to the one after the removed one
	// essentially take it out and stitch the previous and one after it together
	public void remove(int index){
		//because we remove shit we need to keep track of both the current node (the one we eventualy get rid of) and the one before it
		Node<T> currentNode = head;
		// there is nothing before head so its just null for now
		Node<T> previousNode = null;

		int count = 0;
		while (count < index){
			// moving things over, previous is now current, current is now next 
			previousNode = currentNode;
			currentNode = currentNode.next();
		}

		
		// if the previousNode is still null that means that the head needs to be removed (because the index would have to be 0 for previousNode to still be null)
		if (previousNode == null) {
			head = currentNode.getNext();

		// otherwise the current node 
		} else {
			// PAY NO ATTENTION TO THIS PART IT WAS BECAUSE YOU HAVE TO RETURN T FOR IT INITUALLY BUT LIKE YOU DONT BECAUSE I CHANGED IT TO VOID T value = currentNode.getValue();
			
			// set the node just before the one that is being removed (the previous node) and make it's next equal to the the node after the node you want to remove
			prevNode.setNext(currentNode.getNext());
			// this causes the node at the specified index to be deleted because nothing is refercing it anymore 
			//SO YOU DONT ACTUALLY REMOVE IT, YOU JUST MAKE THE LIST LINK TO HE OTHER THING, THEN THE GARBAGE COLLECTOR DELETES IT, 
			// YOU LOSE ALL REFERENCE TO IT SO IT AUTOMATICALLY DELETES IT NO ONE COULD EVER FIND IT SO IT DELETES ON ITS OWN
		}
		
		// return value;
		
	}
}

// every node has a value inside and is able to retrieve the value of the next Node 
// the final node will point to null 
// the head pointer has a start that point to the first thing, then it can follow the next thing 

class Node<T> {
	private T value;
	private Node<T> next;

	public Node(T value){
		this.value = value;
	}

	public T getValue(){return this.value;}
	public Node<T> getNext(){return this.next;}

	public void setNext(Node<T> nextNode){
		this.next = nextNode;
	}
}

// // starts at the head then works down current node pointer that points to the head

// // keeps going
// while (true){
// 	// gets the next value for the nodes and sets it as next
// 	Node<T> next = temp.getNext()

// 	// if the next one is null then it is at the end of the list
// 	if (next == null){
// 		// then sets the previous one to the next thing 
// 		temp.setNext(newNode);
// 		// creates the new node for the end of the list
// 		newNode.setNext(null);

// 		break;
// 	}
// } NULL CHECKS IF ANIMAL = nuLL IF WHICH CHECK 