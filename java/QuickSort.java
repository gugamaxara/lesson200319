package homework200323;

import java.util.Random;

public class QuickSort {
	
	static int partition(int[] arr,int l,int h) {
		
		int pivot = arr[h];
		int i = (l-1);
		for(int j = l; j < h; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		return i+1;
	}
	
	static void sort(int[] arr, int l, int h) {
		if(l < h) {
			int p = partition(arr,l,h);
			sort(arr,l,p-1);
			sort(arr,p+1,h);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[1000000];
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000000);
		}
		long start = System.currentTimeMillis();
		sort(arr,0,arr.length-1);
		long stop = System.currentTimeMillis();
		System.out.println("Quicksort Time: " + (stop-start));
	}
}
