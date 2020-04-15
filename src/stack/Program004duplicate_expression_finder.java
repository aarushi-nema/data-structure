package stack;

public class Program004duplicate_expression_finder {
	
	static class Stack{
		
		final int Max= 10;
		int [] data= new int [Max];
		int top=-1;
		
		public void push(int element){
			if(top<Max-1){
				data[++top]= element;
			}
			
			else
				System.out.println("Stack is full");
		}
		
		public Integer pop(){
			if(top==-1){
				System.out.println("Stack is empty");
				return null;
			}
			
			return data[top--];
		}
		
	}
	
	public static void check_duplicate(char exp[]){
		Stack S= new Stack();
		Integer t;
		int length= exp.length;
		
		for (int i=0; i<length; i++){
			char a= exp[i];
			
			if(a!=')')
				S.push(a);
			
			else {
				do{
				      t= S.pop();
				}while(t!= null && t!='(');
			}
		}
		
		if (S.top=='(')
			System.out.println("Duplicate expression");
		else 
			System.out.println("Not Duplicate expression");
	}
	
	public static void main (String [] args){
		char exp[]= {'(', '(', 'x', '+', 'y', ')', ')'};
		check_duplicate(exp);
	}
	

}
