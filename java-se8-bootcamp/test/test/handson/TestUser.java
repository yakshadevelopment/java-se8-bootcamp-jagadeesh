package test.handson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import handson.User;

public class TestUser {

	
	
	@Test
	public void testUser() {
		
		User usr = new User("Ramesh","ramesh@gmail.com");
		assertEquals(1 ,User.addUser(usr));
		User usr1 = new User("gita","gita@gmail.com");
		assertEquals(2 ,User.addUser(usr1));
		
		
		
	}
}
