package stack;
//to check if expression is balanced or not
public class Program003balanced_expression_check {
	
	 static class Stack{
		
		final int Max=10;
		char data[]= new char[Max];
		int top=-1;
		
		public void push (char element){
			if(top<Max-1){
				data[++top]= element;
			}
			
			else
				System.out.println("Stack is full");
		}
		
		public Character pop (){
			if(top==-1){
				System.out.println("Stack is empty");
				return null;
			}
			
			return data[top--];
		}
		
	}
	
	public static int check_balance (char exp[]){
		Stack S= new Stack();
		int count=0;
		int length= exp.length;
		
		for(int i=0; i<length; i++){
			char a= exp[i];
			
			if(a=='(' || a=='{' || a=='['){
				S.push(a);
			}
			
			if(a==')' || a=='}' || a==']'){
				int t=S.pop();
				
				if(t=='(' && a==')'){
					count+=2;
				}
				
				if(t=='{' && a=='}'){
					count+=2;
				}
				
				if(t=='[' && a==']'){
					count+=2;
				}
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args){
		char exp[]={'{','}','(',')','[',']'};
		int count= check_balance(exp);
		if (count==exp.length)
			System.out.println("Expression is balanced");
		else 
			System.out.println("Expression is not balanced");
		
	}

}
