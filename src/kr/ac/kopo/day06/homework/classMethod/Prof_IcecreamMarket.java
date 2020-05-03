package kr.ac.kopo.day06.homework.classMethod;

import java.util.Scanner;
// 받은 아이스크림 정보를 가지고 입출력 및 관리하는 코드 
public class Prof_IcecreamMarket {

	// 한 명의 고객이 왔을때의 정보를 기억하기 위한 배열
	Prof_Icecream[] iceArr;
	
	Scanner sc;
	
	// 생성자 만들기 
	public Prof_IcecreamMarket() {
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
	
	void open() {
		int cnt = getInt("아이스크림 몇개 구립할래? : ");
		iceArr = new Prof_Icecream[cnt];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 구매정보 입력 ***");
			String name = getStr("아이스크림명 : ");
			int price = getInt("아이스크림가격 : ");
			
			iceArr[i] = new Prof_Icecream(name, price);
		}
		
		print();
	}
	
	void print() {
		System.out.println("< 총" + iceArr.length + "개 판매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		for(int i = 0; i < iceArr.length; i++) {
			Prof_Icecream ice = iceArr[i];
			System.out.printf("%3d\t%-10s\t%5d\n", i+1, ice.getName(), ice.getPrice());
		}
	}
}
