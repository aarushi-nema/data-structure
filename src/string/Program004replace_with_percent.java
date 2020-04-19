package string;

public class Program004replace_with_percent {
	
	public static void replace (char c[], int length){
		int spaces=0;
		for(int i=0; i<length; i++){
			if(c[i]==' ')
				spaces++;
		}
		
		int new_length= length + spaces*2;
		int n=0;
		
		for (int i= length-1; i>=0; i--){
	
			if(c[i]==' '){
				c[new_length-n-1]='0';
				c[new_length-n-2]='2';
				c[new_length-n-3]='%';
				n+=3;
			}
			
			else{
				c[new_length-n-1]= c[i];
				n++;
			}		
		}
		
		System.out.print("New String: "  );
		for(int i=0; i<new_length; i++){
			System.out.print(c[i]);
		}
	}
	
	public static void main (String [] args){
		char c[]= {'M', 's',' ','J', 'u', 'l','i', 'e',' ','W','i','l','l','i','a',' ', ' ',' ',' ',' '};
		replace(c,15);
		
		
	}

}
