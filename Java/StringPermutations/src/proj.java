


import java.util.*;


public class proj {
	
	static int w;
	static  int[] freq1 =new  int [26];
	public static int count=0 ;                 //count all character

	public static  char P;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int max;
	
			int lower[] =new  int [26];    //array to put alphabetical character on it from the Text
		
			
			String alph = " ";
			String beta =" ";
			
			Scanner input = new Scanner (System.in);
			
			String s2="DONE";
			boolean z= true;
			
			//infinite  loop to enter a Text untill you enter  "DONE" will process 
			
			 while  (z){    
				 
			 System.out.println ("Enter a Line of Text : ");
				 
			 beta = input.nextLine();
			if (beta.equals(s2))
			{
				z=false;
				break ;
			}
			
			else
			{
				
				
			   alph += beta;
				
		
			}
		

			 }
				
			for (int i =0;i<alph.length();i++)  //loop to check each character 
			{
				if (Character.isUpperCase(alph.charAt(i))){ // if the character is UPerercase
					
			char c = Character.toLowerCase(alph.charAt(i));
				int x= c -'a';
			
			lower [x]++;
			
			
			count ++;
		
			
			}
				
				else if (Character.isLowerCase(alph.charAt(i)))  //if the character is Lower case
				{
				int x= alph.charAt(i) -'a';
			
				lower[x]++;
				
				count ++;
				
				
				}
				 
				else                 //if its not chracter
					continue ;
					
				
					
			}
			
			//loop to calculate  frequency of each character of array lower  then store it in  freq1 array
				
				for(int i=0;i<lower.length;i++){
					  freq1 [i] =Math.round((((float) lower[i] /count) * 100 )) ;
					
					 	  
					}
					
		 w = mostused();  //call mostused function
		
				
		print();  //call the function for printing the chart
				
		}
		
		
		
		
		
		
	static void print (){
		
		
		// printing  the chart 
		
		System.out.println("A Total of "+  count +"  "  + "of the  alphabet were  processed "+ "\n"  );

		for (int i=0;i<26;i++)                         //print alphabetic character once at time
		{
			System.out.print((char)(i+'a')+" ");
			
		}
			
		System.out.print (" "+"%"); // print "%"
		System.out.println();
		int i;
		
		//printing  the star ***************
		
		   for (int h=0; h<w;h++){ //Row  for chart
					
			  
			   
		    for ( i =0 ;i < 26 ; i++){ //column for chart
		    		if (freq1[i]>0){
		    			
		    			System.out.print("*"+" ");
		    		freq1[i]--;	
		    		
		    	}else
		    	{
		    			System.out.print("  ");   //if no frequency print  " " 
		    		
		    	}
		    		
		    		
		    }
		    System.out.print(" ");
		    System.out.print(h+1);
		    System.out.println();		
		    	
		    }
		   
		
				System.out.println (" The most common letter is"+ " "+P +" with a frequency of "+w+" % "); 
	}
			
	
			
		//method to find the common letter frequency
		
    static int mostused( )

	{
    	int q = 0;
    	int i = 0;
 
	int  max =(int) freq1[0];
	for( i=1;i<freq1.length;i++){
	if (freq1[i]> max){
		max=(int) freq1[i];
		q=i;
		 
		
	}
		 
	
	}
	P=(char) ((char) q +97) ;
	 return max;
	}


}