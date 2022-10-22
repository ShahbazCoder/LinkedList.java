class LinkedList{
	class Node{
		private int data;
		private Node next;
		
		public Node(int data){
			this.data=data;
			next=null;
		}
		
		public void setData(int data){
			this.data=data;
		}
		
		public int getData(){
			return data;
		}
		
		public void setNext(Node next){
			this.next=next;
		}
		
		public Node getNext(){
			return next;
		}
		
		
	}
	private Node head;
	
	public LinkedList(){
		this.head=null;
	}
	
	public void insertLinkedlist(int data){
		Node new_node=new Node(data);
		if(head==null){
			head=new_node;
		}
		else{
			Node last=head;
			while (last.getNext()!=null){
				if(last.getData()==data){
					return;
				}
				last=last.getNext();
			}
			last.setNext(new_node);
			
		}
	}
	
	public void removeList(int data){
		Node prev=head;
		Node temp=head;
		if(head.getData()==data){
			head=head.getNext();
		}
		else{
			while (temp.getData()!=data){
				prev=temp;
				temp=temp.getNext();
			}
			temp=temp.getNext();
			prev.setNext(temp);	
		}
		
	}
	
	public void display(){
		Node temp1=head;
		
		while (temp1.getNext()!=null)
		{
			System.out.print(temp1.getData()+" -> ");
			temp1=temp1.getNext();
		}
		System.out.print(temp1.getData());
	}
	
	public void search(int data){
		Node S=head;
		while(S.getData()!=data){
			S=S.getNext();
		}
		if(S.getData()==data){
			System.out.println (data+" is Found");
		}
		else{
			System.out.println (data+" Not Found");
		}
	}
}