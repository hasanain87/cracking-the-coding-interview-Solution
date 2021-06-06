 import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;  // needed for Scanner

    /** A Java program that demonstrates console based input and output. */
    public class String_Test
    {
    	static int [] output=new int[26];
    	static int [] freq=new int[26];
        static char []str_chars ;
     // Create a single shared Scanner for keyboard input
        private static Scanner scanner = new Scanner( System.in );
    	
    	static int largest(int [] arr) 
        { 
            int i; 
              
            // Initialize maximum element 
            int max = arr[0]; 
           
            // Traverse array elements from second and 
            // compare every element with current max   
            for (i = 1; i < arr.length; i++) 
                if (arr[i] > max) 
                    max = arr[i]; 
           
            return max; 
        } 
    	
    	static void Ferquency() {
    		
    		for(int i=0;i<output.length;i++){
         	   freq [i] =(int) ((((float) output[i] /26) * 100 )) ;
         	   
         	   //System.out.print(freq [i]+"  ");
 					  
 				}	
    			}
    	
    	
    		static void Print(int max) {
    			System.out.println("A Total of 3  of the  alphabet were  processed "+str_chars.length);
    	           //FIND THE MAX NUMBER
    	          //int max= largest(output);
    	          // PRINT THE ALPHABETICAL CHARACTER
    	          for(int i=0;i<26;i++){ 
    	        	  System.out.print((char) (i+97)+"  ");   	  
    	          }
    	          
    	          
    	          System.out.println();
    	         // System.out.println(output[0]); 
    	          int j;
    		              for( j=1;j<=max;j++){
    		            	  for(int i=0;i<26;i++){
    		            		  
    		                   if(freq[i]>0){  
    		                      
    				                   System.out.print("*"+"  "); 
    				                   
    				                   freq [i]=freq[i]-1;
    		                   			}// END OF IF 
    		                   
    		                else{
    		                	System.out.print("   "); 
    		                	
    		                			}	   
    		                   
    		                }
    		            	  System.out.print("  "+j);
    		            	   System.out.println();
    		            	    
    		               }
    		             
    		                  
    		           }//end of PRINT FUNC
    		    
        	    

        // Program execution starts here
        public static void main ( String [] args )
        {
        	
        	String input="";
        	String text="";
            // Prompt the user
        	boolean flag_input ;
        	
        	while(flag_input=true){
     
        	System.out.println ("Enter a Line of Text : ");
            // Read a line of text from the user.
           input= scanner.nextLine();
           
           if (input.equals("DONE")){
        	   flag_input=false;
        	   break;
           }
           else
        	   text+=input;
        	}// end of while
           
        	 //System.out.println(text);
        	
        	 text=text.toLowerCase();
         str_chars=text.toCharArray();  
           for(char ch:str_chars){
        	  
        	  if( Character.isLetter(ch)){
        		  int counter=0;
        		int index=((int) ch-97);
        		//System.out.println("index--"+index);
        		//System.out.println("counter"+counter);
        		//Increment the value of the array at the specified index
        		output[index]=output[index]+1;
        		// sort the array
        		 		
        		//System.out.println("counter--"+counter);
        	  } //END OF IF
        	  
           }//END OF CHAR LOOP
           
           Ferquency();  
           //int max=largest(freq);
           //System.out.println(max);
           
           Print(largest(freq));
           
           
           
           
           
       
        }
    }
        
        
	      
         		
         		
         		
           
           
           
       // } // end main method
    
    //for(int i=0;i<ouput.length;i++){
	   
	//   for(int j=0;j<1;j++){
		   
		   //if(ouput[i]>1){  
			  // ouput[i]--;
		   //System.out.println(" * "+" ");   
	   //}
	   
	 //  }
  // }//end of 1st loop
   
   
//System.out.println(+"-");
   /*
   //print the output array
   for(int i=0;i<ouput.length;i++){
 		
 		System.out.println(ouput[i]+"-");*/
 		
 		
 		//for(int i=0;i<=max;i++){

     // end MyConsoleIO class
