/*
Your algorithms have become so good at predicting the market that you now know what the share price of Wooden Orange Toothpicks Inc. (WOT) will be for the next N days.

Each day, you can either buy one share of WOT, sell any number of shares of WOT that you own, or not make any transaction at all. What is the maximum profit you can obtain with an optimum trading strategy?

Input

The first line contains the number of test cases T. T test cases follow:

The first line of each test case contains a number N. The next line contains N integers, denoting the predicted price of WOT shares for the next N days.

Output

Output T lines, containing the maximum profit which can be obtained for the corresponding test case.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockMaximize {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		input=br.readLine();
		input= input.trim();
		int inputTestCases = Integer.parseInt(input);
		//int finalRes[] = new int[inputTestCases];
		for(int i=0; i<inputTestCases; i++)
		{
			input=br.readLine();
			input= input.trim();
			int N = Integer.parseInt(input);
			int[] inputs = new int[N];
			input=br.readLine();
			String[] in = input.split("\\s+");
			int[] maxi = maxArray(in, N);
			long sum=0;
			for(int j=0; j< N; j++)
			{
				sum+= maxi[j] - Integer.parseInt(in[j].trim());
			}
			
			System.out.println(sum);
		}
    }
    public static int[] maxArray(String[] s, int N)
	{
		int[] res = new int[N];
		//res[N-1] = Integer.parseInt(s[N-1].trim());
		int max = Integer.parseInt(s[N-1].trim());
		for(int i = N-1; i>=0; i--)
		{
			if( Integer.parseInt(s[i].trim()) > max )
				max = Integer.parseInt(s[i].trim());
			res[i]=max;
		}
		return res;
		
	}
}
