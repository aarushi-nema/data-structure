package sort;

import java.util.Arrays;

public class Program001merge_sort {
	
	public static int[] merge_sort(int array[]){
		
		if( array.length <=1){
			return array;
		}
		
		int mid= array.length/2;
		
		int left[]= new int[mid];
		int right[]= new int[array.length-mid];
		
		for(int i=0; i<mid; i++){
			left[i]= array[i];
		}
		
		for(int j=0; j<right.length; j++){
			right[j]= array[mid+j];
		}
		
		int result[]= new int[array.length];
		
		left= merge_sort(left);
		right= merge_sort(right);
		
		result= merge(left, right);
		
		return result;
		
	}
	
	public static int[] merge (int []left, int []right){
		int result[]= new int[left.length +right.length];
		int i=0, j=0, l=0;
		
		while(i<left.length && j<right.length){
			
			if(left[i]<right[j]){
				result[l++]= left[i++];
			}
			
			else if(left[i]>right[j]){
				result[l++]= right[j++];
			}
			
			else{
				result[l++]= right[j++];
				i++;
			}
			
		}
		
		while(i<left.length){
			result[l++]= left[i++];
		}
		
		while(j<right.length){
			result[l++]= right[j++];
		}
		
		return result;
	}
	
	public static void main (String[] args){
		int array[]={5,1,4,3,2};
		int result[]= new int[array.length];
		
		System.out.println("Original array: " +Arrays.toString(array));
		
		result=merge_sort(array);
		
		System.out.println("Sorted array: "+ Arrays.toString(result));
	}

}
