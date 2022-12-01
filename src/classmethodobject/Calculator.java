package classmethodobject;

//class is a blueprint
class Calculator {
	//global variable
	String name = "sharmin";
	
	//method or function: a block of code that is used only when it is called 
	
	//created methods
	//non-return method
	void addition() {
		//local variables
		int a = 20;
		int b = 20;
		int total = a + b;
	}
	void multiplication(int a, int b) {
		int total = a * b;
		System.out.println(total+name);
	}
	
	//return methods
	//byte, short, int, long, float, double, String, char, boolean, array...
	int subtraction() {
		int a = 50;
		int b = 25;
		int total = a - b;
		return total;
	}
	int division(int a, int b) {
		int total = a / b;
		return total;
	}
	
	//method recursion: a method that is calling itself 
	void name() {
		System.out.println("my name is Jack Sparrow");
		name();
	}
	
}
