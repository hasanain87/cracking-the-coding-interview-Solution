import java.util.*;
import java.lang.*;
import java.io.*;
public class Encryption {
	 static String temp = " ";

	public  static String Decode (String S)
	
	{
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String enc = "kngcadsxbvfhjtiumylzqropwe";
		
		
		
		for (int i=0;i<S.length();i++)
		{
			
			 char x1 = S.charAt(i) ;
			 
		if (Character.isUpperCase(x1) == true) 
		{
			Character.toLowerCase(x1);
			System.out.println(x1);
			
			int x= letters.indexOf(x1);
			
			Character.toUpperCase(x1);
			
			temp  += enc.charAt(x);
			 }
		   else
			 {
			
			int x= letters.indexOf(x1);
			 temp  += enc.charAt(x);
			 }
			
			
		}
		return temp;
	}
	
	public static void main(String[] args) throws Exception {
		
  java.io.File file =new  java.io.File("hello.txt"); // create a file object
 
  System.out.println("Can it be read?  "+ file.canRead());	// check the file is exists and can be read

	
   
 Scanner input = new Scanner (file );
  PrintWriter output= new  PrintWriter("target.txt");
 
 
  while (input.hasNext())
  {
		 String f= input.next();
		 
		 System.out.println( f);
          System.out.println(  Decode (f));	
          output.println(Decode(f));
		}
		
		
		input.close();
        output.close();

	}
}

	
