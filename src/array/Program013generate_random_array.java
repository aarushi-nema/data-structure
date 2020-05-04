package array;

import java.util.Arrays;

public class Program013generate_random_array {
	
	public static void generate_random_array (int length, int number){
		int array[] = new int[length];
		
		for(int i=0; i<length; i++){
			array[i]= (int) (Math.random()*number); //by multiplying with number the numbers are generated from 0 to number-1
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void main (String [] args){
		int length=7, number=20;
		
		generate_random_array(length, number);
	}
}
