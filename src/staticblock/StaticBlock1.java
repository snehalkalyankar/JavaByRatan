package staticblock;

public class StaticBlock1 {
//All operation related to static block
	int a = 10;
	static int b =40;
	
	//Step 2 default constructor will call
	StaticBlock1(){
		System.out.println("Here default constructor");
	}
	
	//Step 4 - Parameterize constructor will call
	StaticBlock1(int age){
		System.out.println("You are inside of constructor "+age);
	}
	
	
		//Step 1- Instance block will execute first
		// Step 3 - Again after execution of default constructor instance block will call
		{
			System.out.println("Instance block");
		}

		
		void m1() {
			System.out.println(a);
		}
	public static void main(String[] args) {
	
		StaticBlock1 sb = new StaticBlock1();
		StaticBlock1 sb1 = new StaticBlock1(50);
		sb1.m1();
	}

}
