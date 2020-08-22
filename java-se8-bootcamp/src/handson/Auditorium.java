package handson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Auditorium implements Comparable<Auditorium>{
	
	private String name;
	private Double costperday;
	private Integer capacity;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s\n ",  name , costperday ,capacity );
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCostperday() {
		return costperday;
	}
	public void setCostperday(Double costperday) {
		this.costperday = costperday;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public Auditorium(String name, Double costperday, Integer capacity) {
		super();
		this.name = name;
		this.costperday = costperday;
		this.capacity = capacity;
	}
	
	public static Auditorium createNew(String detail) {
		//Concert Hall,15000,550
		String[] details =detail.split(",");
		Auditorium audi = new Auditorium(details[0],Double.parseDouble(details[1]),Integer.parseInt(details[2]));
			
		return audi;
	}
	@Override
	public int compareTo(Auditorium o) {	
		
		return Double.compare(this.costperday, o.costperday) ;
	}
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nos=0;
		
		
		ArrayList<Auditorium>  audilist = new ArrayList<Auditorium> ();
		
		System.out.println("Enter no of Auditorium");
		nos = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < nos; i++) {
			
			audilist.add(Auditorium.createNew(sc.nextLine()));
			
		}
			
		System.out.format("%-15s %-15s %s\n" ,"Name","Cost per Day","Capacity");
		
		for (Auditorium auditorium : audilist) {
			System.out.println(auditorium);
		}
				
		System.out.println("Enter a type to sort:");
		System.out.println("1.Sort by Cost Per Day");
		System.out.println("2.Sort by capacity");
		System.out.println();
		
		int sorttype= Integer.parseInt(sc.nextLine());
		
		//int sorttype = 0;
		
		
		switch (sorttype) {
		
		case 1: Collections.sort(audilist);
			
			break;
		case 2: Collections.sort(audilist, new CapacityComparator());
		
		break;
		default: 
			break;
		}
		
System.out.format("%-15s %-15s %s\n" ,"Name","Cost per Day","Capacity");
		
		for (Auditorium auditorium : audilist) {
			System.out.println(auditorium);
		}
		
		
		
		
		}
		

		
}
		
		
	