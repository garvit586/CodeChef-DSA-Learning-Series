package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverseStarPattern {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i =1; i<=N ;i++ ){
		    for (int j =i;j<N ;j++ ){
		        System.out.print(" ");
		    }
		    for(int j = 1; j <= i; j++){
                System.out.print("*");;
            }
            System.out.println();
		} 
		// your code goes here
	}
}
