package lesson200319;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class FibTest extends TestCase{
	

	@Test
	public void test1() {
		assertEquals(1, Fibonacci.fib(1));
	}

	@Test
	public void test2() {
		assertEquals(2, Fibonacci.fib(2));
	}
	
	@Test
	public void test3() {
		assertEquals(3, Fibonacci.fib(3));
	}
	
	@Test
	public void test4() {
		assertEquals(5, Fibonacci.fib(4));
	}
	
	@Test
	public void test5() {
		assertEquals(8, Fibonacci.fib(5));
	}
	
	@Test
	public void test6() {
		assertEquals(13, Fibonacci.fib(6));
	}
	
	@Test
	public void test6() {
		assertEquals(21, Fibonacci.fib(7));
	}
}
