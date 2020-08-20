package test.handson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import handson.Capitalize;
import handson.DateValidator;

public class TestDateValidator {
	
	@Test
	public void testValidateDates() {
	
	assertEquals(true ,DateValidator.validateParseDate("11.04.1978"));
	assertEquals(false,DateValidator.validateParseDate("22.4.1978"));
	assertEquals(true ,DateValidator.validateParseDate("11-04-1978"));
	assertEquals(false,DateValidator.validateParseDate("22/4/1978"));
	assertEquals(false ,DateValidator.validateParseDate("15.04.1978"));
	assertEquals(true,DateValidator.validateParseDate("12.24.2020"));
	
	
	
	assertEquals(41 ,DateValidator.calculateAge("11.04.1978"));
	assertEquals(41,DateValidator.calculateAge("12.04.1978"));
	assertEquals(41 ,DateValidator.calculateAge("11-04-1978"));
	assertEquals(41,DateValidator.calculateAge("12/04/1978"));
	assertEquals(42 ,DateValidator.calculateAge("07.04.1978"));
	assertEquals(0,DateValidator.calculateAge("01.01.2020"));
	
	}
	

}
