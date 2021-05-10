package foundation;

public class RuntimeExam {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		
		System.out.println("사용 가능한 메모리: "+(runtime.totalMemory() - runtime.freeMemory())+"바이트");   // 총 메모리 - 사용 가능한 메모리 = 사용한 메모리
		
		
	}

}
