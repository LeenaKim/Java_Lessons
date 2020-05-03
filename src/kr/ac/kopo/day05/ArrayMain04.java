package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		int[] arr2 = new int[3];
		int[] arr3 = new int[3];
		
		int[][] ar = new int[3][]; // 참조하려는 1차원 배열이 세개니까 [3]
		// 위의 1차원 배열의 참조변수를 만들어 1차원 배열의 주소값을 기억하는 2차원 배열을 만들고자 한다. 
		// 이 때, stack에는 ar 객체가 생성되고 heap에는 객체가 참조하는 세 개의 공간이 생기지만,
		// 각 공간에 해당되는 1차원 배열의 주소값이 없기때문에 출력시 null이 나온다. 
		System.out.println(Arrays.toString(ar)); // => 세개의 null 참조변수 배열 출력 
		
		int[][] ar2 = new int[3][4];
		/*
		for(int i = 0; i < ar2.length; i ++) {
			ar2[i] = new int[i+2];// i+2로 해서 각 1차원 배열의 길이를 다르게 해줘도 됨. 
		}
		
		for(int i = 0; i < ar2.length; i++) {
			System.out.println("ar[" + i + "].length : " + ar[i].length);
		} // 각 1차원 배열마다 길이가 2, 3, 4로 다르게 나타난다. 
		*/
		
		
		/*
		ar2[0] = new int[4];
		ar2[1] = new int[4];
		ar2[2] = new int[4];
		// 위의 반복문과 같은 결과 
		*/
		
		// 이렇게 ar의 1차원 배열에 각각 길이 3의 1차원 배열을 할당해주면 이 null에 0값을 가지는 세 개의 배열들의 주소값이 할당된다. 
		System.out.println(Arrays.toString(ar2)); // => 주소값 출력. \
		
		System.out.println("ar.length: " + ar2.length); // 3이다. 왜? ar이 직접 가리키고 있는 배열의 크기는 1차원배열 3개의 3이니까. 거기에 1차원 배열마다 4개씩 있는 것. 
		System.out.println("ar[0].length: " + ar2[0].length); // 4이다. 왜? 3개의 1차원 배열의 길이를 물어봤으니까. 
		
		System.out.println("< PRINT >");
		
	}

}
