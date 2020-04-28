package string;

public class Program011reverse_string_but_preserve_space_position {
	
	public static void reverse_string (String str){
		char [] c= str.toCharArray();
		int length = str.length();
		
		char [] reverse_str= new char[length];
		
		for(int i=0; i<length; i++){
			if(c[i]==' '){
				reverse_str[i]=' ';
			}
		}
		
		int j= length-1;
		
		for(int i=0; i<length; i++){
			if(c[i]!=' ')
			{
				if(reverse_str[j]==' ')
					j--;
			
			   
				   reverse_str[j]=c[i];
				    j--;
			     
				
			}
		
		}
		
		System.out.println(str+ "-----> " + String.valueOf(reverse_str));
		
	}
	
	public static void main (String [] args){
		String str="Super who lock";
		reverse_string(str);
	}

}
