package edu.kh.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCExample2 {

	public static void main(String[] ars) {
		
		// 1단계 : JDBC 객체 참조변수 생성(jave.sql)
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		try {
			// 2단계 : 참조변수에 알맞은 객체 대입 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String type ="jdbc:oracle:thin:@"; // JDBC 드라이버 종류 
			String ip = "localhost"; // DB 서버 컴퓨터 IP // == 127.0.01(loop back ip)
			
			String port =":1521"; // 포트번호
			// 1521(기본값)
			
			String sid = ":XE"; // DB 이름
			
			String user = "kh"; // 사용자 계정

			String pw = "kh1234"; // 비밀번호
			
			
			conn = DriverManager.getConnection(type+ip+port+sid, user, pw);
			
			System.out.println("<입력 받은 급여보다 많이 받는 직원만 조회>");
			System.out.printf("급여 입력 : ");
			
			int input = sc.nextInt();
			
			String sql = "SELECT EMP_ID, EMP_NAME, SALARY FROM EMPLYOEE WHERE SALARY >" + input;
		
			stmt = conn.createStatement();
			
			stmt.executeQuery(sql);
			
			rs = stmt.executeQuery(sql);
			
			// 3 단계 : SQL을 수행해서 반환받은 결과(ResultSet)를 
			// 한행씩 접근해서 컬럼값 얻어오기 
			
			
			while(rs.next()) {
				
				String empId = rs.getString("EMP_ID");
				String empName = rs.getString("EMP_NAME");
				int salary = rs.getInt("salary");
				
				   System.out.printf("사번 : %s / 이름 : %s / 급여 : %d \n" 
						   ,empId,empName, salary);
				
				
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}finally {
			// 4단계 : 사용한 JDBC 객체 지원 반환 
			
			try {
				
				
				if(rs !=null) rs.close();
				if(stmt !=null)stmt.close();
				if(conn !=null)conn.close();
				
				
				
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			
			
			
			
			
			
		}
		
		
	}
	
	
}
