package kr.ac.kopo.day06.homework.classMethod;
// 중간에 Market이라는 control class가 있기 때문에 메인클래스에선 많이 쓸 것이 없다. 
// 메인클래스가 짧아야 효율적이다. 
public class Prof_IcecreamMain {

	public static void main(String[] args) {
		
		Prof_IcecreamMarket market = new Prof_IcecreamMarket();
		market.open();
		
	}

}
