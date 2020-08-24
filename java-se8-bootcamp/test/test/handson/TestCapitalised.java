package test.handson;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import handson.Capitalize;



public class TestCapitalised {
	
	
	
	@Test
	public void testDuplicateWordRemoval() {
		
		Assertions.assertEquals("World Is Beautiful" ,Capitalize.printCapitalized("world is beautiful"));
		
		Assertions.assertEquals("King Rama Is King" ,Capitalize.printCapitalized("king rama is king"));
		
		
		
	}
	
	
	
	

}
