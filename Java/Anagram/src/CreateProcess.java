import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CreateProcess 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
   	 
		
		 String[] proCommands = {"cmd", "/c", "dir"};
		    ProcessBuilder processBuilder = new ProcessBuilder(proCommands);
		    processBuilder.directory(new File("c:\\temp"));
		    Process myProcess = processBuilder.start();

		     BufferedReader readOutputCMD = new BufferedReader(new InputStreamReader(
		                                         myProcess.getInputStream()));
		     String outputLine;
		     System.out.println("Output of " + Arrays.toString(proCommands));
		     while ((outputLine = readOutputCMD.readLine()) != null) 
		     {
		         System.out.println(outputLine);
		     }    

		     int processExitValue = myProcess.waitFor();
		     System.out.println("Process Exit Value is: " + processExitValue);
		    }
		
	
	}

