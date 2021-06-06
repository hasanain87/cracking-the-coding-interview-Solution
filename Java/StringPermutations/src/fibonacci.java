import java.util.Scanner;

public class fibonacci {

	 public static int fibonacci(int n) {
	       if (n == 0) {
	           return 0;
	       } else if (n == 1) {
	           return 1;
	       } else {
	           
	    	   
	    	   return fibonacci(n - 1) + fibonacci(n - 2);
	       }
	 }
	 
	
	 public static  int[] InsertionSort(int []arr){
		 
		 for(int i=1;i<arr.length;i++){
			 for(int j=0;j<=i;j++){
		
				 if(arr[i] < arr[j]){
					int temp =arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					 
					 
				 }
				 
			 }
			 			 
		 }		 
				 
		 return arr;
		 		 
	 }
	 
//n - 1 number of swaps at most, makes	 
 public static  int[] IselectionSort(int []arr){
		 
	 
	 int min=0;
	 //O(n)
		 for(int i=0;i<4;i++){
			min=arr[i];
			// n-1, n-2,------  O(n^2)
			 for(int j=i+1;j<arr.length;j++){
		
				 if(arr[j] < arr[i]){
					// min=j;
					 int temp =arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
				 }
				 //swap(arr[min],arr[i],arr);
			   }
		 	  }
		 		 return arr;		 
	 }
	 
	 public static void printArray(int [] arr){
		 System.out.print("[");
		 for (int i = 0; i < arr.length; i++) {
			 
	          System.out.print(arr[i] + " ,");
	         
	       }
		 System.out.print("]");
	 }
 
	 
	 

	 public static int [] Quicksort(int [] arr,int left,int right){
	      
	      if(left<right){
	         
	         int pivot=partition(arr,left,right);
	         Quicksort(arr,left,pivot-1);
	         Quicksort(arr,pivot+11,right);
	         
	      }
	            
	      return arr;
	      
	   }

	   
	   
	   
	    public static int partition(int [] arr,int left,int right) {
			 
	       int m=left+right/2;
	       swap(left,m,arr);
	      int pivot=arr[left];
	       int lo=left+1; int hi=right;
	       while(lo<= hi){
	           while(arr[hi]>pivot ){
	              hi=hi-1;
	              
	               while(lo<= hi&& arr[lo]<= pivot ){
	                  
	                  lo=lo+1;
	                  if(lo<= hi){
	                     
	                   swap(lo,hi,arr);
	                     lo=lo+1;
	                      hi=hi-1;
	                  }
	              
	               }
	          
	           } 
	          
	         swap(left,hi,arr);
	          
	       }
	       
	        return hi;
	    }
	   
	   
	   
		 private static void swap(int i, int j, int[] arr) {
			// TODO Auto-generated method stub
			    int temp =arr[j];
				arr[j]=arr[i];
				arr[i]=temp;	
				
		}

		 public static void mergeSort(int Arr[], int start, int end) {

				if(start < end) {
					int mid = (start + end) / 2;
					mergeSort(Arr, start, mid);
					mergeSort(Arr, mid+1, end);
					merge(Arr, start, mid, end);
				}
			}
		 
		 
		 
		 public static void merge(int Arr[], int start, int mid, int end) {

				// create a temp array
				int temp[] = new int[end - start + 1];

				// crawlers for both intervals and for temp
				int i = start, j = mid+1, k = 0;

				// traverse both arrays and in each iteration add smaller of both elements in temp 
				while(i <= mid && j <= end) {
					if(Arr[i] <= Arr[j]) {
						temp[k] = Arr[i];
						k += 1; i += 1;
					}
					else {
						temp[k] = Arr[j];
						k += 1; j += 1;
					}
				}

				// add elements left in the first interval 
				while(i <= mid) {
					temp[k] = Arr[i];
					k += 1; i += 1;
				}

				// add elements left in the second interval 
				while(j <= end) {
					temp[k] = Arr[j];
					k += 1; j += 1;
				}

				// copy temp to original interval
				for(i = start; i <= end; i += 1) {
					Arr[i] = temp[i - start];
				}
			}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 //int [] arr={8,2,4,9,3,6};
	      //args InsertionSort(arr );
		 //IselectionSort(arr);
		 int [] arr2={38,81,48,13,69,93,14,45,58,79,72};
		 Quicksort(arr2, 0,arr2.length-1 );
		 printArray(arr2);
		 
	      
	       
		 /*Scanner s = new Scanner(System.in);
	       System.out.print("Enter the value of n: ");
	       int n = s.nextInt();
	       for (int i = 0; i <= n; i++) {
	          System.out.print(fibonacci(i) + " ");
	       }
	       */
		
			int arr[] = {10, 7, 8, 9, 1, 5}; 
		    int n = arr.length; 

          mergeSort(arr, 0, n-1); 
          printArray(arr);
	       
	}


}