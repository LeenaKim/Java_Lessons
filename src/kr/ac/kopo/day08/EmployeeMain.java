package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(1, "홍길동", "사원", 3500);
		Employee e2 = new Employee(2, "윤길동", "사원", 3700);
		Employee e3 = new Employee(3, "강길동", "대리", 4400);
		Employee e4 = new Employee(4, "김길동", "대리", 4500);
		Employee e5 = new Employee(5, "박길동", "과장", 5000);
		
		Employee[] empList = {e, e2, e4}; // 매니저가 관리하는 직원 배열 
		// Manager m = new Manager(100, "나캡틴", "부장", 8_000, empList); => 상속 안한 Manager 
		Manager02 m = new Manager02();
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		m.info();
	}

}
