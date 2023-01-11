package staticoverriding;

public class B extends A {
	
	static void m1() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		A a = new B();
		//here we are calling m1 method with refrence of parent class "A" with object of child class 
		//but still it calls parent class static method because static it is not bind with object 
		//it is bind with class
		a.m1();
	}

}
