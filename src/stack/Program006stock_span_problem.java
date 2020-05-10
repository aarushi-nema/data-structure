package stack;

import java.util.Arrays;

public class Program006stock_span_problem {
	
	public static int[] span_finder (int price[], int n){
		int [] span= new int [n];
		
		span[0]=1;
		
		for(int i=1; i<n; i++){
			span[i]=1;
			
			for(int j=i-1; (j>=0) && (price[i]>= price[j]); j--){
				span[i]++;
			}
		}
		
		return span;
	}
	
	public static void main (String args []){
		int price []= {100, 80, 60, 70, 60, 75, 85};
		
		System.out.println("The stock span of " + Arrays.toString(price) + " is " + Arrays.toString(span_finder(price, price.length)));
		
	}
	

}
