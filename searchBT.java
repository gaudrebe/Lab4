import org.w3c.dom.Node;

public class searchBT extends BinaryTree {
	
	public boolean contains(BinaryNode node, int item) {
		if(node == null) {
			return false;
		} else {
			if(node.data == item) {
					return true;
				} else {
					return contains(node.left.data, item) || contains(node.right.data, item);
			}
		}
	}

	public int getLevel(BinaryNode node, int item) {
		if (node == null) {
			return -1;
		} else {
			return Math.max(getLevel(node.left), getLevel(node.right)) + 1;
			
		}
	}
}
