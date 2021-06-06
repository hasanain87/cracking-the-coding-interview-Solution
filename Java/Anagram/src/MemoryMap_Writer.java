
import java.io.File;
import java.io.*;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MemoryMap_Writer 
{
	public static void main(String[] args) throws  Exception 
	{
	  File mappedFile = new File("tset1.txt");
	  mappedFile.delete();

	  RandomAccessFile randomAccessFile = new RandomAccessFile(mappedFile, "rw");
	  FileChannel fileChannel = randomAccessFile.getChannel();
	 
	  int bufferSize = 800;
	  MappedByteBuffer mappedMemory =fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, bufferSize);
      
	  String myString = new String("This is the content goes to the mapped file.....");   
                                        mappedMemory.put(myString.getBytes()); 
	}
}

