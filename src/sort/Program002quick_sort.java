package sort;

public class quick_sort {
	
	public static void main (String [] args){
		int [] array={20,50,10,30,60};
		quicksort(array, 0, array.length-1);
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static void quicksort(int [] array, int l, int h){
		if(l<h){
			int j=partition(array,l,h);
			quicksort(array, l,j);
			quicksort(array,j+1, h);
		}
	}
	
	public static int partition(int array[],int l, int h){
		int pivot= array[l];
		int i=l, j=h, temp1, temp2;
		while(i<j){
			do{
				i++;
			}while(array[i]<pivot);
			
			do{
				j--;
			}while(array[j]>pivot);
			
			if(i<j){
				temp1=array[i];
				array[i]=array[j];
				array[j]=temp1;
			}
		}
		
		temp2= array[l];
		array[l]=array[j];
		array[j]=temp2;
		
		return j;
	}

}
