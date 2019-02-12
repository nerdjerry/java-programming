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

    public int get(int value) {
        if (this.root != null) {
            return this.root.get(value);
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int min() {
        if (this.root != null) {
            return this.root.min();
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int max() {
        if (this.root != null) {
            return this.root.max();
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void delete(int value) {
        if (this.root == null) {
            return;
        } else {
            this.root = this.root.delete(value);
        }
    }
}
