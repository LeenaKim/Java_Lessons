package kr.ac.kopo.day15;

import java.io.Serializable;

/*
 * VO 클래스(Value Object)
 * - 변수나 값만을 저장하는 클래스
 * 
 *  alt + shift + s (모든 단축키의 기본)를 누른 후 c 선택	: 기본 생성자
 *  										o 선택	: 매개변수 생성자 
 *  										r 선택	: getter/setter 메소드 
 *  										s 선택	: toString() 메소드
 *  										v 선택	: override 메소드 자동완성 ß
 */
public class UserInfo implements Serializable { // Serializable 인터페이스를 상속받기만하면 io에서 객체들을 직렬화시켜서 stream통로에 데이터를 내주고 빼줄수있게 해준다. 
	
	private 			String name;
	private transient	int age; // transient : 객체직렬화에서 해당 필드는 제외된다. 
	private 			String addr;
	
	UserInfo() {}
	
	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
