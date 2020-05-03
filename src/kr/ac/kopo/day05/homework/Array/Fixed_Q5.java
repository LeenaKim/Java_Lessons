package kr.ac.kopo.day05.homework.Array;
/**
 * 2 ~ 100 사이의 소수를 출력하는 코드를 작성
 * 
 * @author Lina
 *
 *	< 교수님 코멘트 >
	제가 제시한 알고리즘은 23 ~ 26줄이 자동으로 구현되게 됩니다. 코드를 사용하지 않고 어떻게 결과를 도출할 수 있는지 다시 생각해봐요~~ ^^
	
	< 수정 후 >
	nums[i]가 소수임이 증명되어야 nums[i]의 배수를 0으로 만들 수 있다고 생각했는데,
	교수님이 수업시간에 말씀하신것처럼 nums[i]가 0이 아니라는 것 자체만으로도 소수임이 증명되는것을 알았습니다.
	기존의 약수 개수를 세는 코드를 없애고, nums[i]가 0이 아닐때라는 조건만 추가하여 더 간단한 코드를 완성할 수 있었습니다!
	감사합니다 :) 
 */
public class Fixed_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[99];
		for(int i = 0; i < nums.length; i++) { // 2부터 100까지 저장 
			nums[i] = i + 2;
		}
		
		for(int i = 0; i < nums.length-1; i++) { 
			if(nums[i] != 0) {
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
