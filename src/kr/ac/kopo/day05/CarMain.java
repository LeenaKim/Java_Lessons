package kr.ac.kopo.day05;
// 실행 클래스 (메인메소드를 가진 클래스) //
public class CarMain { // 메인 메소드를 갖고있는 클래스는 JVM이 실행한다. 그래서 따로 객체 안만들어도 된다. 

	public static void main(String[] args) {
		// 인스턴스 객체 생성 //
		Car c = new Car(); // heap 영역에 자동차 한대를 만들었다. 이 자동차의 주소를 c가 참조하게 된다. 
		
		System.out.println("c : "+ c); // 주소값이 찍힘.
		c.name = "sonata";
		c.price = 2500;
		
		Car c2 = new Car(); // 같은 클래스를 참조해도 객체가 다르면 참조하는 메모리주소도 다르다. 
		
		c2.name = "morning";
		c2.price = 1100;
		
		System.out.println("브랜드명 : " + c.name + "\t" + "가격 : " + c.price);
		System.out.println("브랜드명 : " + c2.name + "\t" + "가격 : " + c2.price);
	}

}
