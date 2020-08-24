package test.handson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import handson.UniqueCollection;


public class TestUniqueCollection {
	
	@Test
	public void testOrderElements() {
		
		assertArrayEquals(new String[]{"AAA","ABC","abc"},UniqueCollection.orderElements(new String[] {"abc","ABC","AAA","AAA"}));
		assertArrayEquals(new String[] {"A","AAA","Abc","BBB","aaa","b"},
				UniqueCollection.orderElements(new String[] {"AAA","BBB","aaa","AAA","Abc","A","b"}));
		
	
	
	}
	
	
	
	
	
	
	
}	