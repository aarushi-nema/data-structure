package array;

public class Program009binary_search {
	
	public static void main (String [] args){
		int array[]= {3,1,6,8,9,10,2,4,5,7};
		int search_element= 4;
		int length= array.length;
		
		for(int i=0; i<length-1; i++){
			for(int j=0; j<length-i-1; j++){
				if(array[j]>array[j+1]){
					int temp= array[j];
					array[j]= array[j+1];
					array[j+1]= temp;
				}
			}
		}
		
		int LB=0, UB=length-1, mid;
		boolean Found=false;
		
		while(LB<=UB && !Found){
			mid= (LB+UB)/2;
			
			if(array[mid]>search_element)
				UB=mid-1;
			
			else if (array[mid]<search_element)
				LB= mid+1;
			
			else 
				Found=true;
			
		}
		
		if(Found)
			System.out.println("Element found ");
		else
			System.out.println("Element not found");
		
	}

}
