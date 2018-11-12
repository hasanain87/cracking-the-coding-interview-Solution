public class FindMaxNum {
   
   static int start=0;
   static int max;
   
   static int max (int[] nums){
      
       if(start ==nums.length-1) return max;
      else
     
  
      
  
      if (nums[start] >start)
         max=nums[start];
         
        
          start++;
      
      
      return  max(nums);
         
      
      
     }
   
   public static void main(String[] args) {
      
      int []nums={1,7,9,19,90,5};
      
     max(nums);
      
   }
}