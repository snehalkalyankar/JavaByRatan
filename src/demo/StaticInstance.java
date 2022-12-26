package demo;

public class StaticInstance {

	int a = 10;
	int b = 20;
	static int c = 30 ;
	static int d = 40 ;
	
	void m1() {
		// instance varaible in side instance block
		System.out.println(a);
		System.out.println(b);
		// static varaible in side instance block
		System.out.println(c);
	}
	
	static void m2() {
		//instance varaible inside static block
		System.out.println(c);
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		StaticInstance si = new StaticInstance();
		si.m1();
		si.m2();
		
		
	
	}

}
