package lambda;

@FunctionalInterface
public interface Functional {
	
	public boolean equals(Object obj); // Object 클래스에 있는 메서드는 인터페이스에 선언해도 Functional Interface에 지장을 주지 않음
	public void execute(); // Object 클래스의  메소드를 제외하고 하나의 추상 메서드만 선언되어 있는 경우 Functional Interface 임
	
}
