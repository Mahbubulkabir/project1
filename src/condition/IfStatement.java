package condition;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {

		
		
//		if (10 == 10) {
//			System.out.println("the 2 numbers are equal");
//		}
		
		System.out.println("please enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("this number is even");
		}else {
			System.out.println("this number is odd");
		}
		
		System.out.println("please enter another number");
		int b = sc.nextInt();
		if(b > 0) {
			System.out.println("this number is positive");
		}else if(a < 0) {
			System.out.println("this number is negative");
		}else {
			System.out.println("this number equals to 0");
		}

	}

}
