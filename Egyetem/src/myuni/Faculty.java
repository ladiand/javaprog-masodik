package myuni;


public class Faculty extends OrganizationalUnit {

	private String dean;
	private int numberOfStudents;
	
	public Faculty(FacultyName facultyName, int numberOfEmployees, int numberOfStudents) {
		super(facultyName.name(), numberOfEmployees);
		switch (facultyName) {
			case MAK: this.dean = "Palotás Á";
				break;
			case MFK: this.dean = "Mucsi G";
				break;
			case GEIK: this.dean = "Siménfalvi Z";
				break;
			case GTK: this.dean = "Somosi M";
				break;
			case AJK: this.dean = "Csák Cs";
				break;

		}
		this.numberOfStudents = numberOfStudents;
	}

	public Faculty(FacultyName facultyName) {
		this(facultyName, 70, 500);
	}

	@Override
	public String toString() {
		return "Faculty [dean=" + dean + ", numberOfStudents=" + numberOfStudents + ", toString()=" + super.toString()
				+ "]";
	}

	public String getDean() {
		return dean;
	}

	public void setDean(String dean) {
		this.dean = dean;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		if (numberOfStudents >= 0)
		this.numberOfStudents = numberOfStudents;
	}
	
	@Override
	public double workPerEmployee() {
		return numberOfStudents / getNumberOfEmployees();
	}
	
	public enum FacultyName {

		MAK, MFK, GEIK, GTK, AJK
		
	}
	
}
