package handson;

import java.text.ParseException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class UniqueCollection {
	
	
	public static void main(String[] args) throws ParseException {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	String[] a= new String[n];
	for(int i=0;i<n;i++)
		a[i]=sc.next();

	String res[]=orderElements(a);
	for(int i=0;i<res.length;i++)
		System.out.println(res[i]);
	}
	
	
	
	public static String[] orderElements(String[] s) {

		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
			lhs.add(s[i]);
		}
		String[] a= new String[lhs.size()];
		
		lhs.toArray(a);
		
		/*
		 * for(int i=0;i<s.length;i++) { lhs.toArray(a); }
		 */
		
		Arrays.sort(a);
		return a;
	}
	

	
	
	
	
	
	}

	
	
	
	


