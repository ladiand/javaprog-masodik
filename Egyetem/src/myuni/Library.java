package myuni;

public class Library extends OrganizationalUnit{

	private int numberOfBooks;

	public Library(int numberOfEmployees, int numberOfBooks) {
		super("Library", numberOfEmployees);
		this.numberOfBooks = numberOfBooks;
	}

	@Override
	public String toString() {
		return "Library [numberOfBooks=" + numberOfBooks + ", toString()=" + super.toString() + "]";
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	
	@Override
	public double workPerEmployee() {
		return numberOfBooks / getNumberOfEmployees();
	}
	
	
}
