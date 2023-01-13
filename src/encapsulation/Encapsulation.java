package encapsulation;

public class Encapsulation {
	 private int age;
	 private String name;
	 
	 public int getAge() {
		 return age;
		 
	 }

	
	 public String getName() {
		return name;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
		 
	 }
	 public void setAge(int age) {
		 this.age = age;
		 
	 }
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setAge(10);
		e.setName("snehal");

	}

}
