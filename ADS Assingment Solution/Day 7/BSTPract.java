class BSTPract{
	Node root;
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int key){
			this.data = key;
			right = left = null;
		}
	}
	
	Node Insert(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		else if(key<=root.data){
			root.left = Insert(root.left,key);
		}
		else{
			root.right = Insert(root.right,key);
		}
		return root;
	}
	
	void Inorder(Node n){
		if(n == null)
			return;
		
		Inorder(n.left);
		System.out.print(n.data+"  ");
		Inorder(n.right);
	}	
	
	void Preorder(Node n){
		if(n == null)
			return;
		
		System.out.print(n.data+"  ");
		Preorder(n.left);
		Preorder(n.right);
	}	
	
	void Postorder(Node n){
		if(n == null)
			return;
		
		Postorder(n.left);
		Postorder(n.right);
		System.out.print(n.data+"  ");
	}	
	
	Node Delete(Node root, int key){
		if(root==null)
			return root;
		if(key < root.data)
			root.left = Delete(root.left,key);
		else if(key > root.data)
			root.right = Delete(root.right,key);
		else{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data = min_value(root.right);	
			root.right = Delete(root.right,root.data);
			}
			return root;
		}
		
		int min_value(Node root){
			int min = root.data; 
			while(root.left!=null){
				min = root.left.data;
				root = root.left;
			}
			return min;
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
	
	void insert(int key){
		root = Insert(root, key);
	}
	

	void delete(int key){
		root = Delete(root,key);
	}
	public static void main(String[] args){
		BSTPract bst = new BSTPract();
		bst.insert(104);
		bst.insert(55);
		bst.insert(6);
		bst.insert(77);
		bst.insert(13);
		bst.insert(36);
		bst.insert(49);
		bst.insert(96);
		bst.insert(72);
		bst.insert(110);
		bst.insert(69);
		bst.insert(28);
		
		System.out.println("Inorder");
	    bst.inorder();
		System.out.println();
		System.out.println();
		System.out.println("Preorder");
		bst.preorder();
		System.out.println();
		System.out.println();
		System.out.println("Postorder");
		bst.postorder();
		bst.delete(13);
		System.out.println();
		System.out.println();
		System.out.println("after deletion of node having one child");
		bst.inorder();
		System.out.println();
		System.out.println();
		System.out.println("after deletion of node having two child");
		bst.delete(36);
		bst.inorder();
		
		
	}
}