class Human{
	String name;
	int height;
	int weight;
	
	public Human(String name,int height,int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	void print() {
		System.out.println("이름:" +name);
		System.out.println("키:" +height);
		System.out.println("몸무게:" +weight);
	}
	
}
public class Main {
	public static void main(String[] args) {
	}
}
