
public class EditRepale {

	/**
	 * @param args
	 */
	
	static boolean oneEditAway(String first,String second){
		int x=Math.abs(first.length()-second.length());
		if(x>1){
			
			return false;
		}
		
		String s1=first.length()<second.length()?first:second;
		String s2=first.length()<second.length()?second:first;
		
		
		int index1=0; int index2=0;
		boolean foundDifferene=false;
		
		while(index2<s2.length()&& index1<s1.length()){
			
			if (s1.charAt(index1)!=s2.charAt(index2)){
				if (foundDifferene)  return false;
				foundDifferene=true;
				if(s1.length()==s2.length()){
					index1++;
				}
				}else{
					
					index1++;
				}
				index2++;
			}
			
		
		
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print(oneEditAway("pales","pale"));
	}

}
