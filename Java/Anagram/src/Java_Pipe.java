import java.io.*;

public class Java_Pipe 
{
	 public static void main(String[] args) throws Exception 
	    {
	        final PipedOutputStream output = new PipedOutputStream();
	        final PipedInputStream  input  = new PipedInputStream(output);

	        Thread thread1 = new Thread(new Runnable() 
	        {
	            public void run() 
	            {
	                try 
	                {
	                    output.write("Hello world, pipe! \n".getBytes());
	                } 
	                catch (IOException e) { }
	            }
	        });
	        Thread thread2 = new Thread(new Runnable() 
	        {
	            public void run() 
	            {
	                try 
	                {
	                    int data = input.read();
	                    while(data != -1)
	                    {
	                        System.out.print((char) data);
	                        data = input.read();
	                    }
	                } 
	                catch (IOException e) {
	                }
	            }
	        });
	        thread1.start();
	        thread2.start();
	    }
}
    	

    	
    	
    	
    	
    	

    
    

