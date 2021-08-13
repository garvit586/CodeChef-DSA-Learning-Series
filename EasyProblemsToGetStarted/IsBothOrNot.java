package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class IsBothOrNot {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		if (N%5 == 0 && N%11 == 0){
		    System.out.println("BOTH");
		}
		else if (N%5 == 0 || N%11 == 0){
		    System.out.println("ONE");
		}
		else {
		    System.out.println("NONE");
		}
	}
}
