package demo;

public class ObjectCreationStaticInsatnce {
	//instance varaible
	int a= 10;
	//static varaible
	static int b = 20;

	public static void main(String[] args) {
		ObjectCreationStaticInsatnce osi = new ObjectCreationStaticInsatnce();
		//creating object first time
		System.out.println(osi.a);
		System.out.println(osi.b);
		//same object with trying to change the value of static varaible
		osi.a = 900;
		osi.b = 500;
		System.out.println(osi.a);
		System.out.println(osi.b);		//Successfully change the value
		
		//creating object second time
		ObjectCreationStaticInsatnce osi1 = new ObjectCreationStaticInsatnce();
		System.out.println(osi1.a);
		System.out.println(osi1.b);
		
		//Note : in instance varaiable for every object copy is there but incase of static varaible only single copy is there .
		//for instanc varaible when object is created copy of the instance varaible is created and for static varaible only one time copy is created and
		//that can be override again and again
		

	}

}
