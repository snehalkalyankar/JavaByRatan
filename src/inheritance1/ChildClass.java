package inheritance1;

public class ChildClass extends Parent1{
	//here first call come but it seems that inside the constructor they are calling parameterize constructor
	ChildClass(){
		this(10);
		System.out.println("we are in defualt constructor in child class");
	}
	ChildClass( int age){
		//step -2 they will come here but again it seems like this constructor is also calling the super 
		//means the parent class constructor
		super();
		System.out.println("we are in parametrize constructor of child class");
		
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
	

	}

}
