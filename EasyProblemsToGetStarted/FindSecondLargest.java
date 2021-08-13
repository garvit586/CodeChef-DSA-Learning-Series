package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FindSecondLargest {
    public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = new int[3];
		Scanner s = new Scanner(System.in);
		for (int i=0; i <3 ;i++ ){
		    arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);// your code goes here
	}
}
