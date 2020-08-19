package handson;

import java.text.DecimalFormat;
import java.util.Scanner;

public  class ShapeMain {
	
	static Shape s;
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the object to create  :");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");
		
		int type = Integer.parseInt(sc.nextLine());
		
		switch (type) {
		case 1:System.out.println("Provide side of square"); 
				int side= Integer.parseInt(sc.nextLine());
			       s= new Square (side);
			       System.out.println("Area is " +s.getArea());
			
			break;
		case 2:System.out.println("Provide length of rectangle"); 
				int length= Integer.parseInt(sc.nextLine());
				System.out.println("Provide breadth of rectangle"); 
				int breadth= Integer.parseInt(sc.nextLine());
	       s= new Rectangle (length,breadth);
	       System.out.println("Area is " +s.getArea());
	
	break;
		case 3 : System.out.println("Provide base of Triangle");
		    int base= Integer.parseInt(sc.nextLine());
		    System.out.println("Provide height of Triangle");
		    int height= Integer.parseInt(sc.nextLine());
		       	s= new Triangle(base,height);
	       System.out.println("Area is " +s.getArea());
	
	break;
		default:
			break;
		}
		
		
		
		
	}
	

}

