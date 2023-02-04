import cruz_java.*;

public class HelloWorld {

	public static void main(String[] args) {
	
		
		Calculator calc = new MyCal();
		int a = Calculator.exec2(3, 7);
		int ab = calc.plus(3, 6);
		System.out.println(calc.multiple(3, 5));
		System.out.println(a);
		System.out.println(ab);
		
	}
}
