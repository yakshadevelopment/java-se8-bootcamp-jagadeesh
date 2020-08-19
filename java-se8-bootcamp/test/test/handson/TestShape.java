package test.handson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import handson.Fibonacci;
import handson.Rectangle;
import handson.Square;
import handson.Triangle;

public class TestShape {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testFibonacci() {
		
		assertEquals(25,new Square(5).getArea(),0);
		assertEquals(30 ,new Rectangle(6,5).getArea(),0);
		assertEquals(40.0, new Triangle(10,8).getArea(),0);
		assertEquals(952.0, new Triangle(56,34).getArea(),0);
		assertEquals(170.0, new Triangle(10,34).getArea(),0);
		
	}
	
	
	

}
