package linkedlist;
//delete a linked list
public class Program9delete_Linked_list {
	
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
	
	public void delete()
	{
		head=null;
	}
	
	public void printlist()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
	}
	
	public static void main(String []  args)
	{
		Program9delete_Linked_list llist= new Program9delete_Linked_list();
		
		llist.head = new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		
		llist.head.next=second;
		second.next= third;
		
		System.out.print("Linked List ");
		llist.printlist();
		System.out.println(" will be deleted");
		System.out.println("Linked List deleted");
		
	}

}
