package string;

import java.util.Arrays;

public class zigzag {
	
	public static void zz (String str, int n){
		char[] str1= str.toCharArray();
		int len= str.length();
		String [] arr= new String [n];
		Arrays.fill(arr, "");
		boolean down = true;
		int row=0;
		
		for(int i=0; i<len; i++){
			arr[row] += str1[i];
			if(row==n-1){
				down= false;
			} else if (row==0){
				down=true;
			}
			
			if(down){
				row++;
			} else {
				row--;
			}
		}
		
		for(int i=0; i<n; i++){
			System.out.print(arr[i]);
		}
		
	}
	
	public static void main (String [] args){
		String s="PAYPALISHIRING"; 
		zz(s, 3);
	}

}
