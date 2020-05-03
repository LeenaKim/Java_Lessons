package kr.ac.kopo.day05.homework.Array;

public class Prof_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[99];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+2;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) { // 0이 아닌 것에서 이미 소수라는것이 증명됨. 왜? 앞에서 돌면서 배수면 0으로 만들어줬었으니까. 
				for(int j = i+1; j < nums.length; j++) {
					if(nums[j] % nums[i] == 0) {
						nums[j] = 0;
					}
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				System.out.printf("%5d", nums[i]);
			}
		}
		System.out.println();
	}

}
