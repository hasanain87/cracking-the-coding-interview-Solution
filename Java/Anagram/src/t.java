import java.io.*;
	import java.util.*;

	class SystemCommandExecutor
	{
	  private List<String> commandInformation;
	  private String adminPassword;
	  private ThreadedStreamHandler inputStreamHandler;
	  private ThreadedStreamHandler errorStreamHandler;
	  
	  public SystemCommandExecutor(final List<String> commandInformation)
	  {
	    if (commandInformation == null) throw 
	            new NullPointerException("The commandInformation is required.");
	    this.commandInformation = commandInformation;
	    this.adminPassword = null;
	  }
	  public int executeCommand() throws Exception
	  {
	      ProcessBuilder pb = new ProcessBuilder(commandInformation);
	      Process process = pb.start();

	      OutputStream stdOutput = process.getOutputStream();
	      InputStream inputStream = process.getInputStream();
	      InputStream errorStream = process.getErrorStream();

	      inputStreamHandler = new ThreadedStreamHandler(inputStream, stdOutput);
	      errorStreamHandler = new ThreadedStreamHandler(errorStream);

	      inputStreamHandler.start();
	      errorStreamHandler.start();

	      int exitVal = process.waitFor();
	 
	      inputStreamHandler.interrupt();
	      errorStreamHandler.interrupt();
	      inputStreamHandler.join();
	      errorStreamHandler.join();
	      return exitVal;
	  }
	  public StringBuilder getStandardOutputFromCommand()
	  {
	    return inputStreamHandler.getOutputBuffer();
	  }
	  public StringBuilder getStandardErrorFromCommand()
	  {
	    return errorStreamHandler.getOutputBuffer();
	  }
	}

	class ThreadedStreamHandler extends Thread
	{
	  InputStream inputStream;
	  String adminPassword;
	  OutputStream outputStream;
	  PrintWriter printWriter;
	  StringBuilder outputBuffer = new StringBuilder();
	  
	  ThreadedStreamHandler(InputStream inputStream)
	  {
	    this.inputStream = inputStream;
	  }

	  ThreadedStreamHandler(InputStream inputStream, OutputStream outputStream)
	  {
	    this.inputStream = inputStream;
	    this.outputStream = outputStream;
	    this.printWriter = new PrintWriter(outputStream);
	  }
	  
	  public void run()
	  {
	    BufferedReader bufferedReader = null;
	    try
	    {
	      bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	      String line = null;
	      while ((line = bufferedReader.readLine()) != null)
	      {
	        outputBuffer.append(line + "\n");
	      }
	    }
	    catch (Exception ioe)
	    { }
	  }
	  public StringBuilder getOutputBuffer()
	  {
	    return outputBuffer;
	  }
	}

	public class t
	{
	  public static void main(String[] args) throws Exception
	  {
	    List<String> commands = new ArrayList<String>();
	    commands.add("/bin/bash");
	    commands.add("-c");
	    commands.add("ls | head -3 | tail -1");
	 
	    SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
	    int result = commandExecutor.executeCommand();

	    StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
	    StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();

	    System.out.println("The Value of Execution was: " + result);
	    System.out.println("STDOUT:");
	    System.out.println(stdout);
	    System.out.println("STDERR:");
	    System.out.println(stderr);
	  }
	}

	
	
	
	
	
	
	
	


