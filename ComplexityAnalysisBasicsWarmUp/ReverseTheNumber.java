package ComplexityAnalysisBasicsWarmUp;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverseTheNumber {
    public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	    int[] arr = new int[N];
	    for (int i =0;i<N ;i++ ){
	        arr[i] = Integer.parseInt(br.readLine());
	        solution(arr[i]);
	    } 
		// your code goes here
	}
	public static void solution(int N){
	    int rev = 0;
		while(N>0){
		    int remainder = N % 10 ;
            rev = (rev * 10) + remainder;  
            N = N / 10;
		}
		System.out.println(rev);
	}
}
