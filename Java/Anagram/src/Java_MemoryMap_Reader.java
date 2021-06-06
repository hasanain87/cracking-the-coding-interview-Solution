import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Java_MemoryMap_Reader 
{
	
	
	public static void main(String args[])
    {
        String tmpString = null;
        try
        {
            Process cmdProcess = Runtime.getRuntime().exec("ps -ax");
            
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(cmdProcess.getInputStream()));
            
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(cmdProcess.getErrorStream()));

            System.out.println("Output of the UNIX Command:\n");
            while ((tmpString = stdInput.readLine()) != null)
            {
                System.out.println(tmpString);
            }

            System.out.println("Error of the UNIX command (if any):\n");
            while ((tmpString = stdError.readLine()) != null) {
                System.out.println(tmpString);
            }
            System.exit(0);
        }
        catch (IOException e)
        {
            System.exit(-1);
        }
    }
	
	
	
	
	
	
	
}
