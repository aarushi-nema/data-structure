package string;

import java.util.Arrays;
public class Program002 {
	
	public static boolean permutation (String s1, String s2){
		int length1= s1.length(), length2= s2.length();
		
		if(length1!=length2)
			return false;
		
		char [] c1= s1.toCharArray();
		char [] c2= s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0; i<length1; i++){
			if(c1[i]!=c2[i])
				return false;
		}
		
		return true;
		
	}
	
	public static void main (String [] args){
		String s1= "TOMMARVOLORIDDLE";
		String s2="IAMLORDVOLDEMORT";
		
		boolean b=permutation(s1,s2);
		
		if(b)
			System.out.printf("Strings %s and %s are permutation Strings",s1,s2);
		else
			System.out.printf("Strings %s and %s are not permutation Strings",s1,s2);

	}

}
