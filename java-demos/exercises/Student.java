public class Student{
	String firstName;
	String lastName;
	double gpa;
	String major;
	int age;
	boolean onProbation;
	
	// constructor method
	public Student(String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	
	//method
	public boolean isOnHonorRoll() {
		if(this.gpa > 3.5) {
			
			return true;
		}
		return false; // only return one thing so if not true returns false
		
	}
}