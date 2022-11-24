package switchstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		
		String day = "guig";
		
		switch(day) {
			case "Mon":
				System.out.println("this is the first day of the week");
				break;
			case "Tue":
				System.out.println("this is the second day of the week");
				break;
			case "Wed":
				System.out.println("this is the third day of the week");
				break;
			case "Thu":
				System.out.println("this is the fouth day of the week");
				break;
			case "Fri":
				System.out.println("this is the fifth day of the week");
				break;
			case "Sat":
				System.out.println("this is the sixth day of the week");
				break;
			case "Sun":
				System.out.println("this is the seventh day of the week");
				break;
			default:
				System.out.println("this entry is invalid");
				
		}

	}

}
