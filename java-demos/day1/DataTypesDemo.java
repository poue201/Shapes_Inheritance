class DataTypesDemo {
	public static void main(String[] args) {
	
		// Declarations
		int studentId; 
		// this name follows lower camel case

		String studentName;

		char grade;

		boolean isRegistered;

		double avgScore;
		
		
		// Declaration & Initialization
		
		studentId = 101;
		
		String studentEmail = "a@gmail.com";
		
		studentName = "Alex";
		
		grade = 'A';
		
		isRegistered = false;
		
		avgScore = 10.5;
		
		studentId = 102;
		
		System.out.print(studentId);
		System.out.print(studentEmail);
		System.out.print(studentName);
		System.out.print(grade);
		System.out.print(isRegistered);
		System.out.println(avgScore);
		
		System.out.println(studentId+ " "+studentEmail+" "+studentName);
		
		// Student ID is : 102
		System.out.println("Student ID is : "+studentId);
		
		int a = 100;
		int b = 200;
		
		// Sum of 100 and 200 is: 300
		System.out.println("Sum of "+a+" and "+b+ " is : "+(a+b));
		
	
		
		
		
	}
}