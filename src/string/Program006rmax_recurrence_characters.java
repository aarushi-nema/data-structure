package string;

public class Program006rmax_recurrence_characters {
	
	public static void main (String [] args){
		String str= "Today is Monday";
		int length= str.length();
		char [] c= str.toCharArray();
		int [] index= new int [256];
		
		for(int i=0; i<256; i++){
			index[i]=0;
		}
		
		for(int i=0; i<length; i++){
			if(c[i]!=' '){
			 int convert= c[i];
			 index[convert]++;
			}
		}
		
		int max=0;
		//to find max
		for(int i=0; i<256; i++){
			if(index[i]>max)
				max=index[i];
		}
		
	  System.out.print("The maximum recurring character(s) in string " + str+ " is ");
		for (int i=0; i<256; i++){
			if (index[i]==max)
				
				System.out.print((char)i+ " ");
		}
		
		System.out.println("which occur " + max+ " times");
		
	}

}
