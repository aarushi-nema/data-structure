package array;
//find if a given string has all unique elements
public class Program002unique_string {
	
	public static int unique_check (String str){
		if(str.length()>128) //128 is number of unique characters in ASCII
			return 0;
		
		int [] array= new int[256];
		
		for(int i=0; i<str.length(); i++){
			int val= str.charAt(i);
			
			if(array[val]==1){
				return 0;
			}
			
			array[val]=1;
		}
		
		return 1;
	}
	
	public static void main (String [] args){
		String str="Tech Art";
		int r= unique_check(str);
		
		if(r==0)
			System.out.printf("All characters in %s are not unique", str);
		else
			System.out.printf("All characters in %s are unique", str);
	}

}
