package test.handson;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import handson.ConvertToWords;
import handson.DuplicateWord;


public class TestDuplicateWord {
	
	
	
	@Test
	public void testDuplicateWordRemoval() {
		
		assertEquals("world is beautiful" ,DuplicateWord.removeDuplicates("world is beautiful is"));
		
		assertEquals("king rama is" ,DuplicateWord.removeDuplicates("king rama is king"));
		
		
		
	}
	
	
	
	

}
