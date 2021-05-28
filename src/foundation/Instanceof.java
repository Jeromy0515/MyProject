package foundation;

class Parent{
	
}

class Child extends Parent{
	
}


public class Instanceof {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		/* 객체 instanceof 클래스(타입)  객체가 클래스(타입) 으로 형변환이 가능한지 여부를 true 또는 false로 반환해준다.*/
		System.out.println(parent instanceof Child); // false 
		System.out.println(child instanceof Parent); // true
	}
}
