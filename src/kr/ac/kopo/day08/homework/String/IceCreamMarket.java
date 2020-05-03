package kr.ac.kopo.day08.homework.String;

import java.util.Scanner;
// 나중엔 아이스크림 제조사별로 구분을 하거나 본점과 지점별로 구분을 해야할 수도 있다. 이렇게 확장을 해봐라. 
public class IceCreamMarket {
	// 멤버변수는 private으로 해준다. 고객수, 아이스크림수, 총 수입은 객체에 상관없이 모든 객체가 공유하는 값이므로 static으로 세워준다. 
	private static int customerCnt = 0;
	private static int iceCreamCnt = 0;
	private static int totalIncome = 0;
	// 한 명의 고객이 왔을때의 정보를 기억하기 위한 배열
	IceCream[] iceArr;
		
	Scanner sc;
		
	// 생성자 만들기 
	public IceCreamMarket() {
		sc = new Scanner(System.in);
		// 기본 초기화 
	}
		
	int getInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
			
		return num;
	}
		
	String getStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
			
		return str;
	}
		
	public void open() {
		int cnt = getInt("아이스크림 몇개 구입할래? : ");
		iceArr = new IceCream[cnt];
		IceCreamMarket.customerCnt++; // 한 배열이 손님 1명을 의미하므로 배열 생성과 함께 고객수를 증가시키는 메소드 호출 
			
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 구매정보 입력 ***");
			String name = getStr("아이스크림명 : ");
			int price = getInt("아이스크림가격 : ");
				
			iceArr[i] = new IceCream(name, price);
			IceCreamMarket.totalIncome += price; // 반복문을 돌며 totalIncome에 price를 추가 
			IceCreamMarket.iceCreamCnt++;
		}
			
		print(); // from 교수님 : 재귀함수(매소드 안에서 메소드를 호출)를 썼는데, 이러면 메모리가 없어졌다 생겼다 하며 안좋은 방법이 될 수 있다. 이런 경우 반복문을 쓰는게 낫다. 
	}
	
	void print() {
		System.out.println("< 총" + iceArr.length + " 개 판매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		for(int i = 0; i < iceArr.length; i++) {
			IceCream ice = iceArr[i];
			System.out.printf("%3d\t%-10s\t%5d\n", i+1, ice.getName(), ice.getPrice());
		}
		System.out.println("계속 구매할래? (Y/N) => ");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y' || answer == 'Y') open(); // 계속 구매하겠다하면 open()을 반복한다. 
		else printEnd(); // 구매 안하겠다 하면 마지막 출력문을 출력하고 종료. 
	}
	
	public static void printEnd() {
		System.out.println("총 " + IceCreamMarket.customerCnt + "명의 고객이 아이스크림을 구매했습니다. "); 
		System.out.println("판매된 아이스크림 총 개수 : " + IceCreamMarket.iceCreamCnt + "개");
		System.out.println("총 판매액 : " + IceCreamMarket.totalIncome);
	}
		
		

}
