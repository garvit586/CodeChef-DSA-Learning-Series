package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FindMe {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int[] arr = new int[2];
		int flag = 0;
		for (int i=0; i<2 ;i++ ){
		    arr[i] = s.nextInt();
		}
		int N = arr[0];
		int K = arr[1];
		int[] arrr = new int[N];
		for (int i=0; i<N ;i++ ){
		    arrr[i] = s.nextInt();
		}
		for (int i=0; i<N ;i++ ){
		    if (arrr[i] == K){
		        flag = 1;
		        break;
		    } 
		}
		if (flag == 1){
		    System.out.println("1");
		}
		else{
		    System.out.println("-1");		}
		// your code goes here
	}
}
