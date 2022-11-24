package variables;

public class Array {

	public static void main(String[] args) {
		
		//declare and assign an array
		int[] array1 = {4,5,2,1};
		//access array values
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		
		//declare an array
		int[] array2 = new int[4];
		
		System.out.println("------------------------------------");
		
		//assign array values
		array2[0] = 4;
		array2[1] = 5;
		array2[2] = 2;
		array2[3] = 1;
		
		//access array value
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);

		
	}

}
