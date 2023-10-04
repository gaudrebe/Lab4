import org.w3c.dom.Node;

public class searchBT extends BinaryTree {
	
	public boolean contains(Node node, int item) {
		if(node == null) {
			return false;
		} else {
			if(node.data.compareTo(item) == 0) {
					return true;
				} else {
					return contains(node.left, item) || contains(node.right, item);
			}
		}
	}

	public int getLevel(int item) {
		if (BinaryTree.data == null) {
			return -1;
		} else {
			
		}
	}
}
