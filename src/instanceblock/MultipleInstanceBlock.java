package instanceblock;

// We can call multiple instance block and multiple constructor in single class
// Before calling constructor instance block is executed first
public class MultipleInstanceBlock {
	
	MultipleInstanceBlock(){
		System.out.println("Default constructor");
	}
	
	MultipleInstanceBlock(int age){
		System.out.println("parameterise constructor"+age);
	}
	{
		System.out.println("Instance block -1");
	}
	{
		System.out.println("Instance block -2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultipleInstanceBlock();
		new MultipleInstanceBlock(100);

	}

}
