package privateoverriding;

public class A {
	
	//when we declare the method as private then that can be specify to that perticular class 
	//we can not override the private method
	private void m1() {
		System.out.println("private Parent m1");
	}

}
