
public class searchBT extends BinaryTree {
	
	public boolean contains(int item) {
		if(BinaryNode.data == null) {
			return false;
		} else {
			if(BinaryNode.data == item) {
					return true;
				} else {
					if(BinaryNode.left || BinaryNode.right) {
						BinaryNode.left.contains(item);
						BinaryNode.right.contains(item);
					} else {
						return false;
					}
			}
		}
	}

	public int getLevel(int item) {
		return -1;
	}
}
