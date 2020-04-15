package stack;

public class Program005postfix {
	
	static class Stack{
		
		final int Max= 10;
		int data[]= new int[Max];
		int top=-1;
		
		public void push (int element){
			if(top<Max-1){
				data[++top]= element;
			}
			
			else 
				System.out.println("Stack is full");
		}
		
		public Integer pop(){
			if(top ==-1){
				System.out.println("Stack is empty");
				return null;
			}
			
			return data[top--];
		}
	}
	
	
	public static int getvalue (char a){
		int value= a -'0';
		return value;
	}
	
	public static void postfix (char exp[]){
		Stack S= new Stack();
		int length = exp.length;
		
		for(int i=0; i<length; i++){
			char a= exp[i];
			
			if(a>='0' && a<='9'){
				int v = getvalue(a);
				S.push(v);
			}
			
			else {
				int t1= S.pop();
				int t2= S.pop();
				int value=0;
				
				if(a=='+'){
				  value=t2+t1;
				  S.push(value);
				}
				
				else if(a=='-'){
					value=t2-t1;
					S.push(value);
				}
				
				else if(a=='*'){
					value=t2*t1;
					S.push(value);
				}
				
				else if(a=='/'){
					value=t2/t1;
					S.push(value);
				}
				
				else if(a=='%'){
					value=t2%t1;
					S.push(value);
				}
				
				 
			}
		}
		
		Integer final_result = S.pop();
		System.out.println(final_result);
		
	}
	
	public static void main (String [] args){
		char exp[]= {'8', '2', '/'};
		postfix(exp);
		
	}

}
