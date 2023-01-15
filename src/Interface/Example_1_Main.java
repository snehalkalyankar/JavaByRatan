package Interface;

public class Example_1_Main implements Myinterface {
	
	//By default the method in interface are public
	//otherwise it will show error
	public void m1() {
		System.out.println("implementation m1");
	}

	  public void m2() {
		System.out.println("implementation m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Example_1_Main e = new Example_1_Main();
//		e.m1();
//		e.m2();
		
		Myinterface i = new Example_1_Main();
		i.m1();
		i.m2();

	}

}
