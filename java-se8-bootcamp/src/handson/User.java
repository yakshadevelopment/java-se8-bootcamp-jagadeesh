package handson;

import java.util.Scanner;

public class User {
	
	String name;
	String email;
	static int count ;
	static User[] uarr= new User[10];
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		count++;
	}
	
	public static int addUser(User usr)
	{
		
		for (int i = 0; i < uarr.length; i++) {
			
			if (uarr[i] == null)  {
				uarr[i]=usr;
				break;
			}
			else continue;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < uarr.length; i++) {
			
		
		System.out.println("Enter user details :q to quit");
		String istr=sc.nextLine();
		if (istr.equalsIgnoreCase("q") )break;
				
		String[] iarr = istr.split(",");
		
		User usr1 =  new User(iarr[0], iarr[1]);
		
		System.out.println("User added .Count = "+ addUser(usr1));
		
		}
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		User.count = count;
	}
	

}
