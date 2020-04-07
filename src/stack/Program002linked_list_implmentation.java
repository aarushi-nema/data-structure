package stack;

import stack.Program001array_implementation.Stack;

public class Program002linked_list_implmentation {

	static class Linked_List {

		Node head;

		class Node {
			int data;
			Node next;

			Node(int d) {
				data = d;
				next = null;
			}
		}

		public void insert_in_beginning(int element) {
			Node new_node = new Node(element);

			new_node.next = head;
			head = new_node;
		}

		public Integer delete_from_beginning() {

			if (head == null)
				return null;

			int r = head.data;
			head = head.next;
			return r;

		}

		public void display() {
			Node n = head;

			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}

			System.out.println();
		}

	}

	static class Stack {
		final int MAX = 5;
		int top = -1;
		Linked_List data = new Linked_List();

		public void push(int element) {
			if (top < MAX - 1) {
				top++;
				data.insert_in_beginning(element);
			}

			else
				System.out.println("Stack is Full");
		}

		public Integer pop() {
			if (top == -1) {
				System.out.println("Stack is empty");
				return null;
			}

			int r = data.delete_from_beginning();
			top--;
			return r;
		}

		public void stackdisplay() {
			data.display();
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push(2);
		s.stackdisplay();
		s.push(3);
		s.push(4);
		s.stackdisplay();
		s.push(5);
		s.push(6);
		s.push(7);
		s.stackdisplay();
		System.out.println(s.pop() + " removed");
		s.stackdisplay();
		System.out.println(s.pop() + " removed");
		System.out.println(s.pop() + " removed");
		System.out.println(s.pop() + " removed");
		System.out.println(s.pop() + " removed");
		System.out.println(s.pop() + " removed");

	}

}
