package condition;

public class IfStatement {

	public static void main(String[] args) {

		int a = -5;
		
		if (10 == 10) {
			System.out.println("the 2 numbers are equal");
		}
		
		int b = 7;
		if(b % 2 == 0) {
			System.out.println("this number is even");
		}else {
			System.out.println("this number is odd");
		}
		
		if(a > 0) {
			System.out.println("this number is positive");
		}else if(a < 0) {
			System.out.println("this number is negative");
		}else {
			System.out.println("this number equals to 0");
		}

	}

}
