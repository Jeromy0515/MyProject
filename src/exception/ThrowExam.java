package exception;

public class ThrowExam {

	public static void main(String[] args) {
		try {
			throw new Exception(); // throw 키워드는 강제적으로 예외를 발생시킴 (자주 쓰진 않음)
		} catch (Exception e) {
			System.out.println("예외 발생!!");
		}
	}
}