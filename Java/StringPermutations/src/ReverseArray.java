
public class ReverseArray {

    static int start;
    static int  end;

    static void recursive(int [] arr) {
     
  
      start=0;
      end=arr.length-1;
      reverseArray(arr,start,end);
   
 }
    
    
     static int[] reverseArray (int[] arr, int start, int end) {
        // TODO Auto-generated method stub
       
           if(start > end/2) return arr;
   
           else{
             int temp = arr[start];  
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
          
            return reverseArray(arr,start,end);
       
           }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	int[] arr={1,2,3,4};
        recursive(arr);
        for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]);
         
        
    }

}