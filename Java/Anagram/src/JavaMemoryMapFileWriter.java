import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.*;
public class JavaMemoryMapFileWriter 
{
	static void writeToFile()
	{
		 try 
		 {
		   File file = new File("test.txt");
			 
		   FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
			 
		   long bufferSize=8*1024;
		   //A direct byte buffer may also be created by mapping a region of a file directly into memory.
		   //Memory mapped byte buffers are created via the FileChannel.map() method
		   //you must specify the starting point and the length of the region that you want to map in the file
		   //// Get direct byte buffer access using channel.map() operation
		   MappedByteBuffer memMappedBuffer =fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, bufferSize);
		   
		   CharBuffer charBuffer = memMappedBuffer.asCharBuffer();
		   for (int i = 0; i < 3; i++)
		   {
			   //// Get direct byte buffer access using channel.map() operation
		     charBuffer.put(i + "  Hello World \n");
		   }
			 System.out.println("Well done...") ;  
		  }
		  catch (Exception e)
		  { }
	}
	public static void main(String[] args) 
	{
		  writeToFile();
	}	 
}
