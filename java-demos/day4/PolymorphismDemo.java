public abstract class Pet {
	
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
	
	//Direct method
	public void heyDog(){
		
		System.out.println("Hi");
	}
	
}

class Cat extends Pet{

	public void sound(){
		System.out.println("Meow!");
	}
	
}


class PolymorphismDemo {
	
	public static void main(String [] args) {
	
			/*
			
			Poly - many
			Morphism - Forms/Behaviours
			
			examples:
				 + operator is an example of compile time polymorphism
				 + can be used to peform arithmetic operation
				 and can also be used to concatenate  String or int and String
				 
				 Method Overriding leads to Polymorphism:
				 sound method behaves differently
				 don't use type in object declaration from subclass
	
			*/
		
		//Pet p1 = new Pet();
		
		// A superclass reference caan refer to all its sybclass objects
		
		// Can a superclass reference access/call the direct methods of its subclass?
		Pet p1 = new Dog();
		p1.sound();
		
		//p1.heyDog(); // Error can't access direct method of dog
		// need to typecast it
		Dog d1 = (Dog) p1; // what does this line do?
		d1.heyDog(); // need to typecast it
		
		p1 = new Cat();
		p1.sound();
		
		
		
	}
}