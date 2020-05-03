package kr.ac.kopo.day07.homework.stringConstructor;

public class Prof_CalculatorMain {
	
	public static void main(String[] args) {
		
		Prof_Calculator cal = new Prof_Calculator();
		cal.inputNums();
		cal.calculate();
		cal.checkPrime();
		/*
		 *  후에 다시 입력받고싶다면 
		 *  cal.inputNums();
		 *  cal.calculate();만 다시 해주면 됨. 
		 */
	}
}
