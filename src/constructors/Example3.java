package constructors;

public class Example3 {
	int eid;
	String ename;
	float esal;
	
	Example3(int eid ,String ename){
		//here you can accessing the instance value inside constructor
//		eid = this.eid;
//		ename = this.ename;
	//if you want to access the value locally
		System.out.println(eid);
		System.out.println(ename);
		
	}
	void m1() {
		System.out.println("We are in method"  +eid);
		System.out.println("We are in method"  +ename);
		System.out.println("We are in method"+esal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 e3 = new Example3(111,"snehal");
		e3.m1();

	}

}
