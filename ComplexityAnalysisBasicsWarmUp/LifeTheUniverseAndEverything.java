package ComplexityAnalysisBasicsWarmUp;
import java.util.*;
import java.lang.*;
import java.io.*;
public class LifeTheUniverseAndEverything {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int temp;
		while(in.hasNextInt()){
		    temp = in.nextInt();
		    if(temp == 42){
		        return;
		    } else {
		        System.out.println(temp);
		    }
		}
	}
}
