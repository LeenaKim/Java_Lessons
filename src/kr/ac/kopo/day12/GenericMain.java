package kr.ac.kopo.day12;

import java.util.Random;
// 두 개의 타입이 나오는 제너릭 //
class CCC<T1, T2>{

	private T1 data;
	private T2 data2;
	
	public CCC(T1 data, T2 data2) {
		this.data = data;
		this.data2 = data2;
	}
	public T1 getData() {
		return data;
	}
	
	public void setData(T1 data) {
		this.data = data;
	}
	
	public T2 getData2() {
		return data2;
	}
	
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
	
	
}

// 제너릭을 쓸 경우 //
class BBB<T> {
	private T data; // Object가 아니라 형을 유연하게 움직일거야!  
	
	public BBB() {
		
	}
	public BBB(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

// 제너릭 없을 경우 //
class AAA {
	private Object data;
	
	public AAA(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}

class Icecream {

	private String name;
	private int price;
	
	public Icecream() {
		super();
	}
	
	public Icecream(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println(name + price);
	}
}

public class GenericMain {

	public static void main(String[] args) {
		
		CCC<String, String> c = new CCC<String, String>(new String("abc"), ("12345"));
		CCC<Icecream, String> c2 = new CCC<Icecream, String>(
				new Icecream("월드콘", 2000), 
				new String("hello world"));
		c2.getData(); // icecream형 
		c2.getData2(); // String형으로 잘 나오는것 확인. 
		
		
		// BBB의 디폴트 생성자를 활용 (타입 뒤의 매개변수 없음)
		BBB<Object> obj = new BBB<Object>();
		BBB<String> obj2 = new BBB<String>();
		BBB<Random> obj3 = new BBB<Random>();
		BBB<Icecream> obj4 = new BBB<Icecream>();
		
		// obj.getData, obj2.getData를 해보면 타입이 각각 정해준대로 Object, String으로 이미 명시적 형변환까지 이뤄진게 보임. 
		
		obj2.setData(new String("Hello"));
//		obj4.setData(new String("abc")); // Icecream형인데 String을 넣으니 오류뜨는것 확인.
		System.out.println("obj2 길이 : " + obj2.getData().length());
		
		
		
		/* 제너릭 안쓸경우 
		AAA obj = new AAA(new Object());
		// AAA(Object형)으로 묵시적 형변환 
		AAA obj2 = new AAA(new String("Hello"));
		AAA obj3 = new AAA(new Random());
		AAA obj4 = new AAA(new Icecream("비비빅", 1000));
		
		System.out.println("obj : " + obj.getData().toString());
//		System.out.println("obj2 : " + obj2.getData().length()); // length()를 붙여줄시 오류가 난다. 묵시적형변환만 해줬기때문에 object형이기 때문에 string의 메소드인 length()가 없다. 
		String strObj = (String)obj2.getData();
		System.out.println("obj2 : " + strObj + ", length: " + strObj.length()); 
		
//		System.out.println("추출된 난수 : " + obj3.getData().nextInt()); // 얘도 자식의 형만 Random형이므로 명시적 형변환 해줘야함. 
		Random r = (Random)obj3.getData();
		System.out.println("추출된 난수 : " + r.nextInt()); 
		
		Icecream ice = (Icecream)obj4.getData();
		ice.info();
		
		Icecream ice2 = (Icecream)obj2.getData();
		ice2.info();
		
		// => 이렇게, 다양한 형이 오면 매번 묵시적, 명시적 형변환해주는게 힘들고 실행시 오류도 남. 이를 위해 Generic이 존재. 
		 */
	}

}
