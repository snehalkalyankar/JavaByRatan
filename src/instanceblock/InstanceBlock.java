package instanceblock;

public class InstanceBlock {
	//Instance block is block which we can write the logic of the application
	//Both instance block and constructor executed at the time of object creation
	//But priority goes to instance block first and then constructor
	
	InstanceBlock(){
		System.out.println("We are in constructor");
	}
	{
		System.out.println("We are in instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlock iib = new InstanceBlock();
		
	}

}
