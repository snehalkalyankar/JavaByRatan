package staticblock;

//Flow of execution 
//Step 1 :static block will call
//Step 2 :instance block will call
//Step 3 :you can access instance variable inside instance block but not allowed in static block
//Step 4:Static block can access only static element non static elements are not allowed
//Step 5:instance block will allow static as well as non static element
public class AcessStaticVaraible {
	
	
	static int a= 10;
	int b = 20;
	
	{
		System.out.println("instance block"+a);
		System.out.println("instance block"+b);
	}
	static {
		System.out.println("static block"+a);
		//When you call non static variable inside static block it will show error
		//System.out.println("static block"+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcessStaticVaraible av = new AcessStaticVaraible();
	}

}
