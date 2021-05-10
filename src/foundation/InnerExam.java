package foundation;


public class InnerExam {
	public static void main(String[] args) {

	}
	class Inner{
		int vluae = 0;
	}
}







class Outer{
	public Outer() {
		/*
		 *	InnerExam ie = new InnerExam();
		 *  InnerExam.Inner inner = ie.new Inner();
		 *  ↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘↘
		 */
		InnerExam.Inner inner = new InnerExam().new Inner();
	}
}
