package linkedlist;
//delete kth node
public class Program8delete_nth_node {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node (int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void delete(int key)
	{
		Node temp= head, prev=null;
		int k=0;
		
		while(temp!=null && k!=key)
		{
			prev=temp;
			temp=temp.next;
			k++;
		}
		
		if(temp==null)return;
		prev.next=temp.next;
		
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
		Program8delete_nth_node llist= new Program8delete_nth_node();
		llist.head= new Node (1);
		Node second= new Node(2);
		Node third= new Node(3);
		Node fourth= new Node(4);
		
		llist.head.next= second;
		second.next=third;
		third.next=fourth;
		llist.printlist();
		llist.delete(2);
		llist.printlist();
	}
	

}
