
public class aggregateBT extends BinaryTree{
    
    public int sumLessThan(int item) {
        return sumLessThan(root, item);
    }
    
    private int sumLessThan(BinaryNode node, int item) {
        if (item == 0) {
            return 0;
        }
        else if (node.left.data > item || node.right.data > item) {
            return 0;
        }
        else {
            return sumLessThan(node.left, item) + sumLessThan(node.right, item);
        }
    }
    
    private int findMax() {
        return findMax(root);
    }
    
    public int findMax(BinaryNode node) {
        if (node.data == 0) {
            return 0;
        }
        else if (node.left.data > node.data) {
            return node.left.data;
        }
        else if (node.right.data > node.data) {
            return node.right.data;
        }
        else {
            return node.data;
        }
    }

}
