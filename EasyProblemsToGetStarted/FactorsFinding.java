package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FactorsFinding {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner s = new Scanner(System.in);
	    int N = s.nextInt();
	    int count = 0;
	    for (int i=1 ; i<=N ; i++) {
	        if (N % i == 0){
	            count++;
	        }
	    }
	    System.out.println(count);
	    for (int i=1 ; i<=N ; i++) {
	        if (N % i == 0){
	            System.out.println(i);
	        }
	    }
	}
}
