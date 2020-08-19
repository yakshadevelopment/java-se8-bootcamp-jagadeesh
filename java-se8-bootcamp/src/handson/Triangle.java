package handson;

import java.text.DecimalFormat;

public class Triangle extends Shape{
	
	int base;
	int height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub	
		DecimalFormat df= new DecimalFormat("0.00");
		return  Double.parseDouble(df.format((0.5d)*(base* height)));
		
	}
	
}
