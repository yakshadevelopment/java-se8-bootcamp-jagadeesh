package handson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class EmployeeDesignation {
	
	
	public static void main(String[] arg)
	{
		
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.nextLine());

		HashMap<String,String> hm=new HashMap<String,String>();
		
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextLine(),sc.nextLine());
		}
			String b=sc.nextLine();
		
			String [] op;
			
			op=obtainDesignation(hm,b);
			for (String string : op) {
				System.out.println(string);
			}			
	}
	
	public static  String[] obtainDesignation(HashMap<String,String> hm,String s)
	{
		LinkedHashSet<String> op=new LinkedHashSet<String>();
		
		Iterator<String> itr=hm.keySet().iterator();
		
		while(itr.hasNext())
		{
			String key=itr.next();
			String value=hm.get(key);
			if(s.equals(value))
			{
				op.add(key);
			}
			
				
		}
		
		String [] a = new String[op.size()];
		op.toArray(a);
		Arrays.parallelSort(a);
		return a;
		
			}




}

	
	

