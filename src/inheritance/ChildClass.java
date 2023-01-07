package inheritance;

public class ChildClass extends SuperAndThis{

	void main(int a , int b) {
		 System.out.println("This is normal  " +  a +  b);
		 System.out.println("Curent variable  "+this.a+this.b);
		 System.out.println("Super class varaible  "+super.a+super.b);
	 }
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.main(100, 200);
		
		

	}

}
