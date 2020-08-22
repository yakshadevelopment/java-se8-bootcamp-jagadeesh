package handson;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class SymmetricDifference {


	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int[] a=new int[n1];
		for(int i=0;i<n1;i++)
		a[i]=sc.nextInt();
		int n2=sc.nextInt();
		int [] b= new int[n2];
		for(int i=0;i<n2;i++)
		b[i]=sc.nextInt();
		int[] res=getSymmetricDifference(a,b);
		
		for(int i=0;i<res.length;i++)
		System.out.println(res[i]);
		
	}
	
	
		
		public static int[] getSymmetricDifference(int a[],int b[])
		{
			TreeSet<Integer> ts1=new TreeSet<Integer>();
			TreeSet<Integer> ts2=new TreeSet<Integer>();
			TreeSet<Integer> ts3=new TreeSet<Integer>();
			ArrayList<Integer> aa=new ArrayList<Integer>();
			for(int i=0;i<a.length;i++)
			ts1.add(a[i]);
			for(int i=0;i<b.length;i++)
			ts2.add(b[i]);
			ts1.addAll(ts2);
			for(int i=0;i< a.length;i++)
			{
			for(int j=0;j< b.length;j++)
			{
			if(a[i]==b[j])
			ts3.add(a[i]);
			}
			}
			ts1.removeAll(ts3);
			aa.addAll(ts1);
			int res[]=new int[aa.size()];
			for(int i=0;i<res.length;i++)
			res[i]=aa.get(i);
			return res;
		}

}
