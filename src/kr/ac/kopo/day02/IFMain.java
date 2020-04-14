package kr.ac.kopo.day02;

import java.util.Scanner;

public class IFMain {

	public static void main(String[] args) {

// 조건문을 사용해 기상시간에 따라 버스를 탈지 걸을지 제어해주기 //	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("집에서 출발 시간을 입력(7시 10분일 시 710 입력) : ");
		int time = sc.nextInt();
		sc.nextLine();
		
		
	// 방법 3 - 중간부터 조건문으로 빼기 : 복잡해져서 좋은 코딩은 아님. 
		System.out.println("기상한다. ");
		
		if(800 <= time && time < 815) {
			System.out.println("버스타고 ");
		} else {
			if(time < 800) {
				System.out.println("걸어 ");
			} else System.out.println("택시타고 ");
		}
		
	// 방법 2 - 뒤에서부터 조건문으로 뺴기 
		// 세 경우로 나눌 시에는 3-1 즉 두개의 조건문이 필요하다. 하나 하나 나눠줘야 한다. 
		/*
		System.out.println("기상한다.");
		
	    if(time < 815) {
	    	if(time < 800) {
	    		System.out.println("걸어서 ");
	    	} else {
	    		System.out.println("버스타고 ");
	    	}
	    } else {
	    	System.out.println("택시타고 ");
	    }
	    
	    System.out.println("학교간다.");
		*/
		
	// 방법 1 - 앞에서부터 조건문으로 뺴기 
		/*
		if(time < 800) {
			System.out.println("걸어서 ");
		} else if(time <815) { // 주의 : else if에서 이미 위의 if문에서 time >= 800이라는 것이 입증되었으므로 조건문에 명시해주지 않아도 된다. 
			System.out.println("버스타고 ");	
		} else {
			System.out.println("택시타고 ");
		}
		
		System.out.println("학교간다.");
		*/

		/*
		System.out.println("기상한다.");
		
		System.out.print("집에서 출발 시간을 입력(7시 10분일 시 710 입력) : ");
		int time = sc.nextInt();
		sc.nextLine();
		
		// 3항연산자도 가능하다. 
		// System.out.println(time < 800 ? "걸어서" : "버스타고 ");
		
		if(time < 800) {
			System.out.println("걸어서 ");
		} else {
			System.out.println("버스타고 ");
		}
		
		System.out.println("학교간다.");
		*/

// 조건문에 따라 학교가기 전 밥을 먹을지 말지 결정해주기 //
		/*
		System.out.println("기상한다.");
		
		System.out.print("일어난 시간을 입력(7시 10분일 시 710 입력) : ");
		int time = sc.nextInt();
		sc.nextLine();
		
		if (time < 700 ) {
			System.out.println("밥먹고 "); // 어쩔떈 밥을 먹고, 어쩔땐 안먹으니 '밥먹고' 문장에 제어를 걸어주자. 
		}
		
		System.out.println("학교간다.");
		*/
	}

}