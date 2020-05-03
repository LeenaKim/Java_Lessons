package kr.ac.kopo.day08.homework.String;

public class IceCream {
	// 멤버변수는 private으로 해준다. 
	private String name;
	private int price;
	
	// 매개변수로 오버로드 하기전에 디폴트생성자를 만들어준다. 
	public IceCream() {}
	
	// 오버로드한 생성자로 입력값을 넘겨받아 매개변수로 할당해준다. 
	public IceCream(String name, int price) {
		this.name = name;
		this.price = price; // 이름과 가격이 입력할때마다 아이스크림 개수 + 1을 해준다. 
	}
	
	// getter과 setter - 멤버변수를 private으로 설정해주었기 때문에 외부클래스에서 접근하려면 별도의 메소드가 필요하다. 
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}

}
