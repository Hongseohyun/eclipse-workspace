import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonWindow extends JFrame {

	public ButtonWindow() {
		JButton btnHello = new JButton("안녕하세요!!");
		add(btnHello);
		
		setTitle("01이 만든 윈도우");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {

		new ButtonWindow();
	}

}
