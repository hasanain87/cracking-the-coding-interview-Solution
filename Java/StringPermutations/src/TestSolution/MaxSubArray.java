package TestSolution;

public class MaxSubArray {
	
	static int sumArray(int anArray[], int size)
	{
	    //base case
	    if (size == 0)
	    {
	        return 0;
	    }
	    else if (size == 1)
	    {
	        return anArray[0];
	    }

	    //divide and conquer
	    int mid = size / 2;
	   // int rsize = size - mid;
	    int lsum = sumArray(anArray, mid);
	    //int rsum = sumArray(anArray + mid, rsize);
	    return lsum ;
	}
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	
	
		      int arr[]={13 ,3 ,25 ,20 ,3 ,16 ,23 ,18 ,20 ,7 ,12 ,5 ,22, 15 ,4 ,7};
		      sumArray(arr,15);
		      
		
		
	}	

	}


