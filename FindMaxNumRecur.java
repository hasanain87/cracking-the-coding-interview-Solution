public class FindMaxNum {
   
      static int start=0;
	    static int[] arr={90,70,100,30,101};
	    static int  max=arr[0];
	
   
   public static int maxNum (int[] arr,int end){
	   
	      
	     if(start >end) return max;
	     else
	         if(arr[start] > max) {
	         max=arr[start];
	         start++;
           maxNum( arr,end);
	         } 
	     start++;
	         return  maxNum( arr,end);
	      }
	      
	
	
	public static int pow2 (int exp){
	   
      if (exp==0) return 1; // base case
      else 
         return 2*pow2(exp-1);
	   
	 }
	
	public static int SumAll (int num){
	   
	   if (num==0) return 0;
      else 
         return num+SumAll(num-1);
	   
	      }
	
	
  public static int partialSum (int[] arr,int start,int end){
        
		if(start >= end) return 0;  // return 0 to end 
		  else
		      // the index  here is start that has incremented
		  return arr[start]+partialSum(arr,start+1,end);       
     }
   
   public static int  sum(int [] arr ){
          // helper function
           return partialSum(arr,0,arr.length);
          }
	
	public static int bs (int[] arr,int val,int start,int end){
        
		if(start >= end) return -1;  // return 0 to end 
		  int mid=(start+end)/2;
		  if(arr[mid]> val) return  bs(arr,val,start,mid-1);
		  else if(arr[mid]== val) return mid;
		  else 
		     return  bs(arr,val,mid+1,end);
     }
	      
	
	
   public static void main(String[] args) {
      
     
	      int length=arr.length-1;
	      System.out.println ("the max number in the array is  "maxNum(arr,length));
	      System.out.println("2 to the power 4 is "+pow2(4));
	      System.out.println("Sum of nums 1 to 1oo is "+SumAll(100));
	      System.out.println("Sum of array"+sum(arr));
	      System.out.println("Partial sum of array"+partialSum(arr,0,2));
	     System.out.println("10 is at index   "+bs(Sortedarr,10,0,Sortedarr.length-1));
   }
}
