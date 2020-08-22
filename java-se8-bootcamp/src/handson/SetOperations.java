package handson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;



public class SetOperations{

public static void main(String[] args) 

    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> aa=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
              aa.add(sc.nextInt());
              
        }
        ArrayList<Integer> aa2=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
              aa2.add(sc.nextInt());
              
        }
        char c=sc.next().charAt(0);
        
        ArrayList<Integer> op=new ArrayList<Integer>();
        
        op=performSetOperations( aa, aa2,c);
        
        Iterator<Integer> itr=op.iterator();
        while(itr.hasNext())
        {
              int a=(Integer)itr.next();
              System.out.println(a);
        }
        
}







	
	
	
	
	 
    public static ArrayList<Integer> performSetOperations
    (ArrayList<Integer>aa,ArrayList<Integer>aa2,char c)
    {
          
          ArrayList<Integer> aa3= new ArrayList<Integer>();
          
          if(c=='+')
          {
                aa.removeAll(aa2);
                aa.addAll(aa2);
                aa3=aa;
          }
          

          if(c=='*')
          {
                aa.retainAll(aa2);
                aa3=aa;
          
                }
    if(c=='-')
    {
          aa.removeAll(aa2);
          aa3=aa;
    }
return aa3;
}
	
	
	}



