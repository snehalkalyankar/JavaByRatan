package privateoverriding;

public class B extends A {
	
	private void m1() {
		System.out.println("private child m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		//Error will occurs
		//we can override final method
//		a.m1();
	}

}
