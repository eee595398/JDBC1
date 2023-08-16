package edu.kh.jdbc1.model.vo;

public class Employe {
	private String emepName;
	private String jobname;
	private int salary;
	private int annualIncome;
	private String hireDate;
	private char gender; // 남자 m 여자 f
	
	public Employe() {}

	public Employe(String emepName, String jobname, int salary, int annualIncome, String hireDate, char gender) {
		super();
		this.emepName = emepName;
		this.jobname = jobname;
		this.salary = salary;
		this.annualIncome = annualIncome;
		this.hireDate = hireDate;
		this.gender = gender;
	}

	public String getEmepName() {
		return emepName;
	}

	public void setEmepName(String emepName) {
		this.emepName = emepName;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employe [emepName=" + emepName + ", jobname=" + jobname + ", salary=" + salary + ", annualIncome="
				+ annualIncome + ", hireDate=" + hireDate + ", gender=" + gender + "]";
	}
	
	

}
