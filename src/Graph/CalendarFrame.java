package Graph;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;

import javax.swing.JButton;
//import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalendarFrame extends JFrame{
	
	LocalDate now = LocalDate.now();
	LocalDate date = LocalDate.of(now.getYear(), now.getMonthValue(), 1);
	JPanel centerPanel = new JPanel(new GridLayout(0,7));
	

	public CalendarFrame() {
		setSize(500,500);
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel(new FlowLayout());
		
		northPanel.add(createButton("Down", e->{
			date = date.plusMonths(-1);
			setCalendar();
			centerPanel.repaint();
			centerPanel.revalidate();
		}));
		
		northPanel.add(createButton("Up", e->{
			date = date.plusMonths(1);
			setCalendar();
			centerPanel.repaint();
			centerPanel.revalidate();
		}));
		
		setCalendar();
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(northPanel,BorderLayout.NORTH);
		add(centerPanel,BorderLayout.CENTER);
		
	}
	
	private void setCalendar() {
		centerPanel.removeAll();
		boolean bool = false;
		String dayOfWeek[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		for(int i=0;i<date.lengthOfMonth();i++) {
			if(!bool) {
				if(dayOfWeek[i%7].equals(String.valueOf(date.getDayOfWeek()))) {
					i=0;
					bool = true;
				}
			}
			if(bool) {
				centerPanel.add(new JButton(i+1+""));
			}else {
				centerPanel.add(new JPanel());
			}
		}

	}
	
	private JButton createButton(String text,ActionListener act) {
		JButton button = new JButton(text);
		button.addActionListener(act);
		return button;
	}
	
	
	public static void main(String[] args) {
		new CalendarFrame().setVisible(true);
	}
}
