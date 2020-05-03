package kr.ac.kopo.day08;

public class Manager {

	int no;
	String name;
	String grade;
	int salary;
	/* => 위의 4개의 변수는 Employee 클래스의 멤버변수와 같음. 왜? 매니저도 사원의 한 형태니까.
	 그래서 매니저는 사원이 갖고있는 특징을 모두 가지면서 자기가 관리하는 사원 배열을 추가로 더 가지고 있을 뿐임. -> Kind a 패턴. (=is-a 패턴) 
	*/
	Employee[] empList; // 관리사원목록
	
	public Manager(int no, String name, String grade, int salary, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
		this.empList = empList;
	}
	
	public void info() {
		System.out.println("사원번호 : " + no + ", 사원명 : " + name + ", 직급 : " + grade 
				+ ", 연봉 : " + salary + "만원");
		System.out.println("=================================================");
		System.out.println("\t\t< 관리 사원 목록 >");
		System.out.println("=================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("=================================================");
	}
}
