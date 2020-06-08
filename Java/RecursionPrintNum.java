

public class RecursionPrintNum {
	   
	   public static void printNUms(int num){
	      
	    if (num<0) return;
	      else 
	    	  System.out.print(num);
	    	  
	    printNUms(num-1);
	      
	   }
	   
	   public static void main(String[] args) {
	      
	      
	      
	      printNUms(5);
	      
	      
	      
	      
	   }
	}