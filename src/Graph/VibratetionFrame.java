package Graph;

import javax.swing.JFrame;

public class VibratetionFrame extends JFrame{

	int x = 800;
	
	public VibratetionFrame() {
		setSize(200,300);
		
		setLocation(x, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new VibratetionFrame().setVisible(true);
	}
	
	private void vibrate() {
		new Thread(()->{
//			setLocation();
		});
	}
	
	
}
