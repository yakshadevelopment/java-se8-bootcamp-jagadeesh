package test.handson;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import handson.Fibonacci;

public class TestFibonacci {
	
	
	@Test
	public void testFibonacci() {
		
		assertEquals(7,Fibonacci.getFibonacciSum(5));
		assertEquals(20 ,Fibonacci.getFibonacciSum(7));
		
		
	}
	

}
