package abstraction;

public class Main   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child a = new Child();
		a.makesound();
		a.sleep();
		
		AbstractClass d = new Child();
		d.sleep();
		d.makesound();
		
		
		

	}

}
