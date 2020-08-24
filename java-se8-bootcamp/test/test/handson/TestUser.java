package test.handson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


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
