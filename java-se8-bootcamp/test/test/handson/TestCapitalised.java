package test.handson;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import handson.Capitalize;
import handson.ConvertToWords;
import handson.DuplicateWord;


public class TestCapitalised {
	
	
	
	@Test
	public void testDuplicateWordRemoval() {
		
		assertEquals("World Is Beautiful" ,Capitalize.printCapitalized("world is beautiful"));
		
		assertEquals("King Rama Is King" ,Capitalize.printCapitalized("king rama is king"));
		
		
		
	}
	
	
	
	

}
