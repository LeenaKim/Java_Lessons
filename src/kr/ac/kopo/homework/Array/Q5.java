package kr.ac.kopo.homework.Array;
/**
 * 2 ~ 100 사이의 소수를 출력하는 코드를 작성
 * 
 * @author Lina
 *
 */
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[99];
		for(int i = 0; i < nums.length; i++) { // 2부터 100까지 저장 
			nums[i] = i + 2;
		}
		
		for(int i = 0; i < nums.length-1; i++) { 
			int cnt = 0; // 약수의 개수를 세어준다. 
			for(int j = 1; j <= nums[i]; j++) {
				if(nums[i] % j == 0) cnt++; // 1부터 nums[i]중 약수의 개수를 센다. 
			}
			if(cnt == 2) { // 약수의 개수가 2개면 소수라는 뜻이므로 
				for(int k = i+1; k < nums.length; k++) { // 배열을 풀스캔하며 소수의 배수일시 0으로 바꿔준다. 
					if(nums[k] % nums[i] == 0) nums[k] = 0;
				}
			}
		}
		
		for(int n : nums) {
			if(n != 0) System.out.printf("%3d", n); // 0이 아닌것만 출력 
		}
	}

}
