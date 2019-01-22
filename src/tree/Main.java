package tree;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(13);
        tree.insert(30);
        tree.traverseInOrder();
        System.out.println("Post Order");
        tree.traversePostOrder();
        System.out.println("Pre Order");
        tree.traversePreOrder();
    }
}
