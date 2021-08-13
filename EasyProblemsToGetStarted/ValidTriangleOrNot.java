package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ValidTriangleOrNot {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i=0; i<3 ;i++ ){
		    arr[i] = s.nextInt();
		}
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		
		if((a+b)>c && (a+c)>b && (b+c)>a ){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		// your code goes here
	}
}
