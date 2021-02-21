public class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;

    //Leaf-constructor
    public IntTreeNode(int data) {
        this(data, null, null);
    }

    //Constructor - parent and two children
    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}
