package lesson200319;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	public static Map<Integer, Long> map = new HashMap<Integer, Long>();

	public static Long fib(int n) {
		if(n < 0){
			return (long) -1;
		}
		
		else if(n == 1) {
			return (long) 1;
		}
		else if(n==2) {
			return (long) 2;
		}
		if(map.containsKey(n)) {
			return map.get(n);
		}
		
		long result = fib(n-1) + fib(n-2);
		
		map.put(n, result);
		return result;
	}
	
	public static void main(String args[]) {
		for(int i = 1; i < 101; i++) {
			System.out.println(fib(i));
		}
	}
}
