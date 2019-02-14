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

    public TreeNode delete(int value) {
        if (value < data) {
            this.leftChild = this.leftChild.delete(value);
            return this;
        } else if (value > data) {
            this.rightChild = this.rightChild.delete(value);
            return this;
        } else {
            //Case 1
            if (this.leftChild == null && this.rightChild == null) {
                return null;
            }//Case 2
            else if (this.leftChild != null && this.rightChild == null) {
                TreeNode child = this.leftChild;
                this.leftChild = null;
                return child;
            } else if (this.rightChild != null && this.leftChild == null) {
                TreeNode child = this.rightChild;
                this.rightChild = null;
                return child;
            } else {
                this.data = this.leftChild.max();
                this.leftChild = this.leftChild.delete(this.data);
                return this;
            }
        }
    }
}
