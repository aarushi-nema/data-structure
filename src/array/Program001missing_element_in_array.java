package array;
import java.util.Arrays;
import java.util.BitSet;

//find missing element from 1-100
public class Program001missing_element_in_array {
	
	public static void main (String [] args){
		int [] array= {1,2,3,5,6,7};
		int original_array_size= 7;
		
		Missing_element(array, original_array_size); 
		
	}
	
	public static void Missing_element (int [] array, int size){
		int missing_count= size- array.length;
		BitSet bitset = new BitSet(size);
		
		for (int number : array){
			bitset.set(number-1);
		}
		
		System.out.printf("Missing number in array %s with total of %d elements is ", Arrays.toString(array), size );
		
		int missingindex=0;
		
		for(int i=0; i<missing_count; i++){
			missingindex= bitset.nextClearBit(missingindex);
			System.out.println(++missingindex);
		}
		
	}
}
