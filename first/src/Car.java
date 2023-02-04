
public class Car {

	String name;
	int number;
	
	public void run() {
		System.out.println("running");
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car() {
//		this.number = 0;
//		this.name = "0 number";
		this("no number & no name");
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
