package loops;

public class ForLoop {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 10; i++){
//			
//			System.out.println(i); 
//			
//			if(i == 6) {
//				break;
//			} 
//			
//		}
		
		for (int i = 0; i < 10; i++){
			
			if(i > 3 && i < 7) {
				break;
			} 
			
			System.out.println(i); 
			
		}
		
		System.out.println("-----------------------------------------");
		
		//for loop in an array
		int[] array = {4,5,2,1};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		System.out.println("-----------------------------------------");
		
		for(int i =0; i < 4; i++) {
			System.out.println(array[i]);
		}

	}

}
