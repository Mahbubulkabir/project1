package classmethodobject;

//runnable class
class TestCalculator {

	//main method: provided by java
	public static void main(String[] args) {
		
		//object: instance of a class
		Calculator cal = new Calculator();
		
		//cal.addition();
		cal.multiplication(85, 65);
		
		int res1 = cal.subtraction();
		
		System.out.println(res1);
		
		int res2 = cal.division(25, 5);
		
		System.out.println(res2);
		
		cal.name();
		
		System.out.println(cal.name);
		
	}

}
