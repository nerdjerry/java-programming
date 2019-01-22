package tree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    //Recursively insert nodes
    public void insert(int value) {
        if (this.data == value) {
            return;
        }
        if (this.data > value) {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(value);
            } else {
                this.leftChild.insert(value);
            }
        } else {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(value);
            } else {
                this.rightChild.insert(value);
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void traverseInOrder() {
        if (this.leftChild != null) {
            this.leftChild.traverseInOrder();
        }
        System.out.print(this.data + ", ");
        if (this.rightChild != null) {
            this.rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(this.data + ", ");
        if (this.leftChild != null) {
            this.leftChild.traversePreOrder();
        }
        if (this.rightChild != null) {
            this.rightChild.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (this.leftChild != null) {
            this.leftChild.traversePreOrder();
        }
        if (this.rightChild != null) {
            this.rightChild.traversePostOrder();
        }
        System.out.print(this.data + ", ");
    }

    public int get(int value) {
        if (this.data == value) {
            return this.data;
        } else if (this.data > value) {
            if (this.leftChild != null) {
                return this.leftChild.get(value);
            }
        } else {
            if (this.rightChild != null) {
                return this.rightChild.get(value);
            }
        }
        return Integer.MIN_VALUE;
    }

    public int min() {
        if (this.leftChild != null) {
            return this.leftChild.min();
        } else {
            return this.data;
        }
    }

    public int max() {
        if (this.rightChild != null) {
            return this.rightChild.max();
        } else {
            return this.data;
        }
    }
}
