import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IntTree {
    private IntTreeNode keyRoot;

    //constructor - empty tree
    public IntTree() {
        keyRoot = null;
    }

    //method to add value to root
    public void add(int value) {
        keyRoot = add(keyRoot, value);
    }

    //method to add value to tree - lower value to left child, higher to right child
    private IntTreeNode add(IntTreeNode root, int value) {
        if(root == null){
            root = new IntTreeNode(value);
        } else if(value< root.data){
            root.left = add(root.left, value);
        }
        else {
            root.right = add(root.right, value);
        }
        return root;
    }

    //method to print all values in order - lowest to highest
    public static void printInOrder(IntTreeNode root) {
        if(root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        IntTree theTree = new IntTree();

        //Scanner comma-separated data into the binary tree from text-file
        Scanner scanner = new Scanner(new File("DistancesInJylland.txt"));
        scanner.useDelimiter(",");
        while (scanner.hasNextInt()) {
            theTree.add(scanner.nextInt());
        }
        //prints data in order
        printInOrder(theTree.keyRoot);
    }
}
