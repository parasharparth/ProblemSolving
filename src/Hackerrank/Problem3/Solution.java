package Hackerrank.Problem3;

public class Solution {

	public static void main(String[] args) {
		int[] arr = new int[]{1,4,3,2};
		int result = sum(arr);
		System.out.println("Sum of elements: "+result);
	}

	public static int sum(int[] arr){
		int result = 0;
		for(int i=0; i<arr.length; i++)
			result = result + arr[i];
		return result;
	}
}
