package array;

import java.util.Arrays;

public class Program014find_second_largest_number {
	
	public static Integer second_largest (int [] array){
		if(array.length<2){
			return null;
		}
		int largest=array[0];
		int second=array[0];
		
		for(int i=0; i<array.length; i++){
			if(array[i]>largest){
				second=largest;
				largest=array[i];
			}
		}
		
		return second;
		
	}
	
	public static void main (String [] args){
		int array[]= {4,2,6,1,9,5};
		
		System.out.println("Second largest number in array " + Arrays.toString(array) + " is " + second_largest(array));
	}

}
