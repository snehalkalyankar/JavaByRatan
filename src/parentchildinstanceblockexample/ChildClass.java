package parentchildinstanceblockexample;

public class ChildClass extends Example1 {
	//step 2: create the child class instance block
	{
		System.out.println("Child class instance block");
	}

	public static void main(String[] args) {
		//Create object of parent class
		//only parent class instance block will be call
		Example1 e = new Example1();
		
		// child class instance block will be call without extending to Example1 class
		ChildClass c = new ChildClass();
		
		
	}

}
