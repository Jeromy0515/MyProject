package foundation;

public class Closure {
	public static void main(String[] args) {	
		switch(1) {
		case 1 -> {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		}
		
		
		case 2 -> System.out.println(2);
		
		}
		
		int a = switch(1) {
		case 1:
			yield 6;
		case 2:
			yield 5;
		default:
			throw new IllegalArgumentException("Unexpected value: " + 1);
		};
		System.out.println(a);
	}

}
