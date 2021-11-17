class CPractQue{
	int rear;
	int front;
	int size = 5;
	int cdq[] = new int[size];
	CPractQue(){
		rear = -1;
		front = -1;
	}
	boolean isFull(){
		if(front == 0 && rear == size-1 )//4
		return true;
	    else if(front == rear+1){//front=4+1
			return true;
		}
		else
			return false;
	}
	boolean isEmpty(){
		return front == -1;
	}
	void insertele(int x){
		if(isFull())
			System.out.println("Full");
		else{
		if(front == -1)
			front = 0;
		    rear = (rear+1)%size;//rear = (4+1)%5 = 0
			cdq[rear] = x;//0
			System.out.println("Insert "+cdq[rear]);
			
		}
	}
	void deletele(int x){
		if(isEmpty())
			System.out.println("Empty");
			cdq[front] = x;
			System.out.println("Delete "+cdq[front]);//10
			front = (front+1)%size;//front = (4+1)%5 = 0
	}
	void display(){
		int i;
		if(isEmpty())
		System.out.println("Empty");
	    else{
			for(i = front; i != rear; i = (i + 1) % size)
				System.out.println(cdq[i]);
		 System.out.println(cdq[i]);
	}
	}
	
	public static void main(String... args){
		CPractQue cq = new CPractQue();
		cq.insertele(10);
		cq.insertele(20);
		cq.insertele(30);
		cq.insertele(40);
		cq.insertele(50);
		cq.insertele(60);
		cq.insertele(60);
		cq.display();
		cq.deletele(10);
		cq.deletele(20);
		cq.display();
		insertele(100);
	}
}