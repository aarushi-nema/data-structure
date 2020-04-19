package array;

public class Program003rotate_image {
	
	public static void rotate_image(int [][] image, int N){
		
		for(int i=0; i<N/2; i++){
			for(int j=i; j<(N-i-1); j++){
				int temp= image[i][j];
				image[i][j]= image[j][N-i-1];
				image[j][N-i-1]= image[N-i-1][N-j-1];
				image[N-i-1][N-j-1]= image[N-j-1][i];
				image[N-j-1][i]= temp;
			}
		}
	}
	
	public static void display_image (int [][] image, int N){
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.printf(" %2d ",image[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main ( String [] args){
		int image[][]= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		rotate_image(image, 4);
		display_image (image,4);
		
	}

}
