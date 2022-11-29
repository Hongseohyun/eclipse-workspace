import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cal extends JFrame {
	JPanel panel;
	JTextField tf;
	JButton[] btn;
	String[] label= {
		"1","","","","c",	
		"1","","","","c",	
		"1","","","","",	
		"","","","","",	
		"","","","",""	
	};
	
	Cal(){
		tf = new JTextField(35);
		tf.setText("0.");
		tf.setEnabled(false);
		add(tf,BorderLayout.NORTH);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,5,3,3));
		add(panel,BorderLayout.CENTER);
		
		btn = new JButton[25];
		int i=0;
		for(int row =0;row<5;row++) {
			for(int col =0;col<5;col++) {
				btn[i]= new JButton(label[i]);
				if(col>3)
					btn[i].setForeground(Color.red);
				else
					btn[i].setForeground(Color.red);
				btn[i].setBackground(Color.yellow);
				panel.add(btn[i]);
				i++;
			}	
		}setVisible(true);
		pack();
	}
	public static void main(String[] args) {
		new Cal();
	}

}
