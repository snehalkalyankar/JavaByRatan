package demo;

class X{}
class Emp{}
class Y{}
class Student{}


public class PassObjectToMethod {
	//here we are passing object to the method
	void m1(Emp e , X x) {
		System.out.println("m1 method");
	}
	static void m2(Y y , Student s) {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		//step -1 First create the class object
		PassObjectToMethod potm = new PassObjectToMethod();
		//step -2 second create the passed reference object
		X x = new X();
		Emp e = new Emp();
		//Call the method and pass the reference to method
		potm.m1(e, x);
		
		Y y = new Y();
		Student s = new Student();
		PassObjectToMethod.m2(y, s);

	}

}
