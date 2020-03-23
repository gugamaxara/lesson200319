package homework200323;

import java.util.Random;
import java.util.Timer;

public class Radix {
	
	static int getMaxNumber(int[] arr) {
		int max_num = arr[0];
		int arr_length = arr.length;
		for(int i = 0; i < arr_length; i ++) {
			if(arr[i] > max_num) {
				max_num = arr[i];
			}
		}
		return max_num;
	}
	
	static void countSort(int[] arr, int d) {
		int arr_length = arr.length;
		int[] final_arr = new int[arr_length];
		int[] count_arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			count_arr[i] = 0;
		}
		
		for(int i = 0; i < arr_length; i ++) {
			count_arr[(arr[i]/d)%10]++;
		}
		
		for(int i = 1; i < 10; i++) {
			count_arr[i] += count_arr[i-1];
		}
		
		for(int i = arr_length - 1; i >= 0; i--) {
			final_arr[count_arr[(arr[i]/d)%10] - 1] = arr[i];
			count_arr[(arr[i]/d)%10]--;
		}
		for(int i = 0; i < arr_length; i++) {
			arr[i] = final_arr[i];
		}
	}
	
	static void radixSort(int[] arr) {
		int max_numb = getMaxNumber(arr);
		
		for(int d = 1; max_numb/d > 0; d*=10) {
			countSort(arr,d);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[1000000];
		int arr_length = arr.length;
		Random r = new Random();
		for(int i = 0; i < arr_length; i++) {
			arr[i] = r.nextInt(100000);
		}
		long start = System.currentTimeMillis();
		radixSort(arr);
		long stop = System.currentTimeMillis();
		System.out.println("Radix time : " +  (stop-start));
	}
}
