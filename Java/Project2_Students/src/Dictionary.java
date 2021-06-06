import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Dictionary {


		
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			String line = "";
			HashMap<String, String> map = new HashMap<String, String>();
			

			  BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("tex.txt"), "ISO8859-1"));
			    
			  if(in != null){
			        while ((line = in.readLine()) != null) {
			            if ((line.length()>0)&&(line.charAt(0) != '#')){
			                String[] tokens = line.split("\\s+", 2);
			                map.put(tokens[0], tokens[1]);
			            }
			        }

			        Iterator iterator = map.keySet().iterator();  

			        while (iterator.hasNext()) {  
			           String key = iterator.next().toString();  
			           String value = map.get(key).toString();  

			           System.out.println("KEY: " +key + " VALUE:" + value);  
			        }
			    }
				  
				  
				  
				  
			  }
			  
			
			
			
			
			
			
			
			
			
			
		}
		


