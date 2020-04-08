package queue;
//Linked List implementation
public class Program001queue_linked_list_implementation {
	
	static class Linked_List{
		
		Node head = null;
		
		class Node{
			int data;
			Node next;
			
			Node (int d)
			{
				data=d;
				next= null;
			}
		}
		
		public void insert_at_end (int new_data){
			Node new_node= new Node(new_data);
			if(head==null){
				head= new_node;
				return;
			}
			
			Node n=head;
			while(n.next!=null){
				n=n.next;
			}
			
			n.next=new_node;
		}
		
		public Integer remove_from_beginning (){

			int r= head.data;
			head=head.next;
			return r;
		}
		
		public void display (){
			Node n= head;
			while(n!=null){
				System.out.print(n.data+ " ");
				n = n.next;
			}
			System.out.println();
		}
	}
	
	static class queue{
		int front=-1, rear=-1, Max=5;
		Linked_List q= new Linked_List();
		
		public void enqueue (int new_data){
			if((rear-front)<Max-1){
				if (front == -1) {
					front = 0;
				}
				rear++;
				q.insert_at_end(new_data);
			}
			
			else
				System.out.println("Queue is full");
		}
		
		public Integer dequeue(){
			if(front==-1){
				System.out.println("Queue is Empty");
				return null;
			}
			
			int r= q.remove_from_beginning();
			front++;
			if (front > rear) {
				front = -1;
				rear = -1;
			}
			return r;
			
		}
		
		public void show_queue(){
			
				q.display();
		}
		
	}
	
	public static void main ( String args[])
	{
		queue obj= new queue();
		obj.enqueue(1);
		obj.show_queue();
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		obj.enqueue(6);
		obj.show_queue();
		obj.dequeue();
		obj.show_queue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		
	}

}
