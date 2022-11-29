import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExamAction extends JFrame {
	JButton btnHello;
	JLabel lblMessage;
	
	ExamAction(){
		btnHello = new JButton("확인");
		this.add(btnHello);
		
		lblMessage = new JLabel();
		this.add(lblMessage, BorderLayout.SOUTH);
		
		btnHello.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("안녕하세요!");
				lblMessage.setText("안녕하세요!");
			}
		});
		
		this.setSize(500, 500);
		this.setTitle("Action Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExamAction();
	}

}
