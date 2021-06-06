

public class RecursionPrintNum {
	    
	    static int start=0;
	    static int[] arr={90,70,100,30,101};
	    static int  max=arr[0];
	
	
	
	
	   public static void printNUms(int num){
	      
	    if (num<0) return;  //base case
	      else 
	    	  
	    	  
	    printNUms(num-1);
         
         System.out.print(num);
	      
	   }
	   
	   
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
	      
	   
	   public static int SumAll (int num){
		   
		   if (num==0) return 0;
	      else 
	         return num+SumAll(num-1);
		   
		      } 
	   
	   
	   // 
	   static int temp;
	   public static void reverse1(int [] arr,int start, int end){
		    
		      if(start >= end ) return  ;
		      
		           temp =arr[start];
		           arr[start]=arr[end];
		           arr[end]=temp;
		          reverse1(arr,start+1,end-1);	      
		      
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
	      
	      
	      
	      printNUms(5);
	      
	     
	      int length=arr.length-1;
	      System.out.println(maxNum(arr,length));
	      int   Sortedarr [] ={1,2,3,4,5,6,7,8,9,10,11,15,19};
    
	      System.out.println("10 is at index   "+bs(Sortedarr,100,0,Sortedarr.length-1));
            int   Reveredarr [] ={1,2,3,4};
            int len=Reveredarr.length-1;
     
	      
	     reverse1(Reveredarr,0,Reveredarr.length-1);
			     for(int i=0;i<=len;i++){
			    	 System.out.println("");
			    	 System.out.print(Reveredarr[i]);
			    	 	 
			     }
	      
	      
	      
	      
	   }
	}