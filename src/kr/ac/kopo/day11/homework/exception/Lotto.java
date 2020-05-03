package kr.ac.kopo.day11.homework.exception;
/**
 * 과제1>
   좋아하는 로또 번호를 입력하세요 : 34
   34를 포함해서 로또번호들을 추출하겠습니다

   좋아하는 로또 번호를 입력하세요 : 77
   LottoNumberException : 1 - 45사이만 가능합니다. 77은 올바르지 않습니다 
 * @author Lina
 *
 */
public class Lotto {

	private int lottoNum;
	private int firstClass;
	private int secondClass;
	private int thirdClass;
	
	Lotto() {}
	
	public int getLottoNum() {
		return lottoNum;
	}
	public void setLottoNum(int lottoNum) {
		this.lottoNum = lottoNum;
	}
	public int getFirstClass() {
		return firstClass;
	}
	public void setFirstClass(int firstClass) {
		this.firstClass = firstClass;
	}
	public int getSecondClass() {
		return secondClass;
	}
	public void setSecondClass(int secondClass) {
		this.secondClass = secondClass;
	}
	public int getThirdClass() {
		return thirdClass;
	}
	public void setThirdClass(int thirdClass) {
		this.thirdClass = thirdClass;
	}
	
}
