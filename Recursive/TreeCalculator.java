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
			case '-':
				return (calculate(node.left) - calculate(node.right));
			case '*':
				return (calculate(node.left) * calculate(node.right));
			case '/':
				return (calculate(node.left) / calculate(node.right));
			default:
				return -1;
		}
	}

	// the initial start one should be the root
	public static boolean solution(Node t, int s) {
        //If just one of left or right was null, then it was not a child node and false can be returned safely
        // if its null that means that it couldnt keep going all the way to the left or all the way to the right and thus is not a leaf its just a part of the branch that isnt there
        if(t == null) return false;

        //If this is a child AND sum is input, then we have a path
        // if this is at the bottom, meaning it doesnt have any left or right input then you can do the evaluation and return the boolean
        // where the S value has been continously modified down, instead of incrementing the t
        if(t.left == null && t.right == null) {
            return (s == t.number);
        }

        // the or statement forces it to go down to the left first and calculate it all the way down until it hits a base case
        // once it hits the bottom it will return evaluate to true or false, if true that means that at least one of the branches are true as it keeps going
        // IF THIS IS FALSE, LIKE THE T.LEFT IS FALSE THEN IT MOVES TO THE T.RIGHT TO CHECK THAT ONE
        // but it also does both when the first is put on 
        return solution(t.left, s-t.number) || solution(t.right, s-t.number);
    }

	public static void main(String[] args){
	}
}