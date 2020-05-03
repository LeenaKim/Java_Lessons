package kr.ac.kopo.day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone ph = new Phone();
		ph.name = "홍길동";
		ph.number = "010-1111-2222";
		ph.brand = "Samsung";
		
		Phone ph2 = new Phone();
		ph2.name = "고길동";
		ph2.number = "010-3333-4444";
		ph2.brand = "Apple";
		
		Phone ph3 = new Phone();
		ph3.name = "강길동";
		ph3.number = "010-5555-6666";
		ph3.brand = "LG";
		
		System.out.println(" < 객체 하나 하나 출력 > ");
		System.out.println("소유주 : "+ ph.name + ", 전화번호 : " + ph.number + ", 제조사 : " + ph.brand);
		System.out.println("소유주 : "+ ph2.name + ", 전화번호 : " + ph2.number + ", 제조사 : " + ph2.brand);
		System.out.println("소유주 : "+ ph3.name + ", 전화번호 : " + ph3.number + ", 제조사 : " + ph3.brand);
		
		// 이 객체들을 배열로 만들수도 있다. 데이터형[] 배열이름 = {};
		Phone[] phArr = {ph, ph2, ph3}; // String형이 Phone형이 되었다. 
		
		System.out.println(" < 객체배열로 반복문으로 출력 > ");
		for(int i = 0; i < phArr.length; i++) {
			System.out.println("소유주 : "+ phArr[i].name + ", 전화번호 : " + phArr[i].number + ", 제조사 : " + phArr[i].brand);
		}
	}
}
