package linkedlist;
//length of linked list (recursive)
public class Program11length_of_linked_list_2 {
	
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
	
	public int find_length(Node node)
	{
		if(node==null)
			return 0;
		else
			return 1+find_length(node.next);
	}
	
	public void printlist()
	{
		Node n=head;
		
		while(n!=null)
		{
			System.out.print(n.data+ " ");
			n=n.next;
		}
		
		System.out.println();
	}
	
	
	public static void main (String [] args)
	{
		Program11length_of_linked_list_2 llist= new Program11length_of_linked_list_2();
		llist.head= new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		
		llist.head.next=second;
		second.next=third;
		
		llist.printlist();
		System.out.println("Length of linked list: "+ llist.find_length(llist.head));
		
	}

}
