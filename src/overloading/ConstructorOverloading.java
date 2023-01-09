package overloading;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("defualt constructor");
	}
	
	ConstructorOverloading(int a){
		System.out.println("one Parametrize constructor");
	}
	
	ConstructorOverloading(int c , int d){
		System.out.println("two Parametrize constructor");
	}
	
	ConstructorOverloading(char ch){
		System.out.println("char single parametrize constructor");
	}

	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(10);
		new ConstructorOverloading(10,20);
		new ConstructorOverloading('c');

	}

}
