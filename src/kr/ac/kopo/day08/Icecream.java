package kr.ac.kopo.day08;

public class Icecream {
	
	private String name;
	private int price;
	/**
	 * name, price값으로 초기화하는 생성자. 
	 * @param name 설정할 아이스크림명 
	 * @param price 설정할 아이스크림 가격 
	 */
	public Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	} // private을 통해 Icecream 클래스를 만든 개발자가 자기가 만든 멤버변수에 대한 제어권을 가지고있다.=> 은닉성  
	
	/**
	 * 아이스크림 정보를 출력 
	 */
	public void info() {
		System.out.println("아이스크림명 : " + this.name + ", 가격 : " + this.price);
	}
	/**
	 * 아이스크림명을 알려주는 메소드 
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 아이스크림 가격을 알려주는 메소드 
	 * @return
	 */
	public int getPrice() {
		return this.price;
	}
	/**
	 * 사용자가 넘겨준 가격으로 수정 
	 * @param price 수정할 가격 
	 */
	public void setPrice(int price) {
		this.price = price;
	}
}
