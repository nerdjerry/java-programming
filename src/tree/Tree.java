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
}
