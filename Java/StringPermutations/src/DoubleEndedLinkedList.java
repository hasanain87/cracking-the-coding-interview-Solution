import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleEndedLinkedList {

	
	public static int cube(int i) {
		 int j = i * i * i;
		 return j;
		 }	
		
	

	
	public static void main(String[] args) {
		//System.out.println("1"+2);
		int N = Integer.parseInt(args[0]);
		 for (int i = 1; i <= N; i++)
		System.out.println(i + " " + cube(i));
		 
		
		 
	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    //String s;
   // while ((s = in.readLine()) != null && s.length() != 0)
    //  System.out.println(s);
    // An empty line or Ctrl-Z terminates the program

		

		    System.out.println("after buffer overflow ");
		    //System.out.println("Important data  = "+importantData);
		 
		    long start = System.currentTimeMillis();
		    //counter.countPrimes(1000000);
		    long end = System.currentTimeMillis();

		    System.out.println("Took : " + ((end - start) / 1000));

		    
		    
	}
}

