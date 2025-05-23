package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> electronics = new LinkedList<>();
		
		electronics.add("Laptop");
		electronics.add("Smatphone");
		electronics.add("Tablet");
		electronics.add("Samrtwatch");
		
		electronics.addFirst("TV");
		electronics.addLast("Camera");
		
		System.out.println(electronics);
	}

}
