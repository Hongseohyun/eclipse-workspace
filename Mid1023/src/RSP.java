import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RSP extends JFrame implements ActionListener {
	final int S = 1;
	final int R = 2;
	final int P = 3;

	JPanel panel;
	JLabel msg, result;
	JButton btn1, btn2, btn3;
	Random ran;
	int comp;
	
	RSP(){
		ran = new Random();
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		add(panel,BorderLayout.CENTER);
		msg= new JLabel();
		msg.setText("ddd");
		add(msg,BorderLayout.NORTH);
		result= new JLabel();
		result.setText("ddd");
		add(result,BorderLayout.SOUTH);
		btn1 = new JButton("가위");
		panel.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("바위");
		panel.add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("보");
		panel.add(btn3);
		btn3.addActionListener(this);
		
		setTitle("dd");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RSP();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		comp = ran.nextInt(3)+1;
		if (e.getSource() == btn1) {
			if (comp == S)
				result.setText("비김");
			else if (comp == R)
				result.setText("짐");
			else
				result.setText("이김");
		}
		if (e.getSource() == btn2) {
			if (comp == S)
				result.setText("이김");
			else if (comp == R)
				result.setText("비김");
			else
				result.setText("짐");
		}
		if (e.getSource() == btn3) {
			if (comp == S)
				result.setText("짐");
			else if (comp == R)
				result.setText("이김");
			else
				result.setText("비김");
		}

	}

}
