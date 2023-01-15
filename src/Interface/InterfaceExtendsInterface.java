package Interface;
//Inheritance is possible in interface
//you can write multiple interface 
//method overriding is possible in interface
//one interface can extends multiple interface
//but one class can extends only one class
interface InterfaceExtendsInterface {
	
	void m1();
	

}
interface InterfaceExtendsInterface1 extends InterfaceExtendsInterface {
	
	void m2();

}

interface InterfaceExtendsInterface2 extends InterfaceExtendsInterface1 {
	
	void m1();

}

class Test implements InterfaceExtendsInterface2{
	public void m1() {
		System.out.println("m1 method implemented");
	}
	
	@Override
	public void m2() {
		
		System.out.println("m2 method implemented");
		
	}
public static void main(String args[]) {
	
	Test t = new Test();
	t.m1();
	t.m2();
	
}

}


