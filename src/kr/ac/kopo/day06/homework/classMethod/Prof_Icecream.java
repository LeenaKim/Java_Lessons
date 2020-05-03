package kr.ac.kopo.day06.homework.classMethod;
// 오직 아이스크림의 정보만 가지고 있는 클래스 
public class Prof_Icecream {

	String name;
	int price;
	
	Prof_Icecream() {}
	
	Prof_Icecream(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
}
