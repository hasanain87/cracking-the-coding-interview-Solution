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
	      
   public static void main(String[] args) {
      
     
	      int length=arr.length-1;
	      System.out.println(maxNum(arr,length));
	      
   }
}
