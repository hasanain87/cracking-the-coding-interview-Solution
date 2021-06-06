import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.*;
public class  MemoryMapFileReader 
{
	static void readFromFile()
	{
		 try 
		 {
		   File file = new File("test.txt");
			 
		   FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
			 
		   long bufferSize=8*1024;
		   MappedByteBuffer memMappedBuffer =fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, bufferSize);
		   
		   CharBuffer charBuffer = memMappedBuffer.asCharBuffer();
		   while (charBuffer.hasRemaining())
		   {  
			   char c = charBuffer.get();
			   System.out.println(c) ;
		   }
		  }
		  catch (Exception e)
		  { }
	}
	public static void main(String[] args) 
	{
		  readFromFile();
	}	 
}
