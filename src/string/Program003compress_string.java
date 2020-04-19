package string;

public class Program003compress_string {
	
	public static String replace (String str){
		int length = str.length();
		String new_string="";
		char [] sc= str.toCharArray();
		char a= sc[0];
		int count=0;
		
		for(int i=0; i<length; i++ ){
		    if(sc[i]==a){
		    	count++;
		    }
		    else if(sc[i]!=a){
		    	new_string+= a;
		    	new_string+=count;
		    	a= sc[i];
		    	count=1;
		    }
		}
		
		if (count>0){
			new_string+= a;
			new_string+= count;
		}
		
		if(str.length()<new_string.length())
			return str;
		
		
		return new_string;
	}
	
	public static void main (String [] args){
		String str= "ssssaaaaapppppp";
		System.out.println("Compressed string: "+ replace(str));
	}

}
