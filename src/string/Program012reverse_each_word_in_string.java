package string;

import java.util.Stack;

public class Program012reverse_each_word_in_string {
	
	public static void reverse (String str){
		int length= str.length();
		
		Stack<Character> stack= new Stack<Character>();
		
		for(int i=0; i<length; i++){
			if(str.charAt(i)!=' '){
				stack.push(str.charAt(i));
			}
			
			else{
				while (!stack.isEmpty()){
				System.out.print(stack.pop());
				}
				
				System.out.print(" ");
			}
		}
		
		while (!stack.isEmpty()){
			System.out.print(stack.pop());
		}
		
		
	}
	
	public static void main (String [] args){
		String str= "Tech n Art";
		
		reverse(str);
	}

}
