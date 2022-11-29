package prjMenu01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExamMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamMenu frame = new ExamMenu();
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
	public ExamMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("screen");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Load");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ScreenLoad().setVisible(true);
				
			}
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Hide");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("ReShow");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_2_1);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_2_2 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2_2);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1_1);
		
		JMenuItem mntmNewMenuItem_2_1_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2_1_1);
		
		JMenu mnNewMenu_2 = new JMenu("Source");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Read");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ScreenRead().setVisible(true);
				
			}
		});
		
		
		JMenuItem mntmNewMenuItem_2_3 = new JMenuItem("Write");
		mnNewMenu_2.add(mntmNewMenuItem_2_3);
		
		JMenu mnNewMenu_3 = new JMenu("Project");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_2_4 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_2_4);
		
		JMenuItem mntmNewMenuItem_1_3 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_1_3);
		
		JMenuItem mntmNewMenuItem_2_1_3 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_2_1_3);
		
		JMenu mnNewMenu_3_1 = new JMenu("Run");
		menuBar.add(mnNewMenu_3_1);
		
		JMenuItem mntmNewMenuItem_5_1 = new JMenuItem("New menu item");
		mnNewMenu_3_1.add(mntmNewMenuItem_5_1);
		
		JMenuItem mntmNewMenuItem_2_4_1 = new JMenuItem("New menu item");
		mnNewMenu_3_1.add(mntmNewMenuItem_2_4_1);
		
		JMenuItem mntmNewMenuItem_1_3_1 = new JMenuItem("New menu item");
		mnNewMenu_3_1.add(mntmNewMenuItem_1_3_1);
		
		JMenuItem mntmNewMenuItem_2_1_3_1 = new JMenuItem("New menu item");
		mnNewMenu_3_1.add(mntmNewMenuItem_2_1_3_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
