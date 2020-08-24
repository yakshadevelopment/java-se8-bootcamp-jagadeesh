package test.handson;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import handson.DateValidator;


public class TestDateValidator {
	
	@Test
	public void testValidateDates() {
	
		Assertions.assertEquals(true ,DateValidator.validateParseDate("11.04.1978"));
		Assertions.assertEquals(false,DateValidator.validateParseDate("22.4.1978"));
		Assertions.assertEquals(true ,DateValidator.validateParseDate("11-04-1978"));
		Assertions.assertEquals(false,DateValidator.validateParseDate("22/4/1978"));
		Assertions.assertEquals(false ,DateValidator.validateParseDate("15.04.1978"));
		Assertions.assertEquals(true,DateValidator.validateParseDate("12.24.2020"));
	
	
	
		Assertions.assertEquals(41 ,DateValidator.calculateAge("11.04.1978"));
		Assertions.assertEquals(41,DateValidator.calculateAge("12.04.1978"));
		Assertions.assertEquals(41 ,DateValidator.calculateAge("11-04-1978"));
		Assertions.assertEquals(41,DateValidator.calculateAge("12/04/1978"));
		Assertions.assertEquals(42 ,DateValidator.calculateAge("07.04.1978"));
		Assertions.assertEquals(0,DateValidator.calculateAge("01.01.2020"));
	
	}
	

}
