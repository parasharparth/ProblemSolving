package Hackerrank.Problem4;

public class Solution {
	public static void main(String[] args){
		int[] a = new int[]{1,2,3};
		int[] b = new int[]{3,2,1};
		int alice_points = 0;
		int bob_points = 0;
		for(int i=0; i<=2; i++){
			if(a[i] > b[i]){
				alice_points = alice_points + 1;
			}
			else if(a[i] < b[i]){
				bob_points = bob_points + 1;
			}
			else {
				//no point
			}
		}
		System.out.println(alice_points);
		System.out.println(bob_points);
	}
}
