package array;

public class Program007spiral_matrix_sorted_arrange {

	public static void spiral_matrix (int [] sorted, int [][] spiral, int index, int row, int col, int circle){
		if(index>=(row*col))
			return;
		
		for(int i=circle; i<(col-circle); i++){
			spiral[circle][i]= sorted[index];
			index++;
		}
		
		if(index>= (row*col)){
			return;
		}
		
		for(int i=circle+1; i<row-circle; i++){
			spiral[i][col-1-circle]= sorted[index];
			index++;
		}
		
		if(index>=(row*col)){
			return;
		}
		
		for(int i=circle; i<col-circle-1; i++){
			spiral[row-circle-1][col-i-1-1]= sorted[index];
			index++;
		}
		
		if(index>=(row*col)){
			return;
		}
		
		for(int i=circle+1; i<row-circle-1; i++){
			spiral[row-circle-i-1][circle]=sorted[index];
			index++;
		}
		
		if(index>=(row*col)){
			return;
		}
		
		circle++;
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.printf("%2d", spiral[i][j]);
			}
			System.out.println();
		}
		
		spiral_matrix (sorted, spiral, index, row, col, circle);
		
	}
	
	
	public static void main(String[] args) {

		int[][] matrix1 = { { 4, 6, 15, 11 }, { 1, 8, 9, 14 },
				{ 2, 12, 5, 10 }, { 3, 16, 7, 13 } };
		int n = 16, row = 4, col = 4, z = 0;
		int[] sorted = new int[n];
		int spiral[][] = new int[row][col];

		// covert unsorted matrix to 1d array
		for (int l = 0; l < row; l++) {
			for (int k = 0; k < col; k++) {
				sorted[z++] = matrix1[l][k];
			}
		}

		// Bubble Sort
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (sorted[j] > sorted[j + 1]) {
					int temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
				}
			}
		}
		
		spiral_matrix (sorted, spiral, 0, row, col, 0);
		
		for(int i=0; i < row; i++) {
            for(int j=0; j < col; j++) {
                System.out.printf("%2d ",spiral[i][j]);
            }
            System.out.println();
		}

	}

}
