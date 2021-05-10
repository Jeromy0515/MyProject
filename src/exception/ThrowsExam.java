package exception;

public class ThrowsExam {

	
	public static void main(String[] args) throws InterruptedException{ // main 메소드에 throws를 선언할 경우 JVM이 예외 처리함
		try { // 예외 처리
			func();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void func() throws Exception{ // throws 키워드는 메소드를 호출한 쪽에서 사용자가 직접 예외 처리를 해줘야함
		System.out.println("i'm called");
	}
	
	

}
