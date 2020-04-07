package linkedlist;
//create three nodes in a linked list 
public class Program002Create_Linked_List {
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node (int d){
			data=d;
			next=null;
		}
	}
	
	public static void main ( String [] args){
		Program002Create_Linked_List llist= new Program002Create_Linked_List();
		
		llist.head = new Node (1);
		Node second= new Node(2);
		Node third = new Node(3);
		
		llist.head.next= second;
		second.next=third;
	}

}
