package stacks;

import java.util.Stack;
import java.util.Vector;

public class Nearest_smaller_to_left {
	
	public static Vector nsl (int [] array, int length){
		Vector v= new Vector();
		Stack s= new Stack();
		
		for(int i=0; i<length; i++){
			if(s.isEmpty()){
				v.add(-1);
			}
			
			else if ((int)(s.peek())<array[i]){
				v.add(s.peek());
			}
			
			else if ((int)(s.peek())>array[i]){
				while(!s.isEmpty() && (int)(s.peek())>=array[i]){
					s.pop();
				}
				
				if(s.isEmpty()){
					v.add(-1);
				} else {
					v.add(s.peek());
				}
			}
			
			s.push(array[i]);
		}
		
		return v;
	}
	
	public static void main (String [] args){
		int [] array= {2,5,1,8,9,4,10,0,7};
		Vector v= nsl(array, array.length);
		
		for(Object obj: v){
			System.out.print(obj+" ");
		}
	}

}
