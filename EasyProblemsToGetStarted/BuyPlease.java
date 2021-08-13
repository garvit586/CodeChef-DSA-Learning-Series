package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class BuyPlease {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();
		
		y = a*x + b*y;
		System.out.println(y);
	}
}
