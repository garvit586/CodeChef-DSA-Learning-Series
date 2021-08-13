package ComplexityAnalysisBasicsWarmUp;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Lapindromes {
    public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T != 0){
		    String S = br.readLine();
		    int l = S.length();
		    String S1,S2;
		    if(l%2 == 0){
		        S1 = S.substring(0, (S.length ()/2));
		        S2 = S.substring((S.length ()/2));
		    }
		    else{
		        S1 = S.substring(0, (S.length ()/2));
		        S2 = S.substring((S.length ()/2)+1);
		    }
		    char[] A1 = S1.toCharArray();
		    char[] A2 = S2.toCharArray();
		    Arrays.sort(A1);
		    Arrays.sort(A2);
		  
		    S1 = new String(A1);
		    S2 = new String(A2);
		    if(S1.equals(S2)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		  //  System.out.println(S1);
		  //  System.out.println(S2);
		    
		    
		    
		    
		    T--;
		}
		// your code goes here
	}
}
