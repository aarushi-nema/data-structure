package misc;

public class Program001power_of_three {
	
	public static void main (String [] args){
		int number= 10;
		
		/* The maximum power of 3 value that  
	       integer can hold is 1162261467 ( 3^19 ) .*/
		if(1162261467%number==0)
			System.out.println(number + " is a power of three ");
		else
			System.out.println(number + " is not a power of three");
		
	}

}
