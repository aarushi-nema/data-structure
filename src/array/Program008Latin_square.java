package array;

public class Program008Latin_square {
	
	public static int check_duplicate (int [][] matrix, int element, int row ,int col,int n){
		int duplicate=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i==row)
					if(element==matrix[i][j])
						duplicate++;
				if(j==col)
					if(element==matrix[i][j])
						duplicate++;
			}
		}
		
		return duplicate;
	}
	
	public static void main ( String args []){
		int [][] matrix= {{1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3}};
		int n=4, duplicate=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.printf("%4d", matrix[i][j]);
			}
			
			System.out.println();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				int g=check_duplicate(matrix ,matrix[i][j],i,j,n);
				if (g>2)
					duplicate++;
			}
		}
		
		if(duplicate==0)
			System.out.println("Matrix is Latin Sqaure");
		else
			System.out.println("Matrix is not Latin Square");
	}

}
