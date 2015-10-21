/*
A series is defined in the following manner:

Given the nth and (n+1)th terms, the (n+2)th can be computed by the following relation 
Tn+2 = (Tn+1)2 + Tn

So, if the first two terms of the series are 0 and 1: 
the third term = 12 + 0 = 1 
fourth term = 12 + 1 = 2 
fifth term = 22 + 1 = 5 
... And so on.

Given three integers A, B and N, such that the first two terms of the series (1st and 2nd terms) are A and B respectively, compute the Nth term of the series.

Input Format

You are given three space separated integers A, B and N on one line.

Input Constraints 
0 <= A,B <= 2 
3 <= N <= 20

Output Format

One integer. 
This integer is the Nth term of the given series when the first two terms are A and B respectively.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SFibonacciModified {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String input;
				input=br.readLine();
				String[] inputArray = input.split("\\s+");
				BigInteger A = BigInteger.valueOf(Long.parseLong(inputArray[0]));
				BigInteger B = BigInteger.valueOf(Long.parseLong(inputArray[1]));
				int N = Integer.parseInt(inputArray[2]);
				BigInteger ans = null;
                if(N==1)
                    System.out.println(A);
                else if(N==2)
                    System.out.println(B);
				else
                {    
                    for(int i=3; i<=N; i++)
                    {
                            ans = B.multiply(B);
					        ans = ans.add(A);
                            A = B;
                            B = ans;
                    }
				    System.out.println(ans);
                }
			}catch(IOException io)
			{
				io.printStackTrace();
			}	
    }
}
