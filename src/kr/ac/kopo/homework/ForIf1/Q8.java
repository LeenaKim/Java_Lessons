package kr.ac.kopo.homework.ForIf1;

import java.util.Scanner;

public class Q8 {

	public void q8 (int price, int budget) {
		// 물건 값이 낸 값보다 작다면 
		if(price < budget) {
			// 둘을 빼서 남은 돈을 계산해준다. 
			int left = budget - price;
			// else if가 아니라 여러개의 if문을 씀으로써 각 화폐 단위로 나누고 밑으로 내려가며 체크한다.  
			// 남은 돈이 1000원 이상일 경우 1000으로 나눈 몫을 출력해준다. 아래도 마찬가지이다. 
			if(left >= 1000) {
				System.out.printf("1000원 : %d개\n ", left/1000);
				// 남은 돈은 나눈 나머지가 된다.  
				left %= 1000;
			} else System.out.printf("1000원 : %d원\n ", 0);
			if(left >= 500) {
				System.out.printf("500원 : %d원\n", left/500);
				left %= 500;
			} else System.out.printf("500원 : %d원\n ", 0);
			if(left >= 100) {
				System.out.printf("100원 : %d원\n", left/100);
				left %= 100;
			} else System.out.printf("100원 : %d원\n ", 0);
			if(left >= 50) {
				System.out.printf("50원 : %d원\n", left/50);
				left %= 50;
			} else System.out.printf("50원 : %d원\n ", 0);
			if(left >=10) {
				System.out.printf("10원 : %d개\n", left/10);
				left %= 10;
			} else System.out.printf("10원 : %d개\n ", 0);
		} else {
			// 물건 값이 낸 돈보다 비쌀 경우 차액만큼 더 필요하다고 출력한다.  
			System.out.printf("%d원이 부족합니다. ", price-budget);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("물건값을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("지불한 돈의 액수를 입력하세요.");
		int budget = sc.nextInt();
		sc.nextLine();
		
		Q8 test = new Q8();
		test.q8(price, budget);
	}

}