package test.handson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import handson.Fibonacci;

public class TestFibonacci {
	
	
	@Test
	public void testFibonacci() {
		
		assertEquals(7,Fibonacci.getFibonacciSum(5));
		assertEquals(20 ,Fibonacci.getFibonacciSum(7));
		
		
	}
	

}
