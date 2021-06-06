
public class HeapSort {	
	static void    Build_MAX_HEAPIFY( int [] A){
		
		int n = A.length;
		int len=((A.length)/2)-1;
			    
		for(int i=len;i>=0;i--){
			MAX_HEAPIFY(A, n,i);
		}	
	}
	
	
	
static void    Delete_min( int [] A){
		
		int n = A.length;
		int len=((A.length)/2)-1;
		int min=A[len];
		int InMin=len;
		//System.out.println(A[len]+"len ");
		
		for(int i=len;i<n;i++){
			if(A[i]<min){
				min=A[i];
				InMin=i;
				System.out.println(min+"  "+A[i]+"Found it ");
			}
			
		}
		A[InMin]=0;
	
		
	}
	
	
	
static void    Find_x( int [] A,int x){
	
	int n = A.length;
	int len=((A.length)/2)-1;
	
	System.out.println("len"+len);
		   if(x==A[len]){
			   
			   System.out.print("Found it");
			   return;
		        }


		   else if(x>A[len]){
			  
			  
			   for (int i = len+1; i <n; i++) {
		      
					   if(x==A[i]){
						   
						   System.out.print("Found it"+A[i]);
						   return; 
					   }
					   
			           }
		        }
		   
	
	

		   else if(x<A[len]){
			  
			  
			   for (int i = 0; i<len ; i++) {
		      
					   if(x==A[i]){
						   
						   System.out.print("Found it"+A[i]);
						   return; 
					   }
					   
			           }
		        }
		   
		   
		   
	
	
	
}



	
	
	
	public  static void sort(int arr[])
    {
        int n = arr.length;
 
          // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
        	MAX_HEAPIFY(arr, n, i);
        }
            
 
        // Heap sort
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
              // Heapify root element
            MAX_HEAPIFY(arr, i, 0);
        }
    }
 
	
	
	
	
	
	
	 static void MAX_HEAPIFY(int arr[], int n, int i)
	    {
         // Find largest among root, left child and right child
       int largest = i; 
       int l = 2*i + 1; 
       int r = 2*i + 2;  

       if (l < n && arr[l] > arr[largest])
           largest = l;

       if (r < n && arr[r] > arr[largest])
           largest = r;

         // Swap and continue heapifying if root is not largest
       if (largest != i)
       {
           int swap = arr[i];
           arr[i] = arr[largest];
           arr[largest] = swap;

           MAX_HEAPIFY(arr, n, largest);
       }
   }
	
	 
	 
	 static void MAX_HEAPIFY_loop(int arr[], int n, int i)
	    {
      // Find largest among root, left child and right child
		 
		 while(true){
				    int largest = i; 
				    int l = 2*i ; 
				    int r = 2*i +1;  
				
				    if (l < n && arr[l] > arr[largest])
				        largest = l;
				
				    else largest = i;
				    
				    if (r < n && arr[r] > arr[largest])
				        largest = r;
				
				    if (largest == i)
				            return;
				    
				      // Swap and continue heapifying if root is not largest
				    else
				    {
				        int swap = arr[i];
				        arr[i] = arr[largest];
				        arr[largest] = swap;
				       
				    }
				    
				    i=largest;
				    
				    
				    
          }
	
		 
		 
	 
	    }  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	private static void Swap(int [] arr,int i, int j) {
        // temp is a temporary variable to store value.
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;			 	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={16,4,10,14,7,9,3,2,8,1};
		//int[] A={16,14,10,8,7,9,3,2,4,1};
		//int[] A={4 ,1 ,3 ,2 ,16 ,9 ,10 ,14 ,8 ,7};
		//MAX_HEAPIFY(A,10,1);
		 //MAX_HEAPIFY_loop(A,10,4);
		//int[] A={1,2,3,4,5,6,7,8,9};
		 Build_MAX_HEAPIFY(A);
	     sort(A);
		//System.out.print(A.length+"length");
	     //Delete_min(A);
		
		 Find_x( A,14);
		
		System.out.println();
		for(int i=0;i<A.length;i++){
		System.out.print(A[i]+" ");
		}
		
	}

	
	
	
	
	
	

}
