package demo;

public class ObjectCreationInsideMethod {
	
	int a = 30;
	int b = 30;
	 static void m1() {
		 //We can create the object inside of method that is also possible
		 ObjectCreationInsideMethod oci = new ObjectCreationInsideMethod();
		System.out.println(oci.a);
		System.out.println(oci.b);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ObjectCreationInsideMethod oci = new ObjectCreationInsideMethod();
		 oci.m1();
		

	}

}
