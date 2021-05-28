import javax.swing.JFrame;

public class SwingExam extends JFrame{
	
	public SwingExam() {
		setSize(300,300); // setSize(width,height);
		setTitle("테스트"); // setTitle 창 타이틀명 결정
		setLocationRelativeTo(null); // 창을 가운데로 띄움
		setDefaultCloseOperation(EXIT_ON_CLOSE); // X버튼을 눌러서 창을 닫았을시 프로그램 종료
		setVisible(true); // 창을 띄울지 말지 여부를 결정
	}
	
	
	public static void main(String[] args) {
		new SwingExam();
	}
}	
