package stacks;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Nearest_greater_to_right {
	
	public static Vector ngr (int array[], int size){
		Vector v= new Vector();
		Stack s= new Stack();
		
		for(int i=size-1; i>=0; i--){
			if(s.isEmpty()){
				v.add(-1);
			}
			
			else if((int)(s.peek())>array[i]){
				v.add(s.peek());
			}
			
			else if((int)(s.peek())<array[i]){
				while ((int)(s.peek())<=array[i] && !s.isEmpty()){
					s.pop();
				}
				if(!s.isEmpty()){
					v.add(s.peek());
				} else{
					v.add(array[i]);
				}
				
			}
			
			s.push(array[i]);
		}
		
		Collections.reverse(v);
		
		return v;
	}
	
	public static void main (String args[]){
		int [] array= {4, 5, 2, 25};
		Vector v= ngr(array, array.length);
		
		for(Object obj: v){
			System.out.print(obj+ " ");
		}
	}

}
