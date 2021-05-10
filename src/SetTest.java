import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			set.add(i);
		}
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
