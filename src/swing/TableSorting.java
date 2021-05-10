package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableSorting extends JFrame{
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane scrollPane;
	
	public TableSorting() {
		setSize(400,300);
		model = new DefaultTableModel(new Object[][] {{"A",1},{"C",3},{"B",2},{"D",4}},"Eng,Num".split(","));
		table = new JTable(model);
		table.setAutoCreateRowSorter(true);
		scrollPane = new JScrollPane(table);
		add(scrollPane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		new TableSorting().setVisible(true);
	}

}
