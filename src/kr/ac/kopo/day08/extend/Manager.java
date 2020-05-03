package kr.ac.kopo.day08.extend;

public class Manager extends Employee {

	private Employee[] empList;
	
	public Manager() {
		super();
	}

	public Manager(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary);
		this.empList = empList;
	}

	public Employee[] getEmpList() {
		return empList;
	}

	public void setEmpList(Employee[] empList) {
		this.empList = empList;
	}
	@Override 
	public void info() {
		// 부모메소드 오버라이딩 
		super.info();
		System.out.println("======================================================");
		System.out.println("\t\t< 관리 사원 목록 >");
		System.out.println("======================================================");
		for( Employee e : empList ) {
			e.info();
		}
		
		System.out.println("======================================================");
	}
	
}
