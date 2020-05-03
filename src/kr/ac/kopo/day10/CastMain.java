package kr.ac.kopo.day10;

public class CastMain {
	/* < '3 >
	static void print(Child01 c) {
		c.print();
	}
	
	static void print(Child02 c) {
		c.print();
	}
	static void print(Parent p) {
		p.print();
	}
	 */
	// < '4 >
	static Parent getInstance() {
		// return new Child01(); // 모두 Parent형으로 만들어지면서 Child01, 02, 03 등 다양한 자식 객체가 들어와도 변화에 덜 민감해질 수 있다. 
		// return new Child02();
		 return new Child03();
		// return new Child04();
		// return new Parent(); // 참고로 이건 묵시적 형변환은 아니다. 그냥 모든게 와도 되게 만든다고. 
	}
	
	static void print(Parent p) {
		// p.print();
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.play();
			c.sing();
		}
		
		
		
		// 그래서 instanceof라는것이 있다. instanceof는 서로 상속관계가 있어야하고, 기본자료형에선 안되고 참조자료형에서만 가능하다. 
		// System.out.println("p instanceof Child01 : " + (p instanceof Child01));
		// System.out.println("p instanceof Child02 : " + (p instanceof Child02));
		// System.out.println("p instanceof Parent : " + (p instanceof Parent));
		
		/* 명시적 형변환을 사용할시 이렇게 또 일일이 다 type을 매개변수로 받아 형변환해줘야함. 귀찮음. 
		switch(type) {
		case 1 :
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
			break;
		case 2 :
			Child02 c2 = (Child02)p;
			c2.play();
			c2.sing();
			break;
		}*/
	}

	public static void main(String[] args) {

		
		/*
		// < 4 >
		Parent p = getInstance(); // 이 때의 문제는 내가 Child01, 02, 03을 쓸때마다 메소드의 형이 자식형이면 매번 바꿔야 함. 이럴때 메소드의 형을 바로 부모클래스로 해버려주면 된다. 
		print(p);
		*/
		
		/* < 3 >
		 * 자식클래스의 개수가 많아지면 매개변수를 다 각각의 클래스 형으로 하는 함수를 새로 만들어줘야 함.
		 * 이 때, CastMain 함수의 자식클래스를 받는 메소드들을 지우면 Parent p를 매개변수로 받는 메소드가 작동해 자연스럽게 묵시적 형변환이 일어난다.
		 * 이것이 객체 형변환을 쓰는 이유이다. 매개변수로 뭐가들어오든 유연하게 대처하기위해. 
		 */
		/*
		Child03 c03 = new Child03(); // 외부에서 새로운 객체가 들어올때마다 메소드를 계속 추가해줘야하기때문에 번거롭다. 
		print(c03);
		 */
		
		 Child02 c02 = new Child02();
		 print(c02);
		
		 Child01 c01 = new Child01();
		 print(c01);
		
		 //Parent p = new Parent();
		//print(p);
		 
		
		
		
		 
		
		/* < 2 >
		// 묵시적 형변환 
		Parent p = new Child01(); // 실제값은 자식에 저장되었으나 부모의 형을 받았다. 
		p.print(); // 부모클래스의 print가 나올거라 생각하지만 사실 child01의 값을 받았기 때문에 child02의 print가 출력된다. 
		// p.sleep(); => sleep() 메소드는 자식의 메소드라 부모의 주소만 갖고있는 p의 경우 자식만의 메소드를 호출시킬 수 없다. 
		
		Parent p2 = new Child02();
		p2.print();
		
		Parent p3 = new Parent();
		p3.print();
		*/
		
		/* < 1 >
		Child02 c02 = new Child02();
		c02.print();
		c02.sing();
		c02.play();
		
		
		Child01 c01 = new Child01();
		c01.print();
		c01.sleep();
		c01.study();
		
		Parent p = new Parent();
		p.print();
		*/
	}

}
