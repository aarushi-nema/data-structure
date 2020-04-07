package stack;

//Representation of Stack as a Simple Array
public class Program001array_implementation {
	
	static class Stack{
		
		final int MAX= 5;
		int [] data= new int[MAX];
		int top=-1;
		
		public void push(int element){
			if(top<MAX-1){
				top++;
				data[top]=element; 
			}
			
			else 
				System.out.println("Stack is Full");
		}
		
		public Integer pop(){          
			if(top==-1){
				System.out.println("Stack is Empty");
				return null;
			}
			
			return data[top--];
			
		}
		
		public void stackdisplay ()
		{
			for(int i=top; i>=0; i--){
				System.out.print(data[i] + " ");
			}
			
			System.out.println();
		}
		
		public static void main (String [] args)
		{
			Stack s= new Stack();
			
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

}
