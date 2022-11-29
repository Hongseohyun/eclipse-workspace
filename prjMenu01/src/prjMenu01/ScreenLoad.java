package prjMenu01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ScreenLoad extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public ScreenLoad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Load 화면");
		lblNewLabel.setBounds(111, 30, 191, 48);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 41));
		lblNewLabel.setBackground(UIManager.getColor("ToolBar.dockingForeground"));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("홈으로");
		btnNewButton.setBounds(163, 131, 95, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				hide();
				
			}
		});
	}

}
