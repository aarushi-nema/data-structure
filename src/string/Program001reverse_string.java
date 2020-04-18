package string;

public class Program001reverse_string {
	
	public static void main (String [] args){
		String str= "pink123";
		String reverse="";
		int length= str.length();
		
		for(int i=length-1; i>=0; i--){
			reverse+= str.charAt(i);
		
		}
		
		System.out.println("Reversed String: " + reverse);
	}

}
