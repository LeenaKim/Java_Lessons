package kr.ac.kopo.day13;

import java.util.HashMap;
import java.util.Map;

class Member {
	private String name;
	private String phone;
	
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	/*
	// equals() 메소드 오버라이드 
	@Override
	public boolean equals(Object obj) {
		
		Member m = (Member)obj; // if(name.equals(obj.name)) 이 안되는 이유 : obj타입으로 날라오는 아이는 member형. 날라오면서 object형으로 묵시적 형변환되기때문에 자식인 member의 멤버변수를 가져올 수 없다. 그래서 자식형으로 명시적 형변환이 필요하다.
		if(name.equals(m.name) && phone.equals(m.phone)) {	 
			return true;
		}
		return false;
		// 원래는 obj의 name과 phone이 null일 경우를 또 if-else 구문으로 잡아줘야한다. 
	}
	
	// hashCode() 메소드 오버라이드 
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.phone.hashCode();
	} // m과 m2의 해시코드가 같게된다. 
	*/ 

	// 위처럼 일일히 만들어주기 귀찮아서 이클립스에서는 source -> generate hashcode에서 메소드 오버라이드를 제공한다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}
	// 보통 1. hashCode, 2. equals(), 3. toString()은 기본적으로 오버라이드해준다. 
	
	
}

class Car {
	private String name;
	private String id; // 차량 번호 
	
	public Car(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> list = new HashMap<>();
		
		list.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "34거1456"));
		list.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "63나8843"));
		
		list.put(new Member("홍길동", "010-1111-2222"), new Car("K7", "53소3423")); // 홍길동이 차를 바꾸려한다. 
			// 원래 있던 key를 가지고 새 값을 줬으므로 map은 중복을 허용하지 않기때문에 수정 후에도 총 2대가 되야하지만, 총 3대라고 나옴. 왜? 위의 홍길동과 이번의 홍길동을 같은 아이로 보지 않는다. 
		System.out.println("등록된 차량대수 : " + list.size() + "대");
			/*
			 *  밑의 equals() 과정을 거치고 메소드 오버라이드를 해줫는데도 3대로 인식한다. 왜? 
			 * 자바에서는 equals()가 true이면서 해쉬코드가 같아야 같은 객체로 인식하기 때문. 
			 */
		
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		System.out.println("m == m2 : " + (m == m2)); // false라 나온다. 보통 == 연산자는 주소값이 같냐고 물어보는데, 두 인스턴스가 두번에 걸쳐 만들어졌으니 다를수밖에 없다.
													// 하지만 우리가 원하는건 두 객체를 같다고 여기도록 하고싶다. 즉, 주소값이 아니라 그 객체 안의 값이 같은지를 확인하고싶다. 
	
		// System.out.println(m.name.equals(m2.name) && m.phone.equals(m2.phone)); // 그런데, 멤버변수가 많아지면 너무나 귀찮아진다.
		
		
		// 그래서 모든 클래스를 상속하는 object클래스 내에 있는 equals() 메소드를 사용한다. object를 파라미터로 받아 boolean리턴. 즉, 모든 형(객체형도)이 들어올 수 있다.
		System.out.println("equals() : " + m.equals(m2)); // 실제 m 클래스에는 equals()라는 메소드가 없지만, 부모클래스인 object가 가진 equals 메소드를 상속받아 사용한다. 
			// 근데 오브젝트 클래스의 equals()도 this == object로, 주소값만을 비교하고 앉아있네? 우리는 객체 내의 name과 phone을 비교해야하는데?
			// object 왈, 아, 그럼 너넨 내 메소드를 입맛에 맞게 오버라이드해! (Members 클래스 내에서.) 그것이 바로 String의 equals(). String은 부모클래스인 object의 equals() 메소드를 오버라이딩해서 String.equals()를 사용하는 것. 
			// Member 클래스에서 Object의 equals()를 오버라이드해주니 true가 나온다. 객체들 내의 값들을 비교해줬기때문. 
		
		String str = "Hello World"; // str을 new로 할당하고(heap), 그렇지 않은 문자열(method area)은 서로 다르다. 
		String str2 = new String("Hello World");
		
		System.out.println("str == str2 : " + (str == str2)); 
		System.out.println("str equals() : " + str.equals(str2));
		System.out.println("str hashcode() : " + str.hashCode());
		System.out.println("str2 hashcode() : " + str2.hashCode()); // object를 상속받은것이 hashcode이기때문에 모든 객체는 해시코드를 가지고있다.
			// 해시코드가 같은것을 확인. 문자열 해시코드가 같은것처럼, 객체간의 해시코드도 같게해줘야한다. 문자열은 해시코드가 무조건 같지만 객체는 그렇지 않다. => 해시코드도 오버라이드해줘야함. 
	}
}
