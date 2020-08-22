package test.handson;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

import handson.Auditorium;
import handson.BankRate;
import handson.CapacityComparator;

public class TestAuditorium {
	
	
	
	@Test
    public void testAuditorium_Success() throws ParseException {
       
		
        
		Auditorium a1= Auditorium.createNew("Concert Hall,15000,550");
		Auditorium a2= Auditorium.createNew("Opera Hall,10000,400");
		Auditorium a3= Auditorium.createNew("Symphony Hall,20000,500");
		
		ArrayList<Auditorium> audilist = new ArrayList<Auditorium>();
		audilist.add(a1);
		audilist.add(a2);
		audilist.add(a3);
//System.out.println(audilist);
		Collections.sort(audilist);
		
		ArrayList<Auditorium> audilistsorted1 = new ArrayList<Auditorium>();
		audilistsorted1.add(a2);
		audilistsorted1.add(a1);	
		audilistsorted1.add(a3);
	//	System.out.println(audilistsorted1);
		
		assertTrue(audilistsorted1.equals(audilist));
		
		ArrayList<Auditorium> audilistsorted2 = new ArrayList<Auditorium>();
		audilistsorted2.add(a2);
		audilistsorted2.add(a3);	
		audilistsorted2.add(a1);
        
       
       
       Collections.sort(audilist,new CapacityComparator());
       
       
       assertTrue(audilistsorted2.equals(audilist));
       
        
    }
	
	
	

}
