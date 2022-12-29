package demo;

public class StaticInstanceMethod {
	//Method can be declear
	//Define
	//call
	
	void m1() {
		System.out.println("Instance method");
	}
	
	static void m2() {
		System.out.println("Static method");
	}


	public static void main(String[] args) {
		//calling instance method
		StaticInstanceMethod sim = new StaticInstanceMethod();
		sim.m1();
		
		//When we call second sim.m2() at that time error occurs because
		//It static method always called by Class name
		StaticInstanceMethod.m2();

	}

}
