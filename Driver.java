class Dirver{
	public static void main (String[] args) {
		//Scanner sc=new Scanner(System.in);
		int data;
		
		LinkedList L=new LinkedList();
		
		L.insertLinkedlist(42);
		L.insertLinkedlist(100);
		L.insertLinkedlist(420);
		L.insertLinkedlist(4);
		L.insertLinkedlist(412);
		L.insertLinkedlist(482);
		L.insertLinkedlist(4);
		
		L.display();
		
		System.out.println ("\n");
		
		L.removeList(42);
		
		L.display();
		
		System.out.println ("\n");
		
		L.search(420);
		System.out.println ("\n");
		L.search(4);
		
		
	}

}