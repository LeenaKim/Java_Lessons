package kr.ac.kopo.day08;

public class Manager02 extends Employee{

	Employee[] empList;
	
	public Manager02() {
		/* Manager01의 부모클래스인 Employee의 디폴트 생성자가 Manaer01의 생성자에서 super()의 형태로 불러지는데,
		 * Employee에 디폴트 생성자가 없으면 에러가 나게 된다.
		 * 그래서 매개변수를 가진 생성자를 만들기 전에 항상 습관적으로 디폴트 생성자를 만들어줘야 한다. 
		 */
	}
	
	public Manager02(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary); // private 변수들을 끌어다쓸때는 밑의 변수들을 다 써주는것 대신, 처음부터 부모의 매개변수가 있는 생성자를 호출하면 되잖아? 
		/*
		this.no = no; // or, super.no = no; 라 써도 된다. 원칙은 super가 올바른데 객체를 만들때 부모 변수들에 대한 공간도 할당받기 때문에 this로도 접근할 수 있다. 
		this.name = name; // 근데 만약 부모클래스의 멤버변수가 private이면 this건 super건 안먹힌다. private은 가장 폐쇄적인 접근제한자기때문. 
		this.grade = grade;
		this.salary = salary;
		// 부모클래스 변수들을 끌어다 쓴다. 
		*/
		this.empList = empList;
		
	}
	
	public void info() {
		super.info(); // Employee의 info 메소드로 사원의 기본정보 출력 
		System.out.println("=================================================");
		System.out.println("\t\t< 관리 사원 목록 >");
		System.out.println("=================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("=================================================");
	}
	
}
