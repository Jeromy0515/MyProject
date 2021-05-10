package Graph;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GraphPanel extends JPanel{
	static Connection conn = null;
	static Statement statement = null;
	
	static {
		try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?serverTimezone=UTC","root","1234");	
		statement = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(2));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		try (ResultSet rs = statement.executeQuery("select count(*) as count from orderlist group by cuisineNo;")){
			while(rs.next()) {
				list.add(rs.getInt("count"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		int max = -1;
		for(int i=0;i<list.size();i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
			System.out.println(list.get(i));
			int w = (int) (((float) list.get(i) / max) * 300); // 32 10 9 8 300 90 80 70 
			
			g2d.drawRect(70 + (i * 65), (max-w)+300, 30, w); 
			g2d.setColor(Color.BLACK);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		GraphPanel graphPanel = new GraphPanel();
		frame.add(graphPanel);
		graphPanel.repaint();

		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
