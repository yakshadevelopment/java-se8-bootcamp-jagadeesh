package test.handson;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import handson.ConvertToWords;
import handson.DuplicateWord;


public class TestConvertToWords {
	
	
	@Test
	public void testConvertToWords() {
		
		assertEquals("nine thousand nine hundred ninety nine" ,ConvertToWords.convertToWords(9999));
		
		assertEquals("fifty six" ,ConvertToWords.convertToWords(56));
		assertEquals("five hundred fifty nine" ,ConvertToWords.convertToWords(559));
		
		assertEquals("seven hundred seventy eight" ,ConvertToWords.convertToWords(778));
		assertEquals("three hundred thirty three" ,ConvertToWords.convertToWords(333));
		assertEquals("one hundred seventeen" ,ConvertToWords.convertToWords(117));
	}
	
	
	

}
