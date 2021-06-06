
public class StringCompress {

	static String compress(String str){
		int countConsecitive =0;
		
		int finalLength=countCompression(str);
		//if(finalLength >= str.length()) return str;
		StringBuilder sb= new StringBuilder(finalLength);
		
		for(int i=0;i<str.length();i++){
			countConsecitive++;
		if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)){
			sb.append(str.charAt(i));
			sb.append(countConsecitive);
			countConsecitive=0;
			
		}
		}
		return sb.toString();
		
		
		
	}
	
static int countCompression(String str) {
		// TODO Auto-generated method stub
		
		int countConsecitive =0;
		int compressedLength =0;
		for(int i=0;i<str.length();i++){
			countConsecitive++;
			// last iteration always will be false coz  IndexOutOfBoundsException index will be not found in the array
			if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)){
				//i+1>=str.length()||   this will solve the exception
				String a=String.valueOf(countConsecitive);
				int x=a.length();
				
				compressedLength +=1+x;
				countConsecitive=0;	
     	}	
		}
		return  compressedLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(compress("aaabbb"));

	}

}
