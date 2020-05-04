package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Program011find_sum_pair_1 {

	    public static void find_pair(int[] array, int sum){
	        if(array.length < 2){
	            return;
	        }        
	        Set set = new HashSet(array.length);
	        
	        for(int i : array){
	            int target = sum - i;
	            if(!set.contains(target)){
	                set.add(i);
	            }else {
	                System.out.printf("(%d, %d) %n", i, target);
	            }
	        }
	    }
	    
	    public static void main(String args[]) {
	    	int array[]= {1,2,3,4};
	    	int sum=5;
	    	
	    	System.out.println("Integr Array: "+ Arrays.toString(array));
	    	System.out.println("Pairs having sum = " + sum);
	    	
	    	find_pair(array, sum);
	  
	 }

}
