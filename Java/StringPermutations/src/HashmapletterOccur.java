import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class HashmapletterOccur {
	static void characterCount(String str)
    {
	//Creating a HashMap containing char as a key and occurrences as  a value
	HashMap <Character,Integer>  hm=  new HashMap <Character,Integer>(); 
	
	//Converting given string to char array
	char [] chararr= str.toCharArray();
	
	//checking each char of strArray
	for(char c:chararr){
		
	if(hm.containsKey(c)){
		hm.put(c,hm.get(c)+1);
		
	}
	else
	  {
	 //If char is present in charCountMap, incrementing it's count by 1
	hm.put(c,1);
		
	   }
	
    }
	
	//Printing the charCountMap
	 
    System.out.println(hm);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner wordFile;
		String singleWord; 
		
		try
      	{

		 wordFile = new Scanner(new File("studentssorted.txt"));
      	}
      	catch (FileNotFoundException e)
      	{
			System.out.println(e);
			return;	
      	}
      
      	while (wordFile.hasNext())
      	{
      		// make the word to be lower case
      		singleWord = wordFile.next().toLowerCase();
      		characterCount(singleWord);
      		// get the current count (value) of the word (key), 
      		// increase count, then update the key/value pair:
      		//num = getCount(singleWord, map) + 1;
      		//map.put(singleWord, num);
      	}

		
		
	}
    }
