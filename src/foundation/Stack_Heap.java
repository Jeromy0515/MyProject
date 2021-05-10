package foundation;

public class Stack_Heap {
	public static void main(String[] args) { // Stack 메모리 영역은 Thread마다 각각 따로 가지고있다. Heap 영역은 모든 쓰레드가 접근할수있는 공유자원이 저장된다.
		int val = 100;
		
		new Thread() {
			int val2 = 1000;
			
			@Override
			public void run() {
				
			}
			
		};

		
		
	}

}
