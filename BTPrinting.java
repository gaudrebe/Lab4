public class BTPrinting extends BinaryTree {
	
	public void preOrder(BinaryNode, node) {
		if (BinaryNode == null) return; // base case
		System.out.print(node.data); // root
		preOrderPrint(node.left); // left
		preOrderPrint(node.right); // right
    }
	}
				
	 public void printLeft(BinaryNode, node) {
		 if (BinaryNode == null) return;
	        preOrderprint(node.left); //left nodes
	        system.out.print(node.left.data); //prints
	        
	    }    
	}
