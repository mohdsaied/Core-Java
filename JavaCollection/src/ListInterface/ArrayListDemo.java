package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> product = new ArrayList<>();
		
		product.add("Laptop");
		product.add("SmatPhone");
		product.add("HeadPhone");
		
		System.out.println("Electronics Product is : "+product);// Printing all the project
		
		System.out.println("Get product on index 2 "+product.get(1));// getting particular index product
		
		String removeProject = product.remove(0);// Here i am removing particular index product
		System.out.println("Removed Product is : "+ removeProject);
		System.out.println("Total Product is remaining is :"+ product.size());// Getting size of the product
		
	}
}
