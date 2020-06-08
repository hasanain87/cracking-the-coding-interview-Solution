import java.util.Scanner;

public class UpSideDownTraingle {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number ");
		
		int number =input.nextInt();
		
		System.out.println("the number is    "+number);
		int i;
		int j;
		
		for (i=1;i<=6;i++) // i to 6
		{
			
			for(int k=1;k<i;k++ ){
				
				System.out.print("  ");
			}
			
			for(j=i;j<=6;j++){//1 to 6
				
				
				
				
				System.out.print(i+" ");
			}
			
			System.out.println();
			
		}
		
		
		
		

	}

}
