package EasyProblemsToGetStarted;
import java.util.*;
import java.lang.*;
import java.io.*;
public class TriangleEverywhere {
    public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
         //Length of Array
        String s= br.readLine(); //Input the number seperated by space
        int[] arr= new int[3];
        String[] s1 = s.split(" ");
        for(int i=0;i<3;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c  ){
                System.out.println("1");
            }
            else if(a==b || b==c || c==a){
                System.out.println("2");
            }
            else{
                System.out.println("3");
            }
        }
        else{
            System.out.println("-1");
        }
		// your code goes here
	}
}
