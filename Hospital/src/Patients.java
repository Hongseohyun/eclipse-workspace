import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.time.DayOfWeek;
import java.time.Month;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Patients extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patients frame = new Patients();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Patients() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1529, 1028);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_3 = new JMenu("Main");
		menuBar.add(mnNewMenu_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 0, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(475, 469, 1018, 479);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 18));
		textArea.setText("차트 내용을 입력하세요");
		textArea.setBounds(31, 101, 940, 318);
		panel_2.add(textArea);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(DayOfWeek.values()));
		comboBox.setToolTipText("2022");
		comboBox.setBounds(550, 39, 90, 37);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(Month.values()));
		comboBox_1.setToolTipText("2022");
		comboBox_1.setBounds(346, 39, 90, 37);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"sysdate"}));
		comboBox_2.setToolTipText("2022");
		comboBox_2.setBounds(244, 39, 90, 37);
		panel_2.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setToolTipText("2022");
		comboBox_3.setBounds(448, 39, 90, 37);
		panel_2.add(comboBox_3);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.setBounds(845, 433, 95, 23);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("병력 목록");
		lblNewLabel_3.setBounds(12, 29, 99, 47);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 18));
		
		
		
		JLabel lblNewLabel = new JLabel("환자 이름");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 19, 144, 40);
		panel.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("주민번호");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(12, 90, 99, 47);
		panel.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("주소");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(12, 168, 99, 47);
		panel.add(lblNewLabel_1_1);
		
		
		
		JLabel lblNewLabel_1_2 = new JLabel("전화번호");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(12, 254, 99, 47);
		panel.add(lblNewLabel_1_2);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(475, 10, 1018, 458);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("병력 추가");
		lblNewLabel_2.setBounds(12, 10, 134, 49);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 18));
		
		JLabel lblNewLabel_5 = new JLabel("질병 번호");
		lblNewLabel_5.setBounds(42, 69, 81, 15);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("질병 이름");
		lblNewLabel_6.setBounds(42, 147, 81, 15);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("치료 시작일");
		lblNewLabel_7.setBounds(42, 225, 104, 15);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("치료 종료일");
		lblNewLabel_8.setBounds(42, 303, 93, 15);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("증상");
		lblNewLabel_9.setBounds(42, 381, 81, 15);
		panel_1.add(lblNewLabel_9);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(793, 408, 95, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(911, 408, 95, 23);
		panel_1.add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setBounds(135, 53, 197, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 134, 197, 28);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 215, 197, 28);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 296, 197, 28);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 377, 197, 28);
		panel_1.add(textField_4);
		
		
		JLabel lblNewLabel_1_3 = new JLabel("비고");
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(12, 342, 99, 47);
		panel.add(lblNewLabel_1_3);
		
		JButton btnNewButton_1 = new JButton("저장");
		btnNewButton_1.setBounds(320, 417, 95, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("수정");
		btnNewButton_3.setBounds(213, 417, 95, 23);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("병력 조회");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(12, 499, 99, 40);
		panel.add(lblNewLabel_4);
		
		
		
		JList list = new JList();
		list.setBounds(24, 567, 391, 333);
		panel.add(list);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"yy/mm/dd"}));
		comboBox_4.setBounds(124, 509, 144, 30);
		panel.add(comboBox_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(168, 19, 197, 28);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(168, 100, 197, 28);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(168, 181, 197, 28);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(168, 262, 197, 28);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(168, 343, 197, 28);
		panel.add(textField_9);
	}

}
