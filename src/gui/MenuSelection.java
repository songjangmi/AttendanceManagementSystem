package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	public  MenuSelection() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		JLabel label=new JLabel("Menu Selection");
		
		JButton button1=new JButton("Add addStudent");
		JButton button2=new JButton("view Subjects");
		JButton button3=new JButton("Edit Subjects");
		JButton button4=new JButton("Delete Subjects");
		JButton button5=new JButton("Exit");
		
		panel.add(label);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
}
