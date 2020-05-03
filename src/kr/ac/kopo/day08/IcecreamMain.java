package kr.ac.kopo.day08;

public class IcecreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Icecream ice = new Icecream("비비빅", 1000); 
		
		// ice.name = "비비빅"; => 멤버변수가 private이기 때문에 외부 클래스에서 객체.클래스로 접근할 수 없게한다. 이를 위해 생성자가 필요하다. 
		
		System.out.println("아이스크림명 : " + ice.getName());// getter를 쓰면 getName을 통해 아이스크림이름을 알 수 있다 - 까지만 알고, 그 변수가 뭔지 모른다.
		// 메소드는 접근할 수 있되, 멤버변수에 직접 접근하는것을 차단한다. 함부로 변수값을 못고치도록 막는다. 그래서 보통 멤버변수는 private, 메소드는 public 
		System.out.println("아이스크림가격 : " + ice.getPrice());
		
		ice.setPrice(800); // 가격을 수정할때도 마찬가지로 메소드를 통해 수정한다. 
	}

}
