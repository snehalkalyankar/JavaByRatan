package instanceblock;

//Step 1 : We create 3 constructor
//Step 2 : create on instance block
//Note : you cane see for each constructor  one single instance block is executed

public class InstanceStaticDiffrence {
	//Zero parameterize constructor
	InstanceStaticDiffrence(){
		System.out.println("Default");
	}
	//One parameterize constructor
		InstanceStaticDiffrence(int age){
			
			System.out.println("One paramtere");
			System.out.println(age);
		}

		//More than one  parameterize constructor
		InstanceStaticDiffrence(int age , String name){
			System.out.println("more than one parameter");
			System.out.println(age+ " "+name);
		}
		
		{
			System.out.println("Instance Block");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InstanceStaticDiffrence();
		new InstanceStaticDiffrence(100);
		new InstanceStaticDiffrence(100,"Snehal");

	}

}
