package interfaceexamples;

public class Dog implements Animal,Pet{

	@Override
	public void makeSound() {
		System.out.println("Child class Interface Overrride");
		
	}
	
	public void makerun()
	{
		System.out.println("Child class method");
	}

	@Override
	public void play() {
		System.out.println("child class second Interface Override");
		
	}
	
	
	

}
