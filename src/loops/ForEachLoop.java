package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] array = {4,5,2,1};
		
		for(int a: array) {
			System.out.println(a);
		}
		
		String[] names = {"jack", "brad", "david"};
		for(String a: names) {
			System.out.println(a);
		}

	}

}
