package demo;

//Program to calling method inside another method
public class CallingMethodInsideAnotherMethod {
	void m1() {
		m2();
		System.out.println("m1");
	}
	void m2() {
		m3(10);
		System.out.println("m2");
	}
	
	void  m3(int a) {
		System.out.println("m3");
		
		
	}
	public static void main(String[] args) {
		CallingMethodInsideAnotherMethod cmim = new CallingMethodInsideAnotherMethod();
		cmim.m1();

	}

}
