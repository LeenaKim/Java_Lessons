package kr.ac.kopo.day03.homework.ForIf2;
/**
 * 구구단을 한 라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
 * 반복문은 최대 3개만 사용합니다.
 * @author Lina
 *
 */
public class Q9 {
	public static void q9() {
		int cnt = 2;
		
		for(int k = 0; k < 3; k++) {
			for(int i = 1; i <= 8; i++) {
				for(int j = cnt; j <= cnt+2; j++) {
					if(j == 10) break;
					System.out.printf("%d * %d = %d\t", j, i, j * i);
				}				
				System.out.println();
			}
			System.out.println();
			cnt+=3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q9();
	}

}
/*
 * < 풀이 >
 * 한 라인에 3단씩 나오게 하려면 한 행이 2 * 1 = 2   3 * 1 = 3   4 * 1 = 4 이런식으로 곱하는 수는 동일하고 단 자체가 바뀌어야 한다.
 * 때문에 단이 들어오는 반복문이 가장 안쪽에 위치하고, 그 밖에 1부터 8까지 단에 곱해줄 수가 반복문으로 온다. 
 * 단의 경우 3 x 3의 블럭에서 
 * 2단 3단 4단
 * 5단 6단 7단
 * 8단 9단
 * 이렇게 위치해야 하기 때문에 이에 맞춰 증가해줘야하는데, 이 때의 j를 변수로 세워 한 행이 끝날때마다 바꿔주도록 하였다.
 * 2단과 5단, 5단과 8단의 차이는 3이라는것을 이용하여 가장 바깥 반복문이 반복할때마다 cnt값을 3씩 증가시켜주었다.
 * cnt의 초기값은 2로, 2단부터 cnt+2인 4단까지 출력하고 cnt에 3을 더해준다. 
 * 이러한 로직으로 출력할 경우 k < 3이고 가장 안쪽 반복문의 범위가 cnt+2, 즉 10까지 나오기 때문에 10단까지 출력된다.
 * 10단일 경우는 break를 통해서 반복문을 빠져나오게 하면 10단은 출력되지 않는다. 
 */ 