package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Demo {
	public static void show() {
		System.out.println("信息管理系统");
		System.out.println("1插入");
		System.out.println("2删除");
		System.out.println("3查询");
		System.out.println("4导出");
		System.out.println("请选择你需要的操作：");
	}
	public static Connection getConn() {
		Connection conn=null;

			String url="jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=GBK";
			String user="root";
			String pwd="123456";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(url,user,pwd);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		return conn;
	}
	
	public static void save(Student student) throws SQLException {
		Connection conn = getConn();		
		String sql = "insert into student(name,sex,age,telephone) values(?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, student.getName());
		ps.setString(2, student.getAge());
		ps.setString(3, student.getSex());
		ps.setString(4, student.getTelephone());
		ps.executeUpdate();
		ps.close();
	}

	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		show();
		Student s = new Student();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();

/*
 * 
 */
		while(key!=5) {
			switch (key) {
			case 1:
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("姓名");
				s.setName(scanner2.nextLine());
				System.out.println("年龄");
				s.setAge(scanner2.nextLine());
				System.out.println("性别");
				s.setSex(scanner2.nextLine());
				System.out.println("电话");
				s.setTelephone(scanner2.next());
				save(s);
				break;
			default:
				System.out.println("退出系统");
				break;
			}
			show();
			key = scanner.nextInt();
			/* switch end*/
		}
		
	}
	

}