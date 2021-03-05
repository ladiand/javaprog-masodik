package myuni;

public abstract class OrganizationalUnit {

	

	private String name;
	private int numberOfEmployees;
	
	public OrganizationalUnit(String name, int numberOfEmployees) {
		super();
		this.name = name;
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public String toString() {
		return "OrganizationalUnit [name=" + name + ", numberOfEmployees=" + numberOfEmployees + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		if (numberOfEmployees >= 0) 
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public abstract double workPerEmployee();
	
	
	
	
}
