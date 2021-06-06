import java.util.Arrays;

public class Anagram {

	public static void isAnagram (String s1,String s2){
		
      String copyOfS1=s1.replaceAll("\\s",""); 
      String copyOfS2=s2.replaceAll("\\s","");
      
      boolean status = true;
      
      if (copyOfS1.length()!=copyOfS2.length()){
    	  
    	  status=false;
      }
		
      else{
    	  
    	  char[] Arrays1=copyOfS1.toLowerCase().toCharArray();
    	  char[] Arrays2=copyOfS2.toLowerCase().toCharArray();
    	  
    	  Arrays.sort(Arrays1);
    	  Arrays.sort(Arrays2); 
    	 status= Arrays.equals(Arrays1, Arrays2);
    	  //status=Arrays1.equals(Arrays2);	  
      }
		
		
      if(status)
      {
          System.out.println(s1+" and "+s2+" are anagrams");
      }
      else
      {
          System.out.println(s1+" and "+s2+" are not anagrams");
      }
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isAnagram("Mother In Law", "Hitler Woman");
		 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
        isAnagram("ha sa na in", "HA SANAI");
        
 
		 

	}

}
