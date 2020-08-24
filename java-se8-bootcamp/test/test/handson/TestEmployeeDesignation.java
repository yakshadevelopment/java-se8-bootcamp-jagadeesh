package test.handson;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import java.util.HashMap;



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
