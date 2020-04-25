package string;

public class Program008print_first_non_repeating_character {
	
	public static void main (String [] args){
		String str= "fluffy";
		int length= str.length();
		char count[] = new char[256];
		for(int i=0; i<length; i++){
			count[str.charAt(i)]++;
		}
		
		
		for(int i=0; i<length; i++){
			if(count[str.charAt(i)]==1){
				System.out.println("The first non-repeated character in string "+ str + " is "+ str.charAt(i));
				break;			}
			
		}
		
	}

}
