package linkedlist;
//inserting node at the end
public class Program6insert_node_at_end {
	
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data= d;
			next=null;
		}
	}
	
	public void printlist()
	{
		Node n= head;
		
		while(n!=null)
		{
			System.out.print(n.data+ " ");
			n=n.next;
		}
		
		System.out.println();
	}
	
	public void insertatend (int new_data)
	{
		Node new_node= new Node(new_data);
		
		Node n= head;
		
		while(n.next!=null)
		{
			n=n.next;
		}
		
		n.next=new_node;
		
	}
	
	public static void main( String [] args)
	{
		Program6insert_node_at_end llist= new Program6insert_node_at_end();
		
		llist.head= new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		
		llist.head.next= second;
		second.next=third;
		
		llist.printlist();
		
		llist.insertatend(4);
		llist.printlist();
	}

}
