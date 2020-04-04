package linkedlist;
//delete node
public class Program7delete_node {
	
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
	
	public void delete (int key)
	{
		Node temp= head, prev=null;
		
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null)return;
		prev.next=temp.next;
	}
	
	public void printlist()
	{
		Node n= head;
		
		while(n!=null)
		{
			System.out.print(n.data +" ");
			n=n.next;
		}
		
		System.out.println();
	}
	
	public static void main(String [] args)
	{
		Program7delete_node llist= new Program7delete_node();
		llist.head= new Node(2);
		Node second = new Node(3);
		Node third= new Node(1);
		Node fourth= new Node(7);
		
		llist.head.next= second;
		second.next=third;
		third.next=fourth;
		
		llist.printlist();
		llist.delete(1);
		llist.printlist();
	}

}
