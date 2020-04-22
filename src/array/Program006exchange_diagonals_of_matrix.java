package array;

public class Program006exchange_diagonals_of_matrix {
	
	public static void main (String [] args){
		int [][] matrix= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		int n=4;
		
		System.out.println("Original Matrix: ");
		for(int l=0; l<n; l++){
			for(int m=0; m<n; m++){
				System.out.printf("%4d",matrix[l][m]);
			}
			
			System.out.println();
		}
		
		for(int i=0; i<n; i++){
			int temp= matrix[i][i];
			matrix[i][i]= matrix[i][n-i-1];
			matrix[i][n-i-1]= temp;
		}
		
		System.out.println();
		System.out.println("Diagonals Exchanged Matrix: ");
		
		for(int k=0; k<n; k++){
			for(int j=0; j<n; j++){
				System.out.printf("%4d",matrix[k][j]);
			}
			System.out.println();
		}
				
		
	}
	


}
