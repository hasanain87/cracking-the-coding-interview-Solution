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
	
	
	
   public static void main(String[] args) {
      
     
	      int length=arr.length-1;
	      System.out.println ("the max number in the array is  "maxNum(arr,length));
	      System.out.println("2 to the power 4 is "+pow2(4));
	      System.out.println("Sum of nums 1 to 1oo is "+SumAll(100));
   }
}
