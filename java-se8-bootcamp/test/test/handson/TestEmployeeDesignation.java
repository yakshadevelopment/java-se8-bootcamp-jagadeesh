package test.handson;

import static org.junit.Assert.assertArrayEquals;
import java.util.HashMap;

import org.junit.Test;

import handson.EmployeeDesignation;

public class TestEmployeeDesignation {

	

	@Test
	public void testEmployeeDesignation() {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("Manish", "MGR");
		hm.put("Babu","CLK");
		hm.put("Rohit", "MGR");
		hm.put("Viru","PGR");
		hm.put("Raju","CLK");
		
		
		
		
		assertArrayEquals(new String[]{"Manish","Rohit"},EmployeeDesignation.obtainDesignation(hm,"MGR"));
		assertArrayEquals(new String[] {"Babu","Raju"},
				EmployeeDesignation.obtainDesignation(hm,"CLK"));
		
		
	}
	
	
	
	
}
