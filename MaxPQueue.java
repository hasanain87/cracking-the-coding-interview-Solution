import java.util.Random;
public class MaxPQueue{

//Implement A Priority Queue(max Heap) Using Array
	
// Create an array of size 10 INT
static int arr[]=new int[10];

// The size of the array.
static int size=0;

//Add Value to the array
 public  static void add(int val)
 {		
			arr[++size]=val;
			// Call the methos
			HeapifyUp(size);
								
  }
		
private static int Remove(int i) {
	
	//
				int max=arr[1];
				arr[1]=arr[size];
				arr[size--]=0;
				HeapifyDown(1);	
			 return  max;	
					
		       	}
				
			public int getMax(){
				return arr[1];	
			  }

			
	private static void HeapifyDown(int i) {
				// TODO Auto-generated method stub
				
		//while 2*1<= size do
		while(2*i<= size) {
			int chIndex=2*i; // left Child
			int maxIndex=arr[chIndex]>arr[chIndex+1]?chIndex:chIndex+1;// which child  has the max value
			//if the root < max (shild) do swapping
			if(arr[chIndex]<arr[maxIndex]){
					Swap(arr,i,maxIndex);
					i=2*i;
					    
					  }
			    else break;
				     
				   }
			  }

    public static boolean isMaxHeap(){
    	
    	// starting from the root if the root <Left Child 2*i or right child  2*i+1 return false
         for(int i=1;i<size;i=i*2){
        	if(arr[i]< arr[2*i] )        	 
        	 return false;  	            
               if((2*i+1) <=size  && arr[i]< arr[2*i+1]) return false;
              }
    	return true;
    	
        }
	
	

	private static void HeapifyUp(int i) {
		//While is important if you use if statement will not do the purpose
	   //the parent of the node which is located at index i is i/2.
			while(i>1 && arr[i]>  arr[i/2])
					{
						Swap(arr, i , i/2);
						i=i/2;
						
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
		
		MaxPQueue heap= new MaxPQueue();
	
		// what is our range?
		int max = 100;
		int min = 40;
		
		// create instance of Random class
		Random randomNum = new Random();
		
	
		// Generate 8 random Number and them to the array.
		for (int i=0;i<8;i++){
			//which generates a random number between 0 and the number specified (n)
			int val = randomNum.nextInt(max);
			System.out.print(" "+val+" ");
		
			heap.add(val);
			
		     }
		System.out.println();
		
	    // Print the array 
		for(int i=0;i<arr.length;i++)		
				
		System.out.print("-"+arr[i]);
		System.out.println();
		System.out.println("ISmaxHeap  ------->> "+isMaxHeap());
		System.out.println(Remove(3));

	}
	
}