package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverseMe {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i=0; i<N ;i++ ){
		    arr[i] = s.nextInt();
		}
		for(int j = N-1; j>=0;j--){
		    System.out.print(arr[j] + " ");
		} 
		// your code goes here
	}
}
