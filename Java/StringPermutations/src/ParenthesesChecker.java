/*
 * Al_sabonchi_Hasanain
 * 
 * 
 * 
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ParenthesesChecker {
	
	public static boolean checkParentheses(String filename) {
		ISimpleStack<String> stack = new SimpleStack<String>();
		String delimiters = " ()";
		int size=0;
		
		try (Scanner in = new Scanner(new File(filename))) {			
			while (in.hasNextLine()) {
				
				StringTokenizer st = new StringTokenizer(in.nextLine(), delimiters, true);
				
				while (st.hasMoreTokens()) {					
					String token = st.nextToken();    //Read and process tokens one by one and care here "(  and )"
					//System.out.print(token);
							
							if(token.equals( "(" )){
									stack.push(token);
									System.out.println("I'm in the push");
									stack.printList();
									
									
									}
							
							else if(token.equals( ")" )) {
								System.out.println("I'm in )" );
								if(stack.isEmpty()) return false;
								
								else if(!stack.isEmpty())
									//System.out.println("The stack is "+stack.isEmpty());
									System.out.println("After Pop");
									stack.printList();
									stack.pop();
									}
							

							/*else if((token.equals( ")" )) ) {
								System.out.println("I'm in )" );
								if (stack.isEmpty())	return false;
								 if (! stack.pop() .equals(")")){
								
							   return false;
								 }
									}*/
							
																
				                       }
			                   }
		                      }
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		    return true;
	}
	
	
	// Please remove your main() function when you submit this file
	
	public static void main(String[] args) {
		System.out.println(checkParentheses("sample_notWellFormed.txt"));
	}
}
