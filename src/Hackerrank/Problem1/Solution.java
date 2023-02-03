package Hackerrank.Problem1;

import java.util.Scanner;
public class Solution {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = solveMeFirst(a,b);
		System.out.println(sum);
	}

	public static int solveMeFirst(int a, int b)
	{
		return a+b;
	}
}
