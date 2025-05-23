package SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Carrot");
		set.add("Donson date");
		set.add("Elderberry");
		set.add("Finger lime");
		
		Iterator<String> it =  set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
