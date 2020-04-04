package linkedlist;
//find length of linked list (iterative method)
public class Program010length_of_Linked_List_Iterative {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public int get_length()
	{
		Node n=head; 
		int length=0;
		
		while(n!=null)
		{
			length++;
			n=n.next;
		}
		
		return length;
	}
	
	public void printlist()
	{
		Node n=head;
		
		while(n!=null)
		{
			System.out.print(n.data +" ");
			n=n.next;
		}
		System.out.println();
	}
	
	public static void main ( String [] args)
	{
		Program010length_of_Linked_List_Iterative llist= new Program010length_of_Linked_List_Iterative();
		
		llist.head= new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		
		llist.head.next= second;
		second.next=third;
		
		llist.printlist();
		System.out.println("Length of linked list "+ llist.get_length());
	}

}
