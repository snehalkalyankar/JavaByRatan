package constructors;

public class Example2 {
	//parameterize constructor
	
	void m1() {
		System.out.println("hello m1 method......");
	}
	Example2(){
		System.out.println("const1");
	}
	
	Example2(int a){
		System.out.println("const2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e2 = new Example2();
		Example2 e21 = new Example2(10);
		e2.m1();
		e21.m1();
		

	}

}
