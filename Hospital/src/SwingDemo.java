import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SwingDemo extends JFrame {
	   static String driver, url;
	   static Connection conn;
	   static Statement stmt;
	   static ResultSet rs;
	   static String tmpstr;
	   static String pstmt;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		dbConnect();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDemo frame = new SwingDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * DB연동
	 */
	public static void dbConnect() {
	       driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	       try{
	          Class.forName("com.mysql.jdbc.Driver");
	          System.out.println("드라이버 검색 성공!");        
	       }catch(ClassNotFoundException e){
	          System.err.println("error = " + e);
	       }
	        
	       
	        url = "jdbc:odbc:hospital";
	        conn = null;
	        stmt = null;
	        rs = null;
	        String url = "jdbc:mysql://localhost/hospital?useUnicode=yes&characterEncoding=UTF8"+ "";
	        String sql = "Select * From patient";
	      try {
	         
	            conn = DriverManager.getConnection(url,"root","apmsetup");

	            stmt = conn.createStatement( );

	            rs = stmt.executeQuery(sql);
	            
	            System.out.println("데이터베이스 연결 성공!");            
	         
	        }
	        catch(Exception e) {
	            System.out.println("데이터베이스 연결 실패!");
	        }
	   }
	

	
	public SwingDemo() {
		setTitle("종합 병원 관리 시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 792);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("의사용");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("작성 화면으로 이동");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Doctors().setVisible(true); //
			}
		});

		JMenu mnNewMenu_1 = new JMenu("간호사용");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("작성 화면으로 이동");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Doctors().setVisible(true); //
			}
		});

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("의사");
		btnNewButton.setBounds(269, 316, 277, 219);
		contentPane.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Doctors().setVisible(true); //
			}
		});

		JButton btnNewButton_1 = new JButton("간호사");
		btnNewButton_1.setBounds(622, 316, 277, 219);
		contentPane.add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Nurses().setVisible(true); //
			}
		});

		JLabel lblNewLabel = new JLabel("종합 병원 관리 시스템");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		lblNewLabel.setBounds(316, 121, 514, 115);
		contentPane.add(lblNewLabel);
	}
}