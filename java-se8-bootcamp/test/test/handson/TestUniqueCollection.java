package test.handson;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import handson.UniqueCollection;
import junit.framework.Assert;

public class TestUniqueCollection {
	
	@Test
	public void testOrderElements() {
		
		assertArrayEquals(new String[]{"AAA","ABC","abc"},UniqueCollection.orderElements(new String[] {"abc","ABC","AAA","AAA"}));
		assertArrayEquals(new String[] {"A","AAA","Abc","BBB","aaa","b"},
				UniqueCollection.orderElements(new String[] {"AAA","BBB","aaa","AAA","Abc","A","b"}));
		
	
	
	}
	
	
	
	
	
	
	
}	