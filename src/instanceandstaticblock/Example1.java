package instanceandstaticblock;

public class Example1 {

	{
		System.out.println("parent instance block -1 ");
	}
	{

		{
			System.out.println("parent instance block -2 ");
		}
	}
	static{
		System.out.println("Static block parent ");
	}
}
