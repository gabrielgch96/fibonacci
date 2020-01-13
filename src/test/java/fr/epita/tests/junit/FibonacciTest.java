package fr.epita.tests.junit;

import org.junit.Test;

import fr.epita.fibonacci.services.Fibonacci;
import junit.framework.Assert;

public class FibonacciTest {
	
	@Test
	public void testFibonacciNth() {
		Fibonacci fib = new Fibonacci();
		int answer = fib.calculateFibonacci(5);
		Assert.assertEquals(5, answer);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFibonacciNthNegative() {
		Fibonacci fib = new Fibonacci();
		int answer = fib.calculateFibonacci(-1);
	}

}
