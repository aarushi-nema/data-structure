package string;

public class Program015replace_substring {
	
	static String currentPhrase="A cat ate late";
	
	public static int findNthOccurance (String str, int n){
		int a=0;
		
		for(int i=0; i<currentPhrase.length(); i++){
			if(currentPhrase.charAt(i)==str.charAt(0)){
				if(currentPhrase.substring(i,str.length()+i).equals(str))
					a++;
				if(a==n){
					return i;
				}
			}	
	    }
		
		return -1;
}
	
	public static void replaceNthOccurance (String str, int n, String repl){
		int a=0;
		String s="";
		
		int loc= findNthOccurance(str,n);
		
		currentPhrase =currentPhrase.substring(0, loc) + repl+ currentPhrase.substring(loc + str.length(), currentPhrase.length());
	}
	
	
	public static void main (String [] args){
		replaceNthOccurance("at", 1, "rane");
		System.out.println(currentPhrase);
	}

}
