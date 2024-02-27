package demo.restservices;

public class Employee {

	private String id;
	private String name;
	private double salary;
	
	// Default constructor.
	public Employee() {
	}

	// Artificial constructor, to simulate some back-end employee processing.
	public Employee(String id) {
		this.id = id;
		this.name = "Employee" + id;
		this.salary = 125000;
	}

	// Full-blown constructor.
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
