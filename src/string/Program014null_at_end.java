package string;

public class Program014null_at_end {
	
	public static void main (String [] args){
		String [] array= {"Horse", null, "Cow", "Hen", null, "Pig"};
		
		for(int i=0; i<array.length; i++){
			if (array[i]==null){
				for(int j=i+1; j<array.length; j++){
					if(array[j]!=null){
						array[i]=array[j];
						array[j]= null;
						break;
					}
				}
			}
		}
		
		for(String s: array){
			System.out.print(s +" ");
		}
	}

}
