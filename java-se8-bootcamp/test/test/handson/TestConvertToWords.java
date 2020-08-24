package test.handson;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import handson.ConvertToWords;


public class TestConvertToWords {
	
	
	@Test
	public void testConvertToWords() {
		
		Assertions.assertEquals("nine thousand nine hundred ninety nine" ,ConvertToWords.convertToWords(9999));
		
		Assertions.assertEquals("fifty six" ,ConvertToWords.convertToWords(56));
		Assertions.assertEquals("five hundred fifty nine" ,ConvertToWords.convertToWords(559));
		
		Assertions.assertEquals("seven hundred seventy eight" ,ConvertToWords.convertToWords(778));
		Assertions.assertEquals("three hundred thirty three" ,ConvertToWords.convertToWords(333));
		Assertions.assertEquals("one hundred seventeen" ,ConvertToWords.convertToWords(117));
	}
	
	
	

}
