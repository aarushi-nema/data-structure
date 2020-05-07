package misc;

public class Program003swap_numbers_without_third_variable {
	
	public static void main (String [] args){
		int x=10, y=20;
		System.out.println("Before Swap: ");
		System.out.println("x: " +x);
		System.out.println("y: " +y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swap: ");
		System.out.println("x: " +x);
		System.out.println("y: " +y);
	}

}
