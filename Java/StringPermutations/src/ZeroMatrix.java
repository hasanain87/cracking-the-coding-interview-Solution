
public  class ZeroMatrix {
	static int row =128;
	static int col=4;
	public  static void  SetZero(int [][] matrix){
		boolean rowhasZero=false;
		boolean  colhasZero=false;
		
		
		// check if the first Row has Zero
		for(int j=0;j<matrix[0].length;j++){
			if(matrix[0][j]==0){
	  		rowhasZero=true;
			break;
	        }	
	       }
		 //check if the first Colummn has Zero
		     for(int i=0;i<col;i++){
			         if(matrix[i][0]==0){
	  		            colhasZero=true;
			                break;
	                        }	
	                      }
		     
		     // Check Rest of the matrix
		     for(int i=1;i<matrix.length;i++){
		    	for(int j=1;j<matrix[0].length;j++) {
					if(matrix[i][j]==0){
						matrix[i][0]=0;	
						matrix[0][j]=0;		
			        }	
			       }
		     }
		    	
		     // Nullify row
		    	for(int j=1;j<matrix.length;j++){
					if(matrix[j][0]==0){
						nullifyRow(matrix,j);
				}
				}
		    	
			     // Nullify col
			    	for(int i1=1;i1<matrix[0].length;i1++){
						if(matrix[0][i1]==0){
							nullifyColumn(matrix,i1);
							
						}
					}
		    	
		    	
		     if(rowhasZero){
		    	
		    	 nullifyRow(matrix,0);
		    	 
		     }
		    	
             if(colhasZero){
		    	 nullifyColumn(matrix,0); 
		     }
             
		     }      
	
	
	
	
	
	private static void nullifyColumn(int[][] matrix, int Col) {
		// TODO Auto-generated method stub
		
    for(int j=0;j<matrix.length;j++){
			
			matrix[j] [Col]=0;
		}
		
	
	}

	private  static void nullifyRow(int[][] matrix, int row) {
		// TODO Auto-generated method stub
		for(int j=0;j<matrix[0].length;j++){
			
			matrix[row] [j]=0;
		}
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[][] = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,0, 12},
                        {13,14,15,16}
            };
		
		
		long start = System.currentTimeMillis();
		SetZero(arr);

		int x =arr.length;
		
		System.out.println(x);
		
		 // Print elements in row i
	   	 for (int i = 0 ; i < row; i++ )
	   	 {
	   	    // Print column j in row i
	   	    for (int  j = 0 ; j < col; j++ )
	   	    {
	   	       System.out.print(""+arr[i][j] + "   " );
	   	    }
	    
	   	    System.out.println();
	   	 }
	    
	   	long end = System.currentTimeMillis();

		System.out.println("Took : " + ((end - start) / 1000));
	   	 
	      }
		
	}


