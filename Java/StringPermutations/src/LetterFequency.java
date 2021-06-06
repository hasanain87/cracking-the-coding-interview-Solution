import java.util.Arrays;
import java.util.Scanner;

public class LetterFequency {
	//char array
	char []array; 
	// total of input  Char 
	static int sumChar=0;
	char   getmaxch;
	// MOST FREQ CHAR
	//static char   getmaxChar;
	 static int[] letterCounts;
	
	 public static String beta =" ";
	 
	static StringBuilder  s=  new StringBuilder();
	
	
	public static int [] TreatArray (String beta){
		
		letterCounts = new int[26];
	
	    for (int i=0;i<beta.length();i++){
		 
		 char stringChar = beta.charAt(i);
		 boolean checkch= Character.isAlphabetic(stringChar);
	  
		if(checkch){
			int x=stringChar-'a';
			letterCounts[x] ++;
			sumChar++;
	
	   }
		
		else{
			
			continue;
			
		}
	 }
	return letterCounts;
		
	}
	
	public static char getMostcomman(int getmax ){
		int i;
		for (i=0;i<26;i++){
			if (letterCounts[i]==getmax){
				break;		
			}
		}
		
		//char getmaxChar=
		return (char)(i + 'a');		
	}

	// 
	public static int getMaxcharFreq(int []letterCounts){
		int getmax=letterCounts[0];
		
		for ( int i=1;i<26;i++){
			if (letterCounts[i]>getmax){
				getmax=letterCounts[i];
					
			}
			else 
			continue;
					
		}
		
		return getmax;	
	}
	
	// PRINT 
	static void print(int max,int  freq[],char mostcomchar){
		System.out.println("a b c d e f g h i j k l m n o p q r s t u v w x y z  %\n");
		for(int i = 0; i < max; i++)
		{
			for(int j = 0; j < 26; j++)
			{
				if (freq[j] == 0)
				{
					System.out.print("  ");	
				}
				else
				{
					System.out.print("* ");
					freq[j]--;
				}
			}
			System.out.println(" " + (i + 1));
		}
		System.out.println("\nThe most common letter is " +mostcomchar+ " with a frequency of " + max + " %\n");
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		// intialize String  from input
		boolean z= true;
		
		//infinite  loop to enter a Text untill you enter  "DONE" will process 
		System.out.println("Enter text at the prompt to calculate letter frequencies. Enter DONE when finished with text input.\n");
		 while  (z){    
			 
		 System.out.println ("Enter a Line of Text : ");
			 
		 beta  = input.nextLine();
		
		if (beta.equals("DONE"))
		{
			
			z=false;
			break ;
		}
		else
			s.append(beta);
		 }
	   
		 Stopwatch sw = new Stopwatch();
		 String str=s.toString().toLowerCase();
		 int[] letterCountArray = new int[26];
		 letterCountArray= TreatArray(str);
		 
	     for (int i=0;i<letterCountArray.length;i++){
	    	 System.out.print(letterCountArray[i]+" ");
	    	 
	     }
	     
	     System.out.println();
	     System.out.println( " A total of   "+ sumChar +"  letters of the alphabet were processed.");
	     
	     System.out.println();
	     
	     //GET THE MAX CHAR REQ
	     int max=  getMaxcharFreq(letterCounts);
	     System.out.println("THE MAX IS   "+max);
  
	    // System.out.println(getmax); 
		
		
	   char   getmaxch = getMostcomman(max);
	      
	     print(max, letterCounts,getmaxch);
	     double x = sw.elapsedTime();
	    	System.out.println("Time: " + x);
}       
}
	
	

