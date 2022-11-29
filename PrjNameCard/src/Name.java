import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Name extends JFrame implements ActionListener {

   static JLabel num, name, telNo,eMail,relation;
   static JTextField num_t, name_t, telNo_t,eMail_t,relation_t;
   JButton reloaddown, reloadup,save,update,delete;
   JPanel pan1, pan2, pan3, pan4,pan5,pan6;
   static String driver, url;
   static Connection conn;
   static Statement stmt;
   static ResultSet rs;
   static String tmpstr;
   static long count = 0;

   public Name(String title) {
      super(title);
      setLayout(new GridLayout(0, 1));
      num = new JLabel("번호");
      name = new JLabel("이름");
      telNo = new JLabel("전화");
      eMail = new JLabel("메일");
      relation = new JLabel("관계");
      
      num_t = new JTextField(20);
      name_t = new JTextField(20);
      telNo_t = new JTextField(20);
      eMail_t = new JTextField(20);
      relation_t = new JTextField(20);
      
      reloaddown = new JButton("<");
      reloaddown.addActionListener(this);
      reloadup = new JButton(">");
      reloadup.addActionListener(this);      
      save = new JButton("저장");      
      save.addActionListener(this);
      update = new JButton("수정");
      update.addActionListener(this);
      delete = new JButton("삭제");
      delete.addActionListener(this);

      pan1 = new JPanel();
      pan2 = new JPanel();
      pan3 = new JPanel();
      pan4 = new JPanel();
      pan5 = new JPanel();
      pan6 = new JPanel();

      pan1.add(num);
      pan1.add(num_t);
      pan2.add(name);
      pan2.add(name_t);
      pan3.add(telNo);
      pan3.add(telNo_t);
      pan4.add(eMail);
      pan4.add(eMail_t);
      pan5.add(relation);
      pan5.add(relation_t);
      pan6.add(reloaddown);
      pan6.add(reloadup);
      pan6.add(save);
      pan6.add(update);
      pan6.add(delete);

      add(pan1);
      add(pan2);
      add(pan3);
      add(pan4);
      add(pan5);
      add(pan6);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300,300);
      setVisible(true);

   }

   public static void dbConnect() {
       driver = "sun.jdbc.odbc.JdbcOdbcDriver";
       try{
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("드라이버 검색 성공!");        
       }catch(ClassNotFoundException e){
          System.err.println("error = " + e);
       }
        
       
        url = "jdbc:odbc:company";
        conn = null;
        stmt = null;
        rs = null;
        String url = "jdbc:mysql://localhost/company";
        String sql = "Select * From customer";
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

   public static void query(String order, String sql) throws SQLException {
      if (order == "select") {
         rs = stmt.executeQuery(sql);
      } 
      else {
         stmt.executeUpdate(sql);
      }
   }

   public static void viewData() throws SQLException {
      if(!rs.next()){
         System.out.println("!rs.next()");
         count--;
      }
      else{      
            System.out.println("rs.next()");
            num_t.setText(String.valueOf(rs.getInt("id")));
   
            name_t.setText(rs.getString("name"));
               
            telNo_t.setText(rs.getString("telNo"));
            
            eMail_t.setText(rs.getString("eMail"));
            
            relation_t.setText(rs.getString("relation"));
      }
   }

   public static void dbDis(){
      try {
         if (conn != null)
            conn.close();
         if (stmt != null)
            stmt.close();
         System.out.println("데이터베이스 연결 해제!");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }

   public static void main(String[] args) throws SQLException {

      new Name("명함관리"); 
      dbConnect(); //db연결
      query("select", "select * from customer where id = 1");
      count = 1;
      viewData();
      dbDis(); //db연결끊기

   }

   @Override
   public void actionPerformed(ActionEvent e) {
   
      if (e.getSource() == save) {
         dbConnect();
         try {
            query("insert", "insert into customer values(null,'"+name_t.getText()+"','"+telNo_t.getText()+"','"+eMail_t.getText()+"','"+relation_t.getText()+"')");
            
         } catch (Exception e1) {
            e1.printStackTrace();
         }         
         System.out.println("새항목 추가완료");
         dbDis();

         num_t.setText("");
         name_t.setText("");
         telNo_t.setText("");
         eMail_t.setText("");
         relation_t.setText("");
      } 
      else if (e.getSource() == reloaddown) {
         int a = Integer.parseInt(num_t.getText());
         dbConnect();
         try   {

            count--;
            if(count < 1){
               System.out.println("count error");
               count++;
            }
            num_t.setText(String.valueOf(count));
            query("select", "select * from customer where id = " +count + "");
            viewData();
            System.out.println("데이터베이스 로드완료");
            
         } catch (Exception e1) {
            e1.printStackTrace();
         }
         dbDis();
      }
      else if (e.getSource() == reloadup) {
         int a = Integer.parseInt(num_t.getText());
         dbConnect();
         try {
            count++;
            num_t.setText(String.valueOf(count));
            query("select", "select * from customer where id = " +count + "");
            viewData();
            System.out.println("데이터베이스 로드완료");
            
         } catch (Exception e1) {
            e1.printStackTrace();
         }
         dbDis();
      }
      else if (e.getSource() == update) {
         int a = Integer.parseInt(num_t.getText());
         dbConnect();
         try {
            query("update", "update customer set telNo = '" + telNo_t.getText() + "' , name = '" + name_t.getText() + "' where id = " + count + "");
            //viewData();
            System.out.println("데이터베이스 수정완료");
            
         } catch (Exception e1) {
            e1.printStackTrace();
         }
         dbDis();
      }
      else if (e.getSource() == delete) {
         int a = Integer.parseInt(num_t.getText());
         dbConnect();
         try {
            query("delete", "delete from customer where id = " +num_t.getText() + " ");
            //viewData();
            System.out.println("데이터베이스 삭제완료");
            
         } catch (Exception e1) {
            e1.printStackTrace();
         }
         dbDis();
      }
   }
}