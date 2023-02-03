package Hackerrank.Problem2;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args){

		List<Integer> arr = new ArrayList<>();
		arr.add(8);
		arr.add(4);
		arr.add(2);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(1);
		arr.add(3);
		arr.add(9);

		List<Integer> result = countingSort(arr);
		for(int i=0; i<result.size(); i++){
			System.out.print(result.get(i)+" ");
		}
		System.out.println();
	}

	public static List<Integer> countingSort(List<Integer> input){
		int[] arr = input.stream().mapToInt(i -> (i == null ? 0 : i)).toArray();
		int[] count = new int[findMax(arr)+1];
		for(int i:arr){
			count[arr[i]]++;
		}
		for(int i=1; i<arr.length; i++){
			count[i] += count[i-1];
		}
		int[] output = new int[arr.length];
		for(int i:arr){
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		arr = output.clone();
		for(int i:input){
			input.remove(i);
		}
		for(int i:arr){
			input.add(i);
		}
		return input;
	}

	public static int findMax(int[] arr){
		int max = arr[0];
		for(int i:arr){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
}
