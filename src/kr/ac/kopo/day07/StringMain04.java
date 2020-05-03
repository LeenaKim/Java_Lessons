package kr.ac.kopo.day07;

public class StringMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String의 처리속도 
		String str = "";
		
		long start = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++) {
			str = str + i; // 1 2 3 4 ... 100 101 102...
		}
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : " + (end - start) / 1000 + "초");
			// => 22초나 걸린다. 새로 문자가 들어올때마다 새로운 공간을 할당하기 때문. 
		
		// StringBuffer의 처리속도 
		StringBuffer sb = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++) {
			sb.append(i); // StringBuffer는 String과 다르게 자기 자신이 바뀌기 때문에 리턴할 필요 없다. 
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000 + "초");
			// 0.005초밖에 안걸린다. 처음에 만든 공간 하나의 크기를 계속 늘려가기 때문에 빨리걸린다.
			// 그래서 특히 웹상에서 자주 변화가 일어나는 문자열은 StringBuffer나 StringBuilder를 쓴다. 
	}

}
