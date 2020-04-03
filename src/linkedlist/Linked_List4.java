package linkedlist;
//adding new node at beginning of linked list
public class Linked_List4 {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next= null;
		}
	}
	
	public void printlist (){
		
		Node n= head;
		
		while (n!=null){
			System.out.print(n.data + " ");
			n=n.next;
		}
		
		System.out.println();
	}
	
	public void insertinbeginning (int new_data){
		
		Node new_node= new Node(new_data);
		
		new_node.next=head;
		head= new_node;
	}
	
	public static void main(String [] args){
		Linked_List4 llist= new Linked_List4 ();
		
		llist.head= new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		
		llist.head.next=second;
		second.next=third;
		
		llist.printlist();
		
		llist.insertinbeginning(0);
		llist.printlist();
	}
	

}
