package handson;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Capitalize {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(printCapitalized(s));
		}


		public static String printCapitalized(String s) {
			
		StringTokenizer st= new StringTokenizer(s," ");
		
		StringBuffer sb= new StringBuffer();
		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
			String s2=s1.substring(0, 1);
			String s3=s1.substring(1);
			sb.append(s2.toUpperCase());
			sb.append(s3);
			sb.append(" ");

		}
		return sb.toString().trim();
		}
		
		
		}

