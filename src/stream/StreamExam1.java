package stream;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.Stream;

public class StreamExam1 {

	public static void main(String[] args) {
		new Random().ints(4).forEach(System.out::println); // 특정 타입의 난수로 이루어진 스트림 생성
//		Iterator iter = new Random().ints(4).iterator();
//		while(iter.hasNext())
//			System.out.println(Math.abs((int) iter.next())%4);  //랜덤한수 4개 구하기 
		
		// Stream<Object> stream = Stream.empty();
		System.out.println(Stream.empty().count()); //아무 요소도 가지지 않는 빈 스트림 생성
	}

}
