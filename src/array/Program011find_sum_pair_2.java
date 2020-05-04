package array;

import java.util.Arrays;

public class Program011find_sum_pair_2 {
	
	public static void find_pair (int [] array, int sum){
		
		int length= array.length;
		for(int i=0; i<length; i++){
			int a= array[i];
			for(int j=0; j<length; j++){
				if(array[j]+a==sum){
					System.out.printf("( %d, %d ) %n", a,array[j]);
				}
			}
		}
	}
	
	public static void main (String [] args){
		int array[]= {1,2,3,4};
		int sum=5;
		
		System.out.println("Integr Array: "+ Arrays.toString(array));
    	System.out.println("Pairs having sum = " + sum);
    	
    	find_pair(array, sum);
	}

}
