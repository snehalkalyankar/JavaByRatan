package inheritance;

public class Child extends Parent {
	//if we trying to inherit constructor into child class it will you and error 
	//add return type as void 
	//It means that parent class constructor is consider as method in child class
	
	void Parent(){
		System.out.println("nanu");
	}

	public static void main(String[] args) {
		Child p = new Child();
		p.Parent();
		Child c=new Child();
	}
	

}