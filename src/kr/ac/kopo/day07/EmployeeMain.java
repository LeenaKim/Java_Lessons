package kr.ac.kopo.day07;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 총 직원의 수를 세려고 하는데, 객체를 생성할때마다 ++해줄수도 있지만, 그럴 경우 이 totalEmployeeCnt 지역변수가 Employee 객체들과 관계가 있다는걸 아무도 모름.
		 * 클래스에 멤버변수로 만들어주자.  
		int totalEmployeeCnt = 0;
		*/
		
		Employee e = new Employee("홍길동", 3500);
		Employee e2 = new Employee("강길동", 4200);
		// 멤버변수가 private이기때문에 생성자가 빛을 발하는 것이다. private이 아니었다면 e.name = "홍길동"; 처럼, 밖에서 바로 멤버변수에 접근할 수 있기 때문. 
		
		e.info();
		e2.info();
		
		/*
		System.out.println("입사한 총 사원 수 : " + e2.totalEmployeeCount + "명");
		- int totalEmployeeCount 일 때 : 그렇게 클래스에 멤버변수로 하고 생성자가 호출될때마다 ++ 해봤는데 2명이 아니라 1명으로 나옴. 왜?
		- e와 e2가 따로따로 멤버변수가 저장되서 e의 totalEmployeeCount가 0에서 1로 변하고, e2도 똑같이 0에서 1로 증가했기 때문. 
		- 이럴 경우를 위해 static 변수가 있다. 하나의 메모리공간을 여러개의 객체가 공유할 때.
		- static totalEmployeeCount가 2가 되고 후에 호출할때는 어떤 객체를 쓰던 2가 찍힌다. 왜? 모든 객체가 공유하는 변수니까. 
	
		System.out.println("입사한 총 사원 수 : " + Employee.totalEmployeeCount + "명");
		- 하지만 static 변수의 경우 어느시점에 접근할지 모르기때문에 객체보다는 클래스명.static변수로 접근한다. 그래야 개발자가 이건 static 변수라는걸 안다. 
		- 이렇게 클래스명으로 접근해야 객체가 없이도 아무때나 접근할 수 있다. 
		- 멤버변수를 private으로 바꿔주면 totalEmployeeCount에 에러가 생기는데, 그 이유는 메인메소드는 EmployeeMain 클래스고 멤버변수의 클래스는 Employee로, 같은 클래스내가 아니기 때문에 private 변수에 접근할 수 없기 때문이다.
		- 그래서 Employee 클래스 내에서 아예 totalEmployeeCount를 출력하는 메소드를 생성해준다. 
		
		*/
		
		e2.totalEmployeeInfo();
		// 그런데 이렇게되면 객체를 생성하지 않아도 호출할 수 있었던 static변수 totalEmployeeCount의 의미가 없어지지 않냐? 
		// 그래서 메소드도 객체없이 접근하기 위해 static 변수를 사용한 static 메소드로 선언해준다. 
		
		Employee.totalEmployeeInfo();
		// cf) nonstatic 메소드에서 static 변수를 호출하는건 괜찮다. nonstatic 메소드는 객체를 통해 호출되는데, static 변수는 이미 그 전부터 클래스가 작동될때부터 만들어지기 때문. 
	}

}
