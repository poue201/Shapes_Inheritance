/*static atributes
static methods
and classes?
*/

// constructor overloading

 class Person {
	private int id;
	
	private String name;
	
	/*	default constructor: which takes no parameters: added by default
		if you add none
	
		default constrcutor - a constructor which takes 0 parameters
		other name: no-parameterized constructor
	when default constrcutor is called, want to make sure no default values
	*/	
	
	
	public Person() {
		// To initialize the instance variables with some custom values
		
		this.id = 1;
		
		this.name = "Tom";
		
	}
	
	//parameterized constructor
	
	public Person(int id, String name) {
	
		this.id = id;
		this.name = name;
		
	}
	
	public Person(String name) {
	
		this.name = name;
		
	}
	
	public int getId() {
		
		return this.id;
	}
	
	public String getName() {
		
		return this.name;
	
	}
	
	/*
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	*/
}

class ConstructorOverloadingDemo {
	
	public static void main(String [] args) {
	
		Person p1 = new Person(); // this statement will call a constructor from Person class which takes no arguments
		
		Person p2 = new Person(2, "Alex"); // are you able to write id = 2 in parameters: calls a parameterized constructor
	
	}
}