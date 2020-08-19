package handson;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class DuplicateWord {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String ss = s.nextLine();
		System.out.println(removeDuplicates(ss));

		
		
	}
		public static String removeDuplicates(String s) {
			
		String words[] = s.split(" ");
		
		StringBuffer sb = new StringBuffer();
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for (int i = 0; i < words.length; i++)
			
		lh.add(words[i]);
		
		Iterator<String> itr = lh.iterator();
		while (itr.hasNext()) {
		String c = itr.next();
	
		sb.append(c);
		sb.append(" ");
	
		}
		return sb.toString().trim();
		}
		
		
		
	}
	
