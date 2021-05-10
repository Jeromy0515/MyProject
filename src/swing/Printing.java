package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Printing extends JFrame{
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane scrollPane;

	public Printing() {
		setSize(300,300);
		
		model = new DefaultTableModel(new Object[][] {{"A",1},{"B",2},{"C",3},{"D",4}},"Eng,Num".split(","));
		table = new JTable(model);
		scrollPane = new JScrollPane(table);
		
		JButton button = new JButton("Printing");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					table.print(JTable.PrintMode.FIT_WIDTH,new MessageFormat("Header"),new MessageFormat("Footer")); //JTable.PrintMode.FIT_WIDTH 테이블 전체를 출력하는 인쇄모드, 행이 많다면 여러 페이지로 나눠서 인쇄함, 
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		
		add(button,BorderLayout.NORTH);
		add(scrollPane,BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		new Printing().setVisible(true);
	}
}
