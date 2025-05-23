package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListS {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.add(0, 15);
		list.add(1, 16);
		System.out.println(list.get(1));
		
		boolean contains = list.contains(51);
		System.out.println(contains);
		
//		Iterator<Integer> iterator = list.iterator();
//		
//		while (iterator.hasNext()) {
//			Integer integer = (Integer) iterator.next();
//			System.out.println(integer);
//			
//			
//		}
	}

}
