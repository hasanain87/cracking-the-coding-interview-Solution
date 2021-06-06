
public class TimeComplexity {
	public static  String repeat1(char c, int n) { 
		String answer = "";
	for (int j=0; j < n; j++)
	answer += c;
	return answer;
	 }
	public static int count(int[] a)
	 {
	int N = a.length;
	 int count = 0;
	 for (int i = 0; i < N; i++)
	 for (int j = i+1; j < N; j++)
	 for (int k = j+1; k < N; k++)
	 if (a[i] + a[j] + a[k] == 0)
	 count++;
	 return count;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      Stopwatch sw = new Stopwatch();	
     
	   System.out.println(repeat1('*',400000));
	   double x = sw.elapsedTime();
   	  System.out.println("Time: " + x);
		
	}

}
