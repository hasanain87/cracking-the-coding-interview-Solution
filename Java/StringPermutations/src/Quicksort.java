import java.util.Random;

public class Quicksort {

	 public static  void quickSort(int arr[], int p, int r) {
		    if (p < r) {
		    	  
		        Random rand = new Random();
		        int i = p + rand.nextInt(r - p);
		        int swapTemp = arr[i];
			    arr[i] = arr[r];
			    arr[r] = swapTemp;
		        
		        
		        int q = partition(arr, p, r);
		        quickSort(arr, p, q-1);
		        quickSort(arr, q+1, r);
		        
		        
		        
		        
		    
		    
		  
		    	
		    }
		    
		}
	 
	 
	
	
	 private static int partition(int arr[], int p, int r) {
		    int x = arr[r];
		    int i = (p-1);
		 
		    for (int j = p; j < r; j++) {
		        if (arr[j] <= x) {
		            i++;
		 
		            int swapTemp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = swapTemp;
		        }
		    }
		 
		    int swapTemp = arr[i+1];
		    arr[i+1] = arr[r];
		    arr[r] = swapTemp;
		 
		    return i+1;
		}
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //int []arr={2,8,7,1,3,5,6,4};
		int []arr={1,2,3,4,5,6,7,8};
		 
		    quickSort(arr,0,7);
		    for (int j = 0; j < arr.length; j++) {
		    	System.out.print(arr[j]);
		
		    }
		
		
	}

}
