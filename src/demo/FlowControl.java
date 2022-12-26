package demo;

public class FlowControl {
	/*
	 * There are 3 types of statement
	 * 1.conditional:if,if-else,switch
	 * 2.iteration:for,while,do-while
	 * 3.transfer:goto,break,continue,try,return
	 */

	public static void main(String[] args) {
//		if condition example:
		int a = 10;
		if(a == 10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		int c= 10;
		if(true) {						//if value always taken true or false not int
			System.out.println(true);
		}else {
			System.out.println(false);
		}
//		========================================================================
		
//		switch() int value,byte,short,char,enum[1.5],String[1.7] is allowed
	
//		switch(arg)
//		{
//		case 1 :
//			// statement 1;
//			break;
//		
//		case 2 :
//			//statement 2 ;
//			break;
//		case 3 :
//			//statement 3 ;
//			break;
//		default :
//			//statement ;
//			break;
//
//	}
		//Note we can pass expression also in case level
		//Example : 10+10	
		// duplicate case is not allowed
		//here both case and default are optional
		int x1 = 20;
		switch(x1) {
		case 10 :
			System.out.println("snehal");
			break;
		case 20 :
			System.out.println("Harish");
			break;
		case 20 + 10 :
			System.out.println("Ingole");
			break;
		default :
			System.out.println("Kalyankar");
			
			System.out.println("HEllo Snehal");
		}
		
//switch statement without case is not allowed
//		int x2 = 30;
//		switch(x2) {
//		System.out.println("hello");
//		}

}
}
