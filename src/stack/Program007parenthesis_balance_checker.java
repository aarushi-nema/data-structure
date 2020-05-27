package stacks;

public class Symbol_checker {
	
	static class Stack{
		int MAX= 10;
		char [] stack= new char[MAX];
		int top=-1;
		
		public void push(char element){
			if(top<MAX-1){
				top++;
				stack[top]=element;
			} else {
				System.out.println("Stack is Full");
			}
		}
		
		public Character pop (){
			if(top==-1){
				//System.out.println("Stack is empty");
				return null;
			} 
			
			return stack[top--];
		}
	}
	
	public static void main (String [] args){
		Stack obj= new Stack ();
		String exp="(A+B) + (x+y)}";
		boolean balance=true;
		Character ch;
		
		for (int i=0; i<exp.length(); i++){
			char c= exp.charAt(i);
			if( c=='(' || c=='{' || c=='['){
				obj.push(c);
			}
			
			if(c==')' || c=='}' || c== ']'){
				ch= obj.pop();
				if (ch==null){
					balance=false;
					break;
				}
				
				if(c==')' && ch!='('){
					balance=false;
					break;
				}
				
				if(c=='}' && ch!='{'){
					balance=false;
					break;
				}
				if(c==']' && ch!='['){
					balance=false;
					break;
				}
			}
		}
		
		if(obj.pop()!=null){
			balance=false;
		}
		
		if(balance){
			System.out.println("Expression is balanced");
		} else{
			System.out.println("Expression is not balanced");
		}
		
	}

}
