package kr.ac.kopo.day08;

public class Employee {

	protected int no;			// 사원번호
	protected String name; 	// 사원명 
	protected String grade;	// 직급
	protected int salary;		// 연봉 
	
	public Employee() {
		System.out.println("Employee 생성자 호출... ");
	}
	
	public Employee(int no, String name, String grade, int salary) {
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("사원번호 : " + no + ", 사원명 : " + name + ", 직급 : "
				+ grade + ", 연봉 : " + salary + "만원");
	}
	
	public int getNo() {
		return no;
	}
}
