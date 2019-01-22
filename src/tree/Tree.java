package tree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (this.root != null) {
            this.root.insert(value);
        } else {
            this.root = new TreeNode(value);
        }
    }

    public void traverseInOrder() {
        if (this.root != null) {
            this.root.traverseInOrder();
            System.out.println();
        } else {
            System.out.println("Empty Tree");
        }
    }

    public void traversePreOrder() {
        if (this.root != null) {
            this.root.traversePreOrder();
            System.out.println();
        } else {
            System.out.println("Empty Tree");
        }
    }

    public void traversePostOrder() {
        if (this.root != null) {
            this.root.traversePostOrder();
            System.out.println();
        } else {
            System.out.println("Empty Tree");
        }
    }
}
