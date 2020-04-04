package linkedlist;
//inserting a node in the middle of linked list
public class Program5insert_node_in_middle {
	
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node (int d)
		{
			data=d;
			next= null;
		}
	}
	
	public void printlist ()
	{
		Node n= head;
		
		while(n!=null)
		{
			System.out.print(n.data+ " ");
			n=n.next;
		}
		
		System.out.println();
	}
	
	public void insertinmiddle (Node prev_node, int new_data)
	{
		Node new_node= new Node(new_data);
		
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	
	public static void main (String [] args)
	{
		Program5insert_node_in_middle llist = new Program5insert_node_in_middle ();
		llist.head= new Node (1);
		Node second = new Node (2);
		Node third= new Node(4);
		
		llist.head.next=second;
		second.next=third;
		
		llist.printlist();
		
		llist.insertinmiddle(second,3 );
		
		llist.printlist();
	}

}
