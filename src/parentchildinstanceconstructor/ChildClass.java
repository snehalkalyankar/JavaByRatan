package parentchildinstanceconstructor;
//Note when we call parameterize constructor 
//and we have default constructor to at that time only parameterize constructor will be call
//And first parent class instance block and constructor will will
//after that child class instance block and constructor will call
public class ChildClass extends Example1{
	{
		System.out.println("child instance block");
	}

	ChildClass(){
		System.out.println("Child class constructor");
	}
//	ChildClass(int age){
//		System.out.println("Child class parametrize constructor" +age);
//	}
	public static void main(String[] args) {
	ChildClass c = new ChildClass();
//	ChildClass c1 =  new ChildClass(10);

	}

}
