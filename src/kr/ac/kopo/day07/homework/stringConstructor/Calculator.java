package kr.ac.kopo.day07.homework.stringConstructor;

public class Calculator {
	
	
	int add(int i, int j) {
		return i + j;
	}
	
	int subtract(int i, int j) {
		return i - j;
	}
	
	int multiple(int i, int j) {
		return i * j;
	}
	
	double divide(double i, double j) { // 입력받는 i와 j가 정수형이지만 double이 더 큰 자료형이므로 묵시적 형변환이 일어나 소수점까지 계산하도록 하고, 리턴값도 double로 반환해준다. 
		return i / j;
	}
	
	boolean prime(int i) {
		boolean isPrime;
		int cnt = 0;
		for(int k = 1; k <= i; k++) {
			if(i % k == 0) cnt++; // 약수가 2개일때가 소수이므로 
		}
		isPrime = (cnt == 2 ? true : false); // 2개면 true, 그 외엔 false를 반환하도록 한다. 
		return isPrime;
	}
	
}
