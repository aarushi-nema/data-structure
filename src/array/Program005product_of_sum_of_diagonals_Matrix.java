package array;

public class Program005product_of_sum_of_diagonals_Matrix {
	
	public static void main (String [] args){
		int [][] matrix= {{1,2,3}, {4,5,6},{7,8,9}};
		int sum1=0, sum2=0;
		
		System.out.print("Diagonal 1: ");
		for(int i=0; i<3; i++){
			sum1+=matrix[i][i];
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println(" Sum of diagonal 1: " + sum1);
		System.out.print("Diagonal 2: ");
		for(int i=0; i<3; i++){
			sum2+=matrix[i][3-i-1];
			System.out.print(matrix[i][3-i-1] + " ");
		}
		System.out.println(" Sum of diagonal 2: " + sum2);
		
		System.out.println("Sum of product of sum of two diagonals of square Matrix: "+ sum1*sum2);
		
	}

}
