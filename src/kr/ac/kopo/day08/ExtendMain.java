package kr.ac.kopo.day08;

class One {
	// 사실 가장 상위 클래스 One에도 super()가 생략되있다. 자바에서 모든 클래스는 Object 클래스를 상속받기 때문에. 
	One() {
		System.out.println("One() 생성자 호출... ");
	}
}
class Two extends One {
	Two() {
		// super(); 라는 생성자가 숨어있어서 new Two를 해도 부모클래스인 One의 생성자도 함께 호출됨. 
		System.out.println("Two() 생성자 호출... ");
	}
}
class Three extends Two{
	Three() {
		System.out.println("Three() 생성자 호출... ");
	}
}
public class ExtendMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// One one = new One();
		//Two two = new Two();
		Three three = new Three();
	}

}
