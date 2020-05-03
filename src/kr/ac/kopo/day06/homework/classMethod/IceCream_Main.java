package kr.ac.kopo.day06.homework.classMethod;

import java.util.Scanner;

public class IceCream_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림을 몇개 구입할래? "); // 아이스크림 개수 입력받기 
		int n = Integer.parseInt(sc.nextLine());
		
		IceCream[] ic = new IceCream[n]; // IceCream 클래스의 객체 배열을 만들고, 배열 크기는 n개이다. 
		
		for(int i = 0; i < ic.length; i++) {
			ic[i] = new IceCream(); // n번만큼, 즉 ic.length만큼 반복하며 배열 내 인스턴스 값으로 IceCream의 name과 price를 저장한 주소값을 할당해준다. 
			System.out.printf("%s", "아이스크림명 : ");
			ic[i].name = sc.nextLine();
			System.out.printf("%s", "아이스크림 가격 : ");
			ic[i].price = sc.nextInt();
			sc.nextLine();
		}
		for(int i = 0; i < ic.length; i++) {
			System.out.printf("%s %d %s", "*** ", i+1, "번째 아이스크림 구매정보 ***\n");
			System.out.println("아이스크림명 : " + ic[i].getIceCreamName());
			System.out.println("아이스크림 가격 : " + ic[i].getIceCreamPrice());
		}
		
		ic[0].printInfoAll(n, ic);// 메소드를 호출하면 ic 배열 전체가 피호출자 메소드에게 전해진다. 
		

		
	}

}
