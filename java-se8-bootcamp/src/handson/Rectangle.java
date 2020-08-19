package handson;

public class Rectangle extends Shape{
	
	int length;
	int breadth;


	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return  (double)(length* breadth);
		
	}
	
}