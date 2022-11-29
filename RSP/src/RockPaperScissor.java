import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RockPaperScissor extends JFrame implements ActionListener {
	final int S=1;
	final int R=2;
	final int P=3;
	
	JPanel panel;
	JLabel msg, result;
	JButton btn1,btn2,btn3;
	Random ran;
	int comp;
	
	RockPaperScissor(){
		ran = new Random();
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		add(panel,BorderLayout.CENTER);
		
		msg= new JLabel();
		msg.setText("아래의 버튼 중에서 하나를 클릭하시오!");
		add(msg, BorderLayout.NORTH);
		result= new JLabel();
		result.setText("결과");
		add(result, BorderLayout.SOUTH);
		
		btn1 = new JButton("ROCK");
		btn1.addActionListener(this);
		panel.add(btn1);
		btn2 = new JButton("PAPER");
		btn2.addActionListener(this);
		panel.add(btn2);
		btn3 = new JButton("SCISSOR");
		btn3.addActionListener(this);
		panel.add(btn3);
		
		setTitle("가위, 바위, 보");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RockPaperScissor();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		comp = ran.nextInt(3)+1;
		if(e.getSource()==btn2) {//바위
			if(comp==S) {
				result.setText("비겼음");
			}
			if(comp==R) {
				result.setText("졌음");
			}
			if(comp==P) {
				result.setText("이겼음");
			}
		}
		if(e.getSource()==btn3) {//보
			if(comp==S) {
				result.setText("이겼음");
			}
			if(comp==R) {
				result.setText("비겼음");
			}
			if(comp==P) {
				result.setText("이겼음");
			}
		}
		if(e.getSource()==btn1) {//가위
			if(comp==S) {
				result.setText("비겼음");
			}
			if(comp==R) {
				result.setText("졌음");
			}
			if(comp==P) {
				result.setText("비겼음");
			}
		}
	}

}
