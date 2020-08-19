package handson;

import java.util.Scanner;

public class Fibonacci {
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int nn = Integer.parseInt(s.nextLine());		
		System.out.println(getFibonacciSum(nn));
		
		
	}
	
	
public static int getFibonacciSum(int num){
	
	int a=0,b=1,c=0,d=1;
	
	for (int i = 3; i <= num ; i++) {
		
		c=a+b;
		a=b;
		b=c;
		d=d+c;
	}
	
	
	return d;
	
}
	
	
	
}
