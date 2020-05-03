package kr.ac.kopo.day06;

public class Member {
	// 기본적인 순서는 멤버변수 - 생성자 - 메소드 순으로 정의함. 
	String name;		// 이름 
	int age;			// 나이 
	String bloodType;	// 혈액
	
	// < 방법 3 > "알수없음"의 횟수를 줄이면서 좀 더 효율적으로 호출하게 된다. 하지만 사실 이렇게 매개변수의 개수에 따라 생성자를 여러개 만드는 일은 흔치 않다. 
	Member() {
		this("알수없음");
	}
	
	Member(String name){
		this(name, -1); // 멤버변수 두개짜리가 세개짜리를 호출하기때문에 한개짜리가 두개짜리를 호출하면 세개짜리도 호출된다. 
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType){
		// 멤버변수의 name에 입력인자로 받은 지역변수 name을 대입해라. 
		this.name = name; // this를 써주지 않게되면 자바에서는 지역변수의 변수가 우선이다. 그 후 멤버변수. 
		this.age = age;
		this.bloodType = bloodType;
	}
	
	/* < 방법 2 >
	Member() {
		this("알수없음", -1, "알수없음"); // 또하나의 this 규칙 : 생성자는 멤버변수를 초기하는게 목적이기 때문에 this는 생성자의 첫 라인에 위치해야 한다. 그래서 밑의 출력문과 this 생성자의 위치를 바꾸게 되면 에러가 난다. 
		System.out.println("!!!");
	}
	
	Member(String name) {
		this(name, -1, "알수없음");
	}
	
	Member(String name, int age){
		// this 생성자 : 오직 생성자 내에서만 호출가능하다. 
		this(name, age, "알수없음"); // 밑에 세 매개변수를 받는 생성자만 있으면 두개, 한개를 받는 경우는 없어도 되지 않나? 그럼 밑에 생성자를 호출하면 되지 않을까?
		// 에러가 남. 왜? Member(name, age, "알수없음")은 객체를 생성하는 방법인데 밑에 메소드하고는 같은 클래스에 있잖아. 이 방식은 new를 통해 인스턴스 객체를 만들때만 가능하다. 
		// 이럴땐 만들어져있는 인스턴스 객체 m3에 다른 생성자로 초기화하는것이 목적이라 만들어져있는 객체를 의미하는 this를 붙여준다. 

	}
	
	Member(String name, int age, String bloodType){
		// 멤버변수의 name에 입력인자로 받은 지역변수 name을 대입해라. 
		this.name = name; // this를 써주지 않게되면 자바에서는 지역변수의 변수가 우선이다. 그 후 멤버변수. 
		this.age = age;
		this.bloodType = bloodType;
	}
	 */
	
	
	/* < 방법 1 >
	Member() {
		name = "알수없음";
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name) {
		this.name = name;
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType){
		// 멤버변수의 name에 입력인자로 받은 지역변수 name을 대입해라. 
		this.name = name; // this를 써주지 않게되면 자바에서는 지역변수의 변수가 우선이다. 그 후 멤버변수. 
		this.age = age;
		this.bloodType = bloodType;
	}
	*/
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + (age == -1 ? "알수없음" : age) 
				+ ", 혈액형 : " + bloodType);
	}
}
