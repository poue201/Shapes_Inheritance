

//python supports multiple inheritance but not Java
//cannot extend more than one class

public class Student extends Person{

	private String email;
	private String course;
	
	//write a constructor which takes all parameters
	
	public Student(int id, String name, String email, String course){
	
		//call constrcutor in  parent class
		super(id,name); // this will call a super class constructor which takes params
		
		
		this.email = email;
		this.course = course;
	}

	public String getStudentData() {
		
		return super.getId() + " " + super.getName() + 
				" " + this.email + " " + this.course;
		
	}
}