
public class CheckEqualStr {
	
	static boolean permutation(String s,String t){
		
		if(s.length()!=t.length())
			return false;
		int [] letters =new int[128];
		
		char[] s_array=s.toCharArray();
		for(char c:s_array){
			letters[c]++;	
		}
       for (int i=0 ;i<t.length();i++){
			int c=t.charAt(i);
			int a=letters[c];
			System.out.println(a);
			letters[c]--;
			if(letters[c]<0){
			return false;
       }
			
       }
       return true;		
	}
	
	static boolean isuniqueChars(String str){
		String str1=str.replaceAll("\\s", "");
		if(str.length()>128) return false;
		int s=str.length();
		System.out.println(str1+"  "+s);
		
		boolean [] char_set =new boolean [128];
		for (int i=0 ;i<str1.length();i++){
			
			int val=str.charAt(i);
			if(char_set[val]){
				return false ;
			}
			else 
				char_set[val]=true;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p=permutation("helo","olhe");
		
		boolean x=isuniqueChars("helo HEL ");
		
				
				
				
				
		System.out.println(p);
		

	}

}
