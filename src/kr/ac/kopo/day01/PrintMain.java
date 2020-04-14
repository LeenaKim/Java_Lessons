package kr.ac.kopo.day01;

public class PrintMain {
	public static void main(String[] args) {
		// \t : tap - 가장 가까운 탭의 위치로 옮겨가겠다. 그래서 같은 간격으로 띄어쓰기가 가능하다. 
		System.out.printf("%d\t%s\n", 10, "ABC");
		System.out.printf("%d\t%s\n", 1234, "DE");
		System.out.printf("%d\t%s\n", 8, "Hello");
		System.out.printf("%d\t%s\n", 12345678, "Hi");
			//=> 하지만 이렇게 숫자가 커질 경우 탭이 그 다음 탭으로 넘어가기 때문에 공간이 달라진다.
		
		System.out.println();
		
		// %10d : d 앞에 숫자를 넣어 띄어쓰기를 얼만큼 하고싶은지 쓴다.
		// -10이면 왼쪽 정렬을 하겠다는 것. 
		System.out.printf("%-10d\t%s\n", 10, "ABC");
		System.out.printf("%-10d\t%s\n", 1234, "DE");
		System.out.printf("%-10d\t%s\n", 8, "Hello");
		System.out.printf("%-10d\t%s\n", 12345678, "Hi");
		
		// %05d : 6자리 수 중에서 앞에 공백을 0으로 채운다.
		System.out.printf("[%05d]\n", 123);
		
		// .3f : 소숫점 세자리까지만 출
		System.out.printf("%.3f\n", 12.34567);
		
		// 반올림이 아니라 버림을 하고싶을 땐?
		System.out.printf("%.1f/n", 12.46 - 0.05); // 12.4
		System.out.printf("%.1f\n", 12.43 - 0.05); // 12.4
			// => 프로그래밍은 아이디어 싸움이다!
		
		// + 활용해서 출력하기 
		System.out.println(10 + "ABC");
		System.out.println(10 + 12.34);
		System.out.println('A' + "BC"); 
		System.out.println('A' + 'B'); // 65 + 66
		System.out.println(10 + 'A'); // 10 + 65
			// 131이 나옴. 왜? 문자와 문자를 더하는 경우나 정수나 문자를 더하는 경우, 유니코드 숫자를 더해버림. 
		
		// 유니코드가 16진수로 표현하기 때문에 한 자리수에 더 많은 수를 표현할 수 있다.
		System.out.println('A'); // A
		System.out.println('\u0041'); // A
		System.out.printf("%c\n", '\u0041'); // A
		System.out.println('A' + 'B' + "hello" + true + 10); //131hellotrue10 => AB가 아닌것에 주의!
	
		// 형변환
		char ch = 'M';
		System.out.printf("%d\n", (int)ch); // (int)로 강제적 형변환을 해줘야 한다. => 77
		System.out.println((int)ch); // println은 무조건 문자형으로 출력하므로 (int) 형변환 해줘야 함.
		
		int code = 65;
		System.out.printf("%c\n", code); // 묵시적 형변환에 의해 (char)이 없어도 됨. 자료형 타입의 크기에 따라 다름.
	
		// 역슬래시를 문자화하기
		System.out.println("[\n]"); // \n을 개행문자로 인식해서 \n이 그대로 출력되지 않는다.
		System.out.println("[\\n]"); // 역슬래시를 하나 더 적어주면 문자로 인식한다.
		System.out.printf("%%\n"); // %를 두번 써주면 문자로 인식한다.
		System.out.println("\""); // 역슬래시 자체를 출력하고싶을땐 \" 따옴표를 붙인다. 
	}
	
	
	
}