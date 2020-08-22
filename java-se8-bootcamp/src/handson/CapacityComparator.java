package handson;

import java.util.Comparator;

public	class CapacityComparator implements Comparator<Auditorium>{

	
	@Override
	public int compare(Auditorium o1, Auditorium o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getCapacity(), o2.getCapacity());
	}
	
	
	
}