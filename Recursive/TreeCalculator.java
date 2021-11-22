enum NodeTypes {NUMBER , OPERATOR }

class Node {
	NodeTypes type; 
	int number ; 
	char operator; 
	Node left;
	Node right;

	Node (char operator, Node left, Node right ){ 
		type = NodeTypes.OPERATOR ;
		this.operator = operator;
		this.left = left; 
		this.right = right;
	}

	Node(int number) { // Constructor for creating a node of type NUMBER 
		this.type = NodeTypes.NUMBER ;
		this.number = number ;
	}
}

public class TreeCalculator{
	// takes the first node in the series tracks all the way down then goes back up
	public static double calculate(Node node){
		// base case is once it reaches the very bottom it should return its number so it can be used at the very end (because the return type is an int)
		// the base case return part should match the return type of the function
		if (node.type == NodeTypes.NUMBER){
			return node.number;
		}

		// if its not a number it must be an operator
		switch (node.operator){
			// gets the nodes below it and performs the operation (because the base case is a number assume that the things below is always a number)
			// the recursive case is the fact it takes a node, and calls the function until it gets down to a number
			// assume the calculate(node.left) or right returns the number you need
			case '+':
				return (calculate(node.left) + calculate(node.right));
				// return (node.left) + node.right);
				break;
			case '-':
				return (calculate(node.left) - calculate(node.right));
				break;
			case '*':
				return (calculate(node.left) * calculate(node.right));
				break;
			case '/':
				return (calculate(node.left) / calculate(node.right));
				break;
		}
	}

	public static void main(String[] args){
	}
}