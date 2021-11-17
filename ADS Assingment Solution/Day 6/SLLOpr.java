/**Programs* (Also applicable to other types of LInkedlist)
1)WAP to implement Single Linked List and perform following operations on it:
a)Creation of Linked lIst
b)Traversing and displaying Linked list
c)Insert a node at begin, end, between of a linked list
d)Delete a node at begin, end, between of a linked list
e)Count number of nodes in Linked list
f)Merge two Linked List and create one Linked list
g)Search a node with a particular value in a Linked List
h)Display Linked list in reverse form
*/
class SLLOpr{
	
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertnodeatfirst(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
		head = new_node;
		}
		else{
		new_node.next = head;
		head = new_node;
		}
	}
	
	public void insertnodeatlast(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new_node;
		}
		else{		
			Node trav = head;
			while(trav.next != null){
				trav = trav.next;
			}
			trav.next = new_node; 	
		}	
	}
	
	public void insertnodeatspecific(int pos, int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new_node;
		}
		else{
			Node trav = head;
			for(pos=1;pos<3;pos++){
				trav = trav.next;
			}
				new_node.next = trav.next;
                trav.next = new_node;			
		}
	}
	
	public int deletenodeatfirst(){
		if(head == null){
			return 1;
		}
		else{
			head = head.next;
		}
		return 1;
	}
	
	public int deletenodeatlast(){
		if(head == null){
			return 1;
		}
		else{
			Node trav = head;
			while(trav.next.next!=null){
				trav = trav.next;
			}
			trav.next = null;
		}
		return 1;
	}
	
	public int deletenodeatspecific(int pos){
		if(head == null){
			return 1;
		}
		else{
			Node trav = head;
			for(int i = 1;i<pos-1;i++){
				trav = trav.next;
			}
		trav.next = trav.next.next;
	}
	return 1;
	}
	
	public void reverselinklist(){
		Node p = head;
		Node q = head;
		Node n = head;
		while(p.next!=null){
			p = p.next;
			q = q.next;
			p = p.next;
			q.next = n;
			n = q;
			q = p;
		}
	}
	
	public void display(){
		System.out.print("head");
		Node n = head;
		int count = 0;
		while(n!=null){
			System.out.print("--->");
		    System.out.print(n.data);
			n = n.next;
			count++;
		}
		System.out.println("--->tail  :- count = "+count);
	}
		public static void main(String[] args){
			SLLOpr sll = new SLLOpr();
			System.out.println("Insert Node At Head : ");
			sll.insertnodeatfirst(110);
			sll.display();
			System.out.println();
			System.out.println("Insert Node At First : ");
			sll.insertnodeatfirst(10);
			sll.insertnodeatfirst(20);
			sll.insertnodeatfirst(30);
			sll.insertnodeatfirst(40);
			sll.insertnodeatfirst(50);
			sll.display();
			System.out.println();
			System.out.println("Insert Node At  Last : ");
			sll.insertnodeatlast(60);
			sll.insertnodeatlast(70);
			sll.insertnodeatlast(80);
			sll.insertnodeatlast(90);
			sll.display();
			System.out.println();
			System.out.println("Insert Node At  Specific : ");
			sll.insertnodeatspecific(3,100);
            sll.display();
			System.out.println();
			System.out.println("Delete Node At  First : ");
			sll.deletenodeatfirst();
			sll.deletenodeatfirst();
			sll.display();
			System.out.println();
			System.out.println("Delete Node At  Last : ");
			sll.deletenodeatlast();
			sll.deletenodeatlast();
			sll.display();
			System.out.println();
			System.out.println("Delete Node At  Specific : ");
			sll.deletenodeatspecific(3);
			sll.display();
			System.out.println();
            System.out.println("Reverse Link List");
			sll.reverselinklist();
			sll.display();
		}
}