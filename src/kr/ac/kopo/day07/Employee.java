package kr.ac.kopo.day07;

public class Employee {
	// 멤버변수는 private으로 해준다. 
	private String name; // 사원명 
	private int salary; // 연봉 
	private static int totalEmployeeCount; // 총 사원수 
		// 클래스가 생성될때부터 static 변수인 totalEmployeeCount가 0으로 만들어짐. - MethodArea에 공간 할당. 
	
	public Employee() {
		totalEmployeeCount++;		
	}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		totalEmployeeCount++;
	}
	
	public void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원");
	}
	
	public static void totalEmployeeInfo() {
		// name = "윤길동"; => 불가능하다. 왜? static 형성 시점이 nonstatic보다 빠르기 때문에 static 메소드가 호출되는 시점에 nonstatic도 생성되있을거란 보장이 없다. 
		System.out.println("입사한 총 사원수 : " + Employee.totalEmployeeCount + "명");
	}
}
