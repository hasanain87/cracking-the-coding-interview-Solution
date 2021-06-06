

public class findNumber {

	
	 static String FindNumber(int []a,int key, int low, int high){
		
		

				    int middle = (low + high) / 2;
				         
				    if (high < low) {
				        return "No";
				    }
				 
				    if (key == a[middle]) {
				        return "yes";
				        
				    } else if (key < a[middle]) {
				        return FindNumber(
				          a, key, low, middle - 1);
				    } else {
				        return FindNumber(a, key, middle + 1, high);
				    }
				}
		
		
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[]={5,2,3,4,1};
		System.out.print(FindNumber(new int[]{5,2,3,4,1} ,5,0, 4));
//	    print(ANS);
		
//		 Arrays.binarySearch(a,5);
		

	}






	
}
