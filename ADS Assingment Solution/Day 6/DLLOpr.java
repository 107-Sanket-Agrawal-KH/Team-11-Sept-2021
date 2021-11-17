class DLLOpr{
	Node head; 
	class Node{
		int data;
		Node prev, next;
		Node(int d){
			this.data = d;
			this.prev = null;
			this.next = null;
		}
	}
	
	
	void insertnodeatfirst(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
		}
		else{
			head.prev = new_node;
			new_node.next = head;
			head = new_node;	
		}
	}
	
    void insertnodeatlast(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
		}
		else{
			Node trav = head;
			while(trav.next!=null){
				trav = trav.next;
			}
			trav.next = new_node;
			new_node.prev = trav;
		}	
	}
	
	void insertnodeatspecific(int pos,int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
		}
		else{
			Node temp = head;
			for(int i=1;i<pos;i++){
				temp = temp.next;
			}
			temp.next.prev = new_node;
			new_node.next = temp.next;
			new_node.prev = temp;
			temp.next = new_node;
		}	
	}
	
	void deletenodeatfirst(){
		head = head.next;
		head.prev = null;
	}
	
	void deletenodeatlast(){
		Node trav = head;
        while(trav.next.next!=null){
			trav = trav.next;
		}
        trav.next = null;		
	}
	
	 void deletenodeatspecific(int pos){
		 Node trav = head;
		for(int i = 1;i<pos-1;i++){
			trav = trav.next;
		}
		trav.next.next.prev = trav; 
		trav.next = trav.next.next;
		
	}
	
	void display(){
		System.out.print("head--->");
		Node trav = head; 
        Node temp = null;
		while(trav!=null){
		  System.out.print(trav.data+"--->");
		  temp = trav;
		  trav = trav.next;
		}
		System.out.println("tail");
		System.out.println("Reverse List");
		System.out.print("tail--->");
	    while(temp!= null){
			 System.out.print(temp.data+"--->");
			 temp = temp.prev;
		}
		System.out.print("head");
		
	}
	
	public static void main(String... args){
		DLLOpr dll = new DLLOpr();	
		System.out.println("Insert node at head");
		dll.insertnodeatfirst(5);
        dll.display();
		System.out.println();
		System.out.println();
		System.out.println("Insert node at first");
		dll.insertnodeatfirst(11);
		dll.insertnodeatfirst(22);
		dll.insertnodeatfirst(33);
		dll.insertnodeatfirst(44);
		dll.insertnodeatfirst(55);
		dll.insertnodeatfirst(66);
		dll.display();
		System.out.println();
		System.out.println();
		System.out.println("Insert node at last");
		dll.insertnodeatlast(10);
		dll.insertnodeatlast(20);
		dll.insertnodeatlast(30);
	    dll.insertnodeatlast(40);
	    dll.insertnodeatlast(50);
		dll.display();
		System.out.println();
		System.out.println();
		System.out.println("Insert node at specific");
		dll.insertnodeatspecific(3,100);
		dll.display();
		System.out.println();
		System.out.println();
		System.out.println("Delete node at first");
		dll.deletenodeatfirst();
		dll.display();
		System.out.println();
		System.out.println();
		System.out.println("Delete node at last");
		dll.deletenodeatlast();
		dll.display();
		System.out.println();
		System.out.println();
		System.out.println("Delete node at pecific");
		dll.deletenodeatspecific(3);
		dll.display();
		
	}
}