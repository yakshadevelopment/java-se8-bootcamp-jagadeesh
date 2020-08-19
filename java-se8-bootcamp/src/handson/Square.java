package handson;

import java.text.DecimalFormat;

public class Square extends Shape{
	
	int side;



	public Square(int side) {
		super();
		this.side = side;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		DecimalFormat df= new DecimalFormat("0.00");
		return  Double.parseDouble(df.format((double)(side* side)));
		
	}
	
}
