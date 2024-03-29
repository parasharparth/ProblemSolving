package Hackerrank.Problem2;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args){

		List<Integer> arr = new ArrayList<>();
		arr.add(8);arr.add(4);arr.add(2);arr.add(5);arr.add(6);
		List<Integer> result;
		result = countingSort(arr);
		for(int i=0; i<result.size(); i++)
			System.out.print(result.get(i));
		System.out.println();
	}

	public static List<Integer> countingSort(List<Integer> list){
		int[] array = new int[list.size()];
		for(int i=0; i<list.size(); i++){
			array[i] = list.get(i);
		}
		int size = array.length;
		int[] output = new int[size + 1];

		// Find the largest element of the array
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}
		int[] count = new int[max + 1];

		// Initialize count array with all zeros.
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}

		// Store the count of each element
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}

		// Store the cummulative count of each array
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}

		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}

		for(int i=0; i<output.length-1; i++)
		{
			System.out.println(output[i]);
		}
		List<Integer> result = new ArrayList<>();
		for(int i=0; i<output.length-1; i++)
			result.add(output[i]);
		return result;
	}

	public static int findMax(int[] arr){
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
}
