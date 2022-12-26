package demo;

public class DefaultDataType {
	 boolean t;
	   byte b;
	   short s;
	   int i;
	   long l;
	   float f;
	   double d;
	   char ch;
/*
 * here we are printing the default value variable
 */
	 void display() {
		 
		 System.out.println(t);
		 System.out.println(b);
		 System.out.println(s);
		 System.out.println(i);
		 System.out.println(l);
		 System.out.println(f);
		 System.out.println(d);
		 System.out.println(ch);
	 }
	   public static void main(String[] args) {
		   DefaultDataType d = new DefaultDataType();
	      System.out.println("Displaying initial values...");
	      d.display();
	   }

}
