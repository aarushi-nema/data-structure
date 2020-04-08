package queue;

import queue.Program001queue_linked_list_implementation.queue;

//Array implementation
public class Program002queue_array_implementation {

	static class queue {
		int front = -1, rear = -1, Max = 5;
		int[] data = new int[Max];

		public void enqueue(int element) {
			if (rear - front < Max - 1) {
				if (front == -1) {
					front++;
					rear++;
					data[front] = element;
				}

				else {
					rear++;
					data[rear] = element;
				}
			}
			
			else
				System.out.println("Queue is full");
		}
		
		public Integer dequeue(){
			if(front==-1){
				System.out.println("Queue is empty");
				return null;
			}
			
			int r=data[front];
			front++;
			
			if(front>rear){
				rear=-1;
				front=-1;
			}
			return r;
		}
		
		public void show_queue(){
			for(int i=front; i<=rear; i++){
				System.out.print(data[i]+ " ");
			}
			System.out.println();
		}
		
		public static void main (String args[])
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

}
