package interfaceexamples;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog a = new Dog();
		a.makerun();
		a.sleep();
		a.makeSound();
		a.play();
		 
		
		System.out.println("             ");
		
		
		Animal b = new Dog();
		b.makeSound();
		b.sleep();
		
		System.out.println("             ");
		
	   Pet c = new Dog();
	   c.play();
	
		Animal.eat();
		Pet.getpet();

	}

}
