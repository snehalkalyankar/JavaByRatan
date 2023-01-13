package abstarction;

abstract class StaticInstanceInAbstarct {
	{
		System.out.println("Hello instance block inside static block");
	}
	
	static {
		System.out.println("hello static block inside abstarct class");
	}

}
