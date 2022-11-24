package getstarted;

class GetStarted {

	public static void main(String[] args) {
		
		//this is one line comment
		System.out.println("Hello World");
		
		/*
		  this is a multiple
		  line comment
		 */
		
		//variables
		//numbers
		//whole number
		byte b = 127;//1 byte
		short a = 4455;//2 bytes
		int i = 41564741;//4 bytes
		long l = 456831465l;//8 bytes
		
		//fractions
		float f = 1.5245264538533354315454f;//4 bytes
		double d = 3.54646865354354313543513135135145546548;//8 bytes
		
		//character
		char c = '5';//2 bytes
		//chain of characters 
		String str = "4f";
		
		str = "Hello";
		
		//boolean
		boolean flag = true;//1 bit (1/8 byte)
		
		//declare variable
		int x;
		//declare multiple variables 
		int z, y, o, p;
		//assign variable
		x = 52;
		
		//you cannot reassign final variable
		final int n = 45;
		//n = 1;
		
		//System.out.print(x);
		
		//reassign variable
		x = 60;
		System.out.println(x);
		
		//byte > short > char > int > long > float > double
		
		int num1 = 10;
		int num2 = 15;
		
		double total = num1 + num2;
		
		System.out.println(total);
		
		//double > float > long > int > char > short > byte
		
		double num3 = 10.5;
		double num4 = 15.5;
		
		int total1 = (int)num3 + (int)num4;
		
		System.out.println(total1);

	}

}