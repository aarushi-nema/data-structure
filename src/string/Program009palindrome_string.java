package string;

public class Program009palindrome_string {
	
	public static void main (String [] args){
		String str= "ababXbaba";
		char[] s= str.toCharArray();
		int i=0, j=s.length-1;
		while(i<j && s[i]==s[j]){
			i++;
			j--;
		}
		
		if(i<j){
			System.out.println("Not palindrome");
		}
		else{
			System.out.println("Palindrome");
		}
	}

}
