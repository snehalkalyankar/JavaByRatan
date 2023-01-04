package staticblock;

import javax.lang.model.element.Name;

//If you want to call static block inside main method which is present in another class 
//At that time you need to add Class.forName("ClassName");
public class StaticBlock {
	static {
		System.out.println("StaticBlock class");
	}

	public static void main(String[] args)  {
//		try {
//			Class cls=Class.forName("B");
//			ClassLoader cLoader = cls.getClassLoader();
//			
//			Class cls2 = Class.forName("java.lang.Thread", true, cLoader);
//	        System.out.println("Class = " + cls.getName());
//	         System.out.println("Class = " + cls2.getName()); 
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			   System.out.println(e.toString());
//		}
	
	}

}
