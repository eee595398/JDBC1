package edu.kh.jdbc1.model.vo;

// VO(Value Object) : 값 저장용 객체( 저장된 값을 읽는 용도로 사용)
// -> 비슷한 단어 DTO( Data Transfer Object) : 데이터를 교환하느 용도의 객체(값을 읽고, 쓰고하는 용도)


public class Emp { //DB에서 조회된 사원 한명(1행)의 정보를 저장하는 객체

	private String emepName;
	private String deptTitle;
	private int salary;
	
	private String hireDate;
	private char gender; // 남자 m 여자 f
	
	
	public Emp() {
		
	}

	public Emp(String emepName, String deptTitle, int salary) {
		super();
		this.emepName = emepName;
		this.deptTitle = deptTitle;
		this.salary = salary;
	}

	public String getEmepName() {
		return emepName;
	}

	public void setEmepName(String emepName) {
		this.emepName = emepName;
	}

	public String getDeptTitle() {
		return deptTitle;
	}

	public void setDeptTitle(String deptTitle) {
		this.deptTitle = deptTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "이름 : "+ emepName + " / 부서명 :" + deptTitle + " / 급여 : " + salary ;
	} 
	
	
	
}
