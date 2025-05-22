package CompareObjects;

import java.util.Objects;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String salary;
	
	public Employee(int id, String name, String salary) {
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		
		Employee employee = (Employee) obj;
		
		return id == employee.id && 
				Objects.equals(name, employee.name) && 
				Objects.equals(salary, employee.salary);
		
				
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "mo saied", "100");
		Employee e2 = new Employee(1, "mo saied", "100");
		Employee e3 = new Employee(2, "rashid", "200");
		
		boolean equals = e1.equals(e2);
		System.out.println(equals); // false //now i want to make it...... true
		boolean equals2 = e2.equals(e3);
		System.out.println(equals2); // false
	}
	
	

}
