/*1)WAP to implement a Binary tree and perform following operations
a)Create a binary tree
b)Insert a node
c)Delete anode
d)Perform Preorder, Inorder, Postorder traversals on tree*/
class BTPract{
	Node root ;
	public static class Node{
		
		int data;
		Node left, right;
	    Node(int d){
			data = d;
			right = left = null;
		}
	}
	
	void Inorder(Node node){

		if(node==null)
			return;
		Inorder(node.left);
		System.out.println(node.data);
		Inorder(node.right);
	}
	
	void Preorder(Node node){
		if(node==null)
			return;
		System.out.println(node.data);
		Preorder(node.left);
		Preorder(node.right);
	}
	
	void Postorder(Node node){
		if(node==null)
			return;
		
		Preorder(node.left);
		Preorder(node.right);
		System.out.println(node.data);
		
	}
	void inorder(){
		Inorder(root);
	}
	void preorder(){
		Preorder(root);
	}
	void postorder(){
		Postorder(root);
	}
	public static void main(String... args){
		BTPract bt = new BTPract();
		bt.root = new Node(10);
		bt.root.left = new Node(20);
		bt.root.right = new Node(30);
		bt.root.left.left = new Node(40);
		bt.root.left.right = new Node(50);
		bt.root.right.left = new Node(60);
		bt.root.right.right = new Node(70);
		bt.insert(99);
		System.out.println("Inorder");
		bt.inorder();
		System.out.println("Preorder");
		bt.preorder();
		System.out.println("Postorder");
		bt.postorder();
		
		
	}	
}