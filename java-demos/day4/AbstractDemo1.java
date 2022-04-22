abstract class Pet {
	
	// Abstract method contains no body{}/ or implementation
	public abstract void sound();
	
	// Concrete method 
	public void greetings(){
		
	}
}

class Dog extends Pet{
		// method overriding
		/*
		if a method exists in super class and subclass with same name and signature/params
		method overriding only in subclasses whereas overloading happens in same class
		*/
	public void sound(){
		System.out.println("Woof!");
	}
	
}

class Cat extends Pet{

	public void sound(){
		System.out.println("Meow!");
	}
	
}

/* sound method has different implmentation in different cases
common method different behaviours
if method overriding is obvious no point in writing body of method
*/


class AbstarctDemo1 {
	
	public static void main(String [] args) {
		
		//Pet p1 = new Pet();
		
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		d1.sound();
		c1.sound();
	}
}