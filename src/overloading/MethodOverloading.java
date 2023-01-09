package overloading;

//method over loading
public class MethodOverloading {

	void m1() {
		System.out.println("m1");
	}
	void m1(int a) {
		System.out.println("m2");
	}
	//same method name with different attribute
	void m1(int a,int b) {
		System.out.println("m3");
	}
	//same method with same attribute length but data type should be different
	void m1(char b,char a) {
		System.out.println("m3");
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.m1();

	}

}
