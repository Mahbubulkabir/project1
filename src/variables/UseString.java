package variables;

public class UseString {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		
		String str2;
		str2 = "World";
		
		String str3 = new String();
		str3 = "new string";
		
		//String concatenation
		System.out.println(str1 + 1 + 1);
		System.out.println(str1 + str2 + 1);
		
		//string manipulation
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.charAt(3));
		System.out.println(str1.subSequence(1, 3));
		System.out.println(str1.replace("e", "1"));
		System.out.println(str1.length());
		System.out.println(str1.concat(str2));

	}

}
