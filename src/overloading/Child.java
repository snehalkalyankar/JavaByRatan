package overloading;

public class Child extends Parent{
	void m2(int name) {
		System.out.println("Child class m3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
//		Parent p = new Parent();
//		p.m2(10);
		c.m2(10);

	}

}
