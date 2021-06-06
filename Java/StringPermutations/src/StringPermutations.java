
public class StringPermutations {

	static public void StringPermutation(String str)
    {
        StringPermutation(str, "");
    }
     
    private static void StringPermutation(String str, String prefix)
    {    
        if(str.length() == 0)
        {
            System.out.println(prefix);
        }
        else
        {
            for (int i = 0; i < str.length(); i++)
            {    
            	String a=str.substring(0, i);		
            	String e= str.substring(i+1);
            	String rem= a+e;
            			
                StringPermutation(rem,prefix+ str.substring(i));
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringPermutation("12345");
	}

}
