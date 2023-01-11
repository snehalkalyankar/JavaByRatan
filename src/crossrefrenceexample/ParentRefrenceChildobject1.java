package crossrefrenceexample;

import overloading.Child;

public class ParentRefrenceChildobject1 extends ParentRefrenceChildobject {
	//overriding method
		void m1() {
			System.out.println("We are in child method m1");
		}
		void m2() {
			System.out.println("We are in child method m2");
		}
	public static void main(String[] args) {
		
		ParentRefrenceChildobject p = new ParentRefrenceChildobject1();
		p.m1();
		//if you calling m2 method then compiler go and check in parent whether m2 method is present or not
		//and if it doesn't contains the m1 method then error will be shown
//		p.m2();
		//still if you want to call m2() then do typ casting
		ParentRefrenceChildobject1 e1 = (ParentRefrenceChildobject1)p;
		e1.m2();
	}

}
