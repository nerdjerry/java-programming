package java;
import java.util.*;

public class TreeNode{
	private int value;
	private TreeNode leftChild;
	private TreeNode rightChild;

	TreeNode(int value){
		this.value = value;
	}

	public void insertLeft(int value){
		if(this.leftChild != null){
			TreeNode newNode = new TreeNode(value);
			newNode.leftChild = this.leftChild;
			this.leftChild = newNode;
		}else{
			this.leftChild = new TreeNode(value);
		}
	}

	public void insertRight(int value){
		if(this.rightChild != null){
			TreeNode newNode = new TreeNode(value);
			newNode.rightChild = this.rightChild;
			this.rightChild = newNode;
		}else{
			this.rightChild = new TreeNode(value);
		}
	}

	public void inOrder(){
		if(this.leftChild != null){
			this.leftChild.inOrder();
		}
		System.out.print(this.value);
		if(this.rightChild != null){
			this.rightChild.inOrder();
		}
	}

	public void postOrder(){
		if(this.leftChild != null){
			this.leftChild.postOrder();
		}
		if(this.rightChild != null){
			this.rightChild.postOrder();
		}
		System.out.println(this.value);
	}

	public void preOrder(){
		System.out.println(this.value);
		if(this.leftChild != null){
			this.leftChild.preOrder();
		}
		if(this.rightChild != null){
			this.rightChild.preOrder();
		}
	}

	public void bfs(){
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(this);
		while(!queue.isEmpty()){
			TreeNode node = queue.remove();
			System.out.println(node.value);
			if(node.leftChild != null){
				queue.add(node.leftChild);
			}
			if(node.rightChild != null){
				queue.add(node.rightChild);
			}
		}
	}

	public void insertBST(int item){
		if(this.value == item){
			return;
		}
		if(this.value > item && this.leftChild != null){
			this.value.leftChild.insertBST(item);
		}else if(this.value > item){
			this.leftChild = new TreeNode(item);
		}else if(this.value < item && this.rightChild != null){
			this.value.rightChild.insertBST(item);
		}else if(this.value < item){
			this.rightChild = new TreeNode(item);
		}
	}
}