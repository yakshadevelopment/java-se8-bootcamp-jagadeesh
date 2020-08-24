package test.handson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import handson.DuplicateWord;


public class TestDuplicateWord {
	
	
	
	@Test
	public void testDuplicateWordRemoval() {
		
		assertEquals("world is beautiful" ,DuplicateWord.removeDuplicates("world is beautiful is"));
		
		assertEquals("king rama is" ,DuplicateWord.removeDuplicates("king rama is king"));
		
		
		
	}
	
	
	
	

}
