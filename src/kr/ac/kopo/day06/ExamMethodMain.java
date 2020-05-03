package kr.ac.kopo.day06;

import java.util.Arrays;

public class ExamMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamMethod exam = new ExamMethod();
		
		int sum = exam.getSum(1, 10); // 두 개의 정수의 합이 궁금하다. 
		int totalSum = exam.getTotalSum(1, 10); // 두 정수 사이의 총합이 궁금하다. 
		
		System.out.println("1 + 10 = " + sum);
		System.out.println("1 ~ 10 사이의 총합 : " + totalSum);
		
		int[] nums = exam.getNums();
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
		
		System.out.print("배열의 크기를 입력 : ");
		int size = exam.getNum();
		
		// 1 ~ 100 사이의 난수를 size개만큼 추출... 
		nums = exam.getNums(size);
		
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
		
		System.out.println("1 ~ 100 사이의 정수 입력 : ");
		int max = exam.getNum();
		
		// 1 ~ max 사이의 난수를 size개만큼 추출...
		nums = exam.getNums(max, size);
		
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
	}

}
