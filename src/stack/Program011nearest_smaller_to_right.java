package stacks;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Nearest_smaller_from_right {

	public static Vector nsr (int [] array, int length){
		Vector v= new Vector();
		Stack s= new Stack();
		
		for(int i=length-1; i>=0; i--){
			if(s.isEmpty()){
				v.add(-1);
			}
			
			else if((int)(s.peek())<array[i]){
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
		
		Collections.reverse(v);
		
		return v;
	}
	public static void main (String [] args){
		int array[]= {4,1,7,9,2,0,3,5,10,6};
		Vector v=nsr(array, array.length);
		
		for(Object obj:v){
			System.out.print(obj + " ");
		}
		
	}

}
