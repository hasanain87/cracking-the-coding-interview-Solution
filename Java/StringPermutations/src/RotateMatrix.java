
public class RotateMatrix {
static 	boolean Rotate(int [][] matrix){
		int n = matrix.length;
	for (int layer = 0; layer < n/2;layer++ ) {
		
		int first=layer;
		int last=n-1-layer;
		for (int i = first; i < last;i++) {
		  int offset=i-first;
		  
		  int top = matrix[first][i];  //save Top
		  //left --> top
          matrix [first][i] = matrix[last - offset ][first];
          // bottom--> left
          matrix[last - offset ][first] = matrix[last][last-offset];
          //right --> bottom
          matrix[last][last-offset] = matrix[i][last];
          // top ---> right
          matrix[i][last] = top;
			
		}
	}
 return true;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = { {1, 2, 3, 4},
	                    {5, 6, 7, 8},
	                    {9,10,11, 12},
	                    {13, 14,15,16},
	           
	         };
	
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr [i][j]+ "   ");
				
			}
			System.out.println("   ");
		}
		
		System.out.println("   ");
		
		boolean x= Rotate ( arr);
		
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			System.out.print(arr [i][j]+ "   ");
			
		}
		System.out.println("   ");
	}
	
	
	}
}
