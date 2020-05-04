package array;

import java.util.Arrays;

public class Program010find_kth_smallest_element {
	
	public static void main (String [] args){
		
		int [] array= {1,5,6,2,8,19,11,10,3,4};
		int length= array.length;
		int k=3;
		
		System.out.print("The " +k +" smallest element in array ");
		
		for(int i=0; i<length; i++){
			System.out.print(array[i] + ",");
		}
		
		//bubble sort
		for(int i=0; i<length-1; i++){
			for(int j=0; j<length-i-1; j++){
				if(array[j]>array[j+1]){
					int temp= array[j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println(" is " + array[k-1]);
		
		System.out.println("Sorted: ");
		

		for(int i=0; i<length; i++){
			System.out.print(array[i] + ",");
		}
		
	}

}
