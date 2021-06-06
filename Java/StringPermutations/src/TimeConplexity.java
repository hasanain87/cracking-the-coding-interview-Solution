
public class TimeConplexity {

	
	
	
	/*public static String StringConcat(char c, int n) { 
	 String answer = "";
	 for (int j=0; j < n; j++)
	 answer += c;
	 return answer;
	 }*/
	
	
	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub
		
		//System.out.println();
		//long start = System.currentTimeMillis();
		
		//StringConcat('*',500000);
		//System.out.println();
		//long end = System.currentTimeMillis();

		//System.out.println("Took : " + ((end - start) / 1000));
		
		
		int x=0;
		int j=100;
		
				while (j>=1) {
					for (int i=1; i <= j; i++){
						x= x+1;
						System.out.println(x+"-----");
					    
				
					}
					
					j=j/2;
				}
				//O( n lg n)

				
				
				
				for (int i=1; i <= j; i++){
				
					for (int k=1; k <= j; i++){
						
						x= x+1;
						System.out.println(x+"-----");
					    
						
					}
				}
		
	}
	
	

	

}



