package test.handson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


import handson.SetOperations;

public class TestSetOperations {
	
	
	@Test
	public void testSetOperations_Success() throws ParseException {
		
	
	
	int[] a = { 1, 2, 3 };

	int[] b = { 3, 5, 7 };
	
	int[] c = {1,2,3,5,7};
	
	
	ArrayList<Integer> list1 = (ArrayList<Integer>) Arrays.stream(a)     // IntStream 
							.boxed()        // Stream<Integer>
							.collect(Collectors.toList());
	
	ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.stream(b)     // IntStream 
											.boxed()        // Stream<Integer>
												.collect(Collectors.toList());
 
	ArrayList<Integer> list3 = (ArrayList<Integer>) Arrays.stream(c)     // IntStream 
								.boxed()        // Stream<Integer>
									.collect(Collectors.toList());

	// for checking Arrylist
	
	   assertTrue(list3.equals(SetOperations.performSetOperations(list1,list2,'+') ));
	
	// test case 2

	   int[] a1 = { 10, 9, 8,7 };

		int[] b1 = { 2, 4, 6,8 };
		
		int[] c1 = {8};
		
		
		ArrayList<Integer> list11 = (ArrayList<Integer>) Arrays.stream(a1)     // IntStream 
								.boxed()        // Stream<Integer>
								.collect(Collectors.toList());
		
		ArrayList<Integer> list22 = (ArrayList<Integer>) Arrays.stream(b1)     // IntStream 
												.boxed()        // Stream<Integer>
													.collect(Collectors.toList());
	 
		ArrayList<Integer> list33 = (ArrayList<Integer>) Arrays.stream(c1)     // IntStream 
									.boxed()        // Stream<Integer>
										.collect(Collectors.toList());

		// for checking Arrylist
		
		   assertTrue(list33.equals(SetOperations.performSetOperations(list11,list22,'*') ));

	// test case 3
		   
		   

		   int[] a2 = { 5,10, 15, 20 };

			int[] b2 = { 0, 10, 12,20 };
			
			int[] c2 = {5,15};
			
			
			ArrayList<Integer> list111 = (ArrayList<Integer>) Arrays.stream(a2)     // IntStream 
									.boxed()        // Stream<Integer>
									.collect(Collectors.toList());
			
			ArrayList<Integer> list222 = (ArrayList<Integer>) Arrays.stream(b2)     // IntStream 
													.boxed()        // Stream<Integer>
														.collect(Collectors.toList());
		 
			ArrayList<Integer> list333 = (ArrayList<Integer>) Arrays.stream(c2)     // IntStream 
										.boxed()        // Stream<Integer>
											.collect(Collectors.toList());

			// for checking Arrylist
			
			   assertTrue(list333.equals(SetOperations.performSetOperations(list111,list222,'-') ));
		   
	
	
	}
}
