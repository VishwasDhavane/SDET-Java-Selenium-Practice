package interfaceexamples;

public interface Animal {
	
	  void makeSound();
	  
	  default void sleep() {
	        System.out.println("Interface method sleep");    
	        
	  }
	  public static  void eat() {
	        System.out.println("Interface static method");
	  }
	  

}
