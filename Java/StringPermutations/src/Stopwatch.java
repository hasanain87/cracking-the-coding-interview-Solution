

public class Stopwatch {
	// start keeps track of the time the stopwatch was created
    private long start;

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
    // constructors initialize instance variables
    public Stopwatch() {
        start = System.currentTimeMillis();
    } 

    // return time (in seconds) since this object was created
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    } 
    
 
 

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	Stopwatch sw = new Stopwatch();
    	int a[] ={  30 ,-40,-20,-10,40,0,10,5, 30 -40, -20,-10,40,0,10,5,  30 ,-40, -20,-10,40,0,10,5,  30 ,-40, -20,-10,40,0,10,5,   30 ,-40,-20,-10,40,0,10,5, 30 -40, -20,-10,40,0,10,5,  30 ,-40, -20,-10,40,0,10,5,  30 ,-40, -20,-10,40,0,10,5};
    	 int k=count(a);
    	double x = sw.elapsedTime();
    	System.out.println("Time: " + x );
    	System.out.println(k);

}

}