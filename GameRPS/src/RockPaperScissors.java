import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RockPaperScissors extends JFrame implements ActionListener {
	final int SCISSORS =1;		//상수
	final int ROCK =2;			
	final int PAPER =3;			
	int computer;				//컴퓨터가 낼 값을 저장하는 변수 

	JLabel lblMessage, lblResult;	//상단 안내 메세지를 출력할 라벨과 하단 결과메세지를 출력할 라벨 선언
	JPanel panel;					//패널 선언
	JButton btnS, btnR, btnP;		//버튼 선언
	
	Random random;					//랜덤 변수 선언
	
	RockPaperScissors(){			//클래스 이름과 일치하는 생성자 만들기
		
		random = new Random();		//랜덤 인스턴스 생성
		
		lblMessage = new JLabel();	//라벨 인스턴스 생성
		lblMessage.setText("세개의 버튼중 하나를 선택하세요");	//입력될 텍스트 작성
		this.add(lblMessage, BorderLayout.NORTH);		//생성자에 더해줌 (라벨 메세지를, 북쪽에)
		
		panel = new JPanel();							//패널 인스턴스 생성
		panel.setLayout(new GridLayout(0,3));			//패널 0행 3렬로 설정
		
		btnS = new JButton("가위");						//버튼 세개 생성하고 패널에 더해줌
		panel.add(btnS);
		btnR = new JButton("바위");
		panel.add(btnR);
		btnP = new JButton("보");
		panel.add(btnP);
		
		this.add(panel,BorderLayout.CENTER);			//버튼들의 위치는 중앙으로 잡아줌
		
		lblResult = new JLabel();						//결과 인스턴스 생성
		lblResult.setText("결과");						//버튼을 누르기전에는 결과라고 출력되도록 
		this.add(lblResult,BorderLayout.SOUTH);			//하단에 위치하도록
		
		btnS.addActionListener(this);					//액션 리스너에 매개변수로 생성자를 넣어줌
		btnR.addActionListener(this);					//귀를 달아줌
		btnP.addActionListener(this);
		
		this.setTitle("가위 바위 보");						//윈도우 기본 설정 (타이틀, 사이즈, 닫기 설정, 보이기)
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new RockPaperScissors();		//생성자 호출
	}

	@Override
	public void actionPerformed(ActionEvent e) {		//어떤 액션을 취할지. 액션 퍼폼드가 발생했을 때 결과값을 액션 이벤트 e에 넣어줄것임

		computer = random.nextInt(3)+1;					//컴퓨터가 가위	바위 보를 랜덤으로 낼 수 있도록 1~3까지 출력
		
		if(e.getSource() == btnS)						//액션이벤트 e의 값이 버튼S인 경우 
			if(computer == SCISSORS)						//컴퓨터도 가위를 냈으면
				lblResult.setText("비겼습니다: "+computer);		//결과 문자가 비겼다고 출력됨
			else if (computer == ROCK)
				lblResult.setText("컴퓨터의 승리: "+computer);
			else if (computer == PAPER)
				lblResult.setText("당신의 승리: "+computer);
		if(e.getSource() == btnP)
			if(computer == SCISSORS)
				lblResult.setText("컴퓨터의 승리: "+computer);
			else if (computer == ROCK)
				lblResult.setText("당신의 승리: "+computer);
			else if (computer == PAPER)
				lblResult.setText("비겼습니다: "+computer);
		if(e.getSource() == btnR)
			if(computer == PAPER)
				lblResult.setText("당신의 승리: "+computer);
			else if (computer == ROCK)
				lblResult.setText("비겼습니다: "+computer);
			else if (computer == PAPER)
				lblResult.setText("컴퓨터의 승리: "+computer);
	}

}