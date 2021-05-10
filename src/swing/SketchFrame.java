package swing;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class SketchFrame extends JFrame {
	
	public SketchFrame() {
		setTitle("Painter");
		setSize(250,300);
		setLayout(null);
		
		JPanel signPanel = new JPanel();
		signPanel.setBackground(Color.white);
		signPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				signPanel.getGraphics().fillOval(e.getX(), e.getY(), 8, 8);
			}
		});
		signPanel.setBounds(0,0,250,220);
		
		JButton btn = new JButton("확인");
		btn.addActionListener(e->{
			JOptionPane.showMessageDialog(null, "서명되었습니다.","메시지",JOptionPane.INFORMATION_MESSAGE);
			signPanel.repaint();
		});
		btn.setBounds(100,230,60,30);
		
		add(signPanel);
		add(btn);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new SketchFrame();
	}

}
