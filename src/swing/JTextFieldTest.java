package swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldTest extends JFrame{
	
	public JTextFieldTest() {
		setLayout(new FlowLayout());
		setSize(500,500);
		
		JTextField jtf = new JTextField(15);
		jtf.setText("setEnabled(false)");
		jtf.setForeground(Color.red);
//		jtf.setEnabled(false);
		jtf.setEditable(false);
		jtf.setBackground(getForeground());
		add(jtf);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTextFieldTest();
	}

}
