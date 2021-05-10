package foundation;

public class SwitchExpression {

	public static void main(String[] args) {
		
		int month = 1;
		
		String season = switch(month) {
		case 1,11,12 -> {yield "겨울입니다";}
		case 2,3,4 -> {yield "봄입니다";}
		case 5,6,7 -> {yield "여름입니다";}
		case 8,9,10 -> {yield "가을입니다";}
		default -> throw new IllegalArgumentException("Unexpected value: " + month);
		};
		
		System.out.println(season);
		
		
		
		
		
		
		
		
		int yield = 1234;
		
		
		
		
		
		
		
		
		
		
		
		// result: 겨울입니다
		 
	}

}
