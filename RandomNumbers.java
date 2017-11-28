 /**
 * CS 301: Numerical Methods
 * Professor: A. Khakpour
 *
 * Computer Exercise: 10.1 Generate 1000 random numbers using the algorithm on pg 482
 * 									(Print every 50th)
 *
 * @author - Eric Schenck
 * last modified: November 28, 2017
 *   
 */
public class RandomNumbers {
	public static void main(String[] args){
		
		int n = 1000;
		
		int[] l = new int[n];
		
		float[] x = new float[n];
		
		for(int i = 0; i < 1000; ++i){
			x[i] = (float)1.0;
		
		}
		
		
		//choosing a seed value
		l[0] = 420;
		
		for(int i = 1; i < n ; ++i){
			l[i] = (int)((Math.pow(7, 5) * l[i-1]) % Integer.MAX_VALUE);	// (7^5)(seed) % (2^31)-1 
			x[i] = (float) l[i] / Integer.MAX_VALUE;
		}
		
		
		for(int i = 1; i < n ; ++i){
			
			if( (i % 50 ) == 0 ){
				System.out.println("i = " + i + ": x[i] = " + x[i]);
			}
		}
	}
}