import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MemoryMap_Reader 
{
    public static void main(String[] args) throws Exception 
    {
	File mappedFile = new File("test.txt");
		  

	RandomAccessFile randomAccessFile = new RandomAccessFile(mappedFile, "r");
	FileChannel fileChannel = randomAccessFile.getChannel();
		 
	int bufferSize = 800;
	MappedByteBuffer mappedMemory =fileChannel.map(FileChannel.MapMode.READ_ONLY, 
                                       0, bufferSize);
	
	//Tells whether or not this buffer's content is resident in physical memory.
    System.out.println(mappedMemory.isLoaded());
	System.out.println(mappedMemory.capacity());
	byte[] bytes = new byte[50];
	mappedMemory.get(bytes);
	String myString = new String(bytes);
	System.out.println(myString);
    }
}