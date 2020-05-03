package kr.ac.kopo.day08.extend;
// source -> generate로 생성자와 게터 세터 만들기 
public class Employee {
	
	private int no;
	private String name;
	private String grade;
	private int salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int no, String name, String grade, int salary) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("사원번호 : " + no + ", 사원명 : " + name + ", 직급 : " 
							+ grade + ", 연봉 : " + salary + "만원");
	}
	
}
