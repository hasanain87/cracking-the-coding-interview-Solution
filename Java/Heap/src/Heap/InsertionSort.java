package Heap;

public class InsertionSort {
	
	static int count=1;
	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            //System.out.println(count++);
	            
	            while ( (i > -1) && ( array [i] > key ) ) { 
	            	System.out.print("count"+count++);  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    }  

	
	 public static void main(String a[]){    
	        //int[] arr1 = {1,2,3,4,5,6,7,8,9,10}; 
		     int[] arr1 = {10,9,8,7,6,5,4,3,2,1};   
	        System.out.println("Before Insertion Sort");    
	        for(int i:arr1){    
	            System.out.print(i+" ");    
	        }    
	        System.out.println();    
	            
	        insertionSort(arr1);//sorting array using insertion sort    
	           
	        System.out.println("After Insertion Sort");    
	        for(int i:arr1){    
	            System.out.print(i+" ");    
	        }    
	    }    
	
	
	

}
