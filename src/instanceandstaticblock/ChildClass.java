package instanceandstaticblock;
//Your static block will call only one throughout the program
//But your instance block will be call on every object creation
public class ChildClass extends Example1{
	{
		System.out.println("child instance block-1");
	}
	{
		System.out.println("child instance block-2");
	}
	static{
		System.out.println("child static block-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		ChildClass c1 = new ChildClass();
		
	}

}
