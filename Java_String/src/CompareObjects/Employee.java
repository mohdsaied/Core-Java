package CompareObjects;

import java.util.Objects;

public class Employee {
	private int id;
	
	private String name;
	
	private int salary;
	
	public Employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Employee employee = (Employee)obj;
		
		return id == employee.id &&
				Objects.equals(name, employee.name) &&
				Objects.equals(salary, employee.salary);
	}
	
		
		
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "mosaied", 60000);
		Employee e2 = new Employee(101, "mosaied", 60000);
		Employee e3 = new Employee(102, "Majid", 70000);
		
		boolean equals = e1.equals(e2);
		System.out.println(equals);
		
		boolean equals2 = e2.equals(e3);
		System.out.println(equals2);
		
		/*
		
		
Q1)Write a Java Program to count the number of words in a string using HashMap in Java8 streams.
Input : "This this is is done by Mahesh Mahesh"
Output : Mahesh=2, by=1, this=1, This=1, is=2, done=1

String sentence = "This this is is done by Mahesh Mahesh";

Arrays.stream(sentence.trim().split(" ")).collect(Collectors.grupingBy(n->n, Collectors.counting()));
		
		 */
		
	}
}






