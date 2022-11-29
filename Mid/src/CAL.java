import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CAL extends JFrame {
	JPanel panel;
	JTextField tf;
	JButton[] btn;
	String[] label = {
			"backspace","","","","",
			"7","8","9","","",
			"4","5","6","","",
			"1","2","3","","",
			"0","","","","=",
	};
	
	CAL(){
		tf = new JTextField(35);
		tf.setText("0.");
		tf.setEnabled(false);
		add(tf,BorderLayout.NORTH);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,5,3,3));
		add(panel,BorderLayout.SOUTH);
		
		btn = new JButton[25];
		int i =0;
		for(int row=0;row<5;row++) {
			for(int col=0;col<5;col++) {
				btn[i]= new JButton(label[i]);
				if(col>=3) btn[i].setForeground(Color.red);
				else btn[i].setForeground(Color.blue);
				btn[i].setBackground(Color.pink);
				panel.add(btn[i]);
				i++;
			}
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		
		
	}
	public static void main(String[] args) {
		new CAL();
	}

}
