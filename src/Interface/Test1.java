package Interface;

public class Test1 implements Interface1 ,Interface2 {


	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hiiii");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		t.m1();
		
		

	}


}
