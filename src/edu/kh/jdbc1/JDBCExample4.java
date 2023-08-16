package edu.kh.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.jdbc1.model.vo.Emp;



public class JDBCExample4 {
	
	public static void main(String ars[]) {
		Scanner sc = new Scanner(System.in);
		
	
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		
		
		try {
			System.out.println("직급명 : ");
			String input1 = sc.nextLine();
			System.out.println("급여 : ");
			int input2 = sc.nextInt();
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url ="jdbc:oracle:thin:@localhost:1521:XE"; // JDBC 드라이버 종류
			
			String user = "kh"; // 사용자 계정

			String pw = "kh1234"; // 비밀번호
			
			conn = DriverManager.getConnection(url, user, pw);
			
			
			String sql = "SELECT  EMP_NAME, JOB_NAME, SALARY, SALARY*12"
					+ "FROM EMPLOYEE"
					+ "JOIN JOB USING (JOB_CODE) '"+ input1 +"'"
					+ " WHERE JOB_NAME = '" 
					+ " AND SALARY > "+ input2;
					

			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			List<Emp>list = new ArrayList<>();
			
			
			while(rs.next()) {
				
				String empName = rs.getString("EMP_NAME");
				String jobname = rs.getString("JOB_NAME");
				int salary = rs.getInt("SALARY");
				int annualIncome = rs.getInt("ANNUAL_INCOME");
				
				
			 list.add(new Employe  (empName, jobname, salary,annualIncome));
				
			}
			
	
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			
			try {
				if(rs!=null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}
	
	

}
