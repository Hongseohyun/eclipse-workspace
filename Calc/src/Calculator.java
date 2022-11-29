import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
 	private String[] labels = {
 			"Backspace","","","CE","C",
 			"7","8","9","/","sqrt",
 			"4","5","6","x","%",
 			"1","2","3","-","1/x",
 			"0","+/-",".","+","=",
 		
 	};
 	
 	public Calculator() {
 		tField = new JTextField(35);
 		tField.setText("0.");
 		tField.setEnabled(false);
 		add(tField, BorderLayout.NORTH);

 		panel = new JPanel();
 		panel.setLayout(new GridLayout(0,5,3,3)); //횡,열, 횡간픽셀, 열간
 		add(panel, BorderLayout.CENTER);

 		buttons = new JButton[25];
 		
 		int index = 0;
 		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else 
					buttons[index].setForeground(Color.blue);
				
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
 		}
		setVisible(true);
		pack();
 	}
  
	public static void main(String args[]) {
		Calculator cal = new Calculator();
}
}


