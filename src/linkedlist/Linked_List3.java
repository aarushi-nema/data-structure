package linkedlist;
//Traverse a Linked List
public class Linked_List3 {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node (int d) {
			data= d;
			next= null;
		}
	}
	
	public void printlist (){
		Node n= head;
		
		while(n!=null)
		{
			System.out.print(n.data + " ");
			n=n.next;
		}
	}
	
	public static void main (String [] args){
		Linked_List3 llist= new Linked_List3();
		
		llist.head= new Node(1);
		Node second= new Node (2);
		Node third= new Node (3);
		
		llist.head.next= second;
		second.next=third;
		
		llist.printlist();
	}
	

}
