package array;
// Write an algorithm such that if an element in an MxN matrix is 0, it's entire row and column are set to zero
public class Program004zero_replacement {
	
	public static void check_zero (int array[][], int M, int N){	
		boolean row[]= new boolean[M];
		boolean column[]= new boolean[N];
	  for(int i=0; i<M; i++){
		for(int j=0; j<N; j++){
			if(array[i][j]==0){
				row[i]=true;
				column[j]= true;
			}
		}
	}
	  
	  for(int i=0; i<row.length; i++){
		  if(row[i])
			  change_row_zero(array, i, N);
	  }
	  
	  for(int i=0; i<column.length; i++){
		  if(column[i])
			  change_column_zero(array, i, M);
	  }
	}
	
	
	public static void change_row_zero (int [][]array, int row, int N){
		for(int i=0; i<N; i++){
			array[row][i]=0;
		}
		
	}
	
	public static void change_column_zero (int [][] array, int col, int M){
		for(int j=0; j<M; j++){
			array[j][col]=0;
		}
	}
	
	public static void display_matrix (int array[][], int M, int N){
		for (int i=0; i<M; i++){
			for (int j=0; j<N; j++){
				System.out.printf("%2d", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main ( String args[]){
		int [][] array= {{1,0,2,4}, {8,9,4,3}, {5,6,9,0}};
		int row= array.length;
		int column = array[0].length;
		check_zero(array, row, column);
		display_matrix(array, row,column);
		
	}

}
