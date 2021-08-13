package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class RangeOdd {
    public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = new int[2];
		Scanner s = new Scanner(System.in);
		for (int i =0 ; i<2 ;i++ ){
		    arr[i] = s.nextInt();
		} 
		int L= arr[0];
		int R = arr[1];
		for (int i = L;i <=R  ;i++ ){
		    if (i % 2 != 0){
		        System.out.print(i + " ");
		    }
		} 
		// your code goes here
	}
}
