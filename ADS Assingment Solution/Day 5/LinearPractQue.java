class LinearPractQue{
	int front;
	int rear;
	int size = 5;
	int ldq[] = new int[size];
	LinearPractQue(){
		int front = -1;
		int rear = 0;
	}
	boolean isFull(){
		return (front==0 && rear==size); 
	}
	boolean isEmpty(){
		return (front == -1);
	}
	void insertele(int x){
		if(isFull()){
			System.out.println("Queue is full");
		}
		else{
			if(front == -1)
				front = 0;
			ldq[rear] = x;
			System.out.println("Insert"+x);
			rear++;
		}
	}
	void deletele(int x){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		else{
		    ldq[front] = x;
			System.out.println("Delete"+x);
			front++;	
		}
	}
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		for(rear = front;rear<size;rear++ )
			System.out.println(ldq[rear]);
		
	}
	public static void main(String[] args){
		LinearPractQue lq = new LinearPractQue();
		lq.insertele(10);
		lq.insertele(20);
		lq.insertele(30);
		lq.insertele(40);
		lq.insertele(50);
		lq.insertele(10);
		lq.display();
		lq.deletele(10);
		lq.deletele(20);
		lq.deletele(30);
		lq.display();
		
	}	
}