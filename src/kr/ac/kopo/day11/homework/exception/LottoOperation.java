package kr.ac.kopo.day11.homework.exception;

public class LottoOperation implements GetLottoNum {

	LottoOperation(){}
	
	Lotto lotto = new Lotto();
	
	/**
	 * 진행 순서대로 메소드를 진행시킬 함수 
	 * 1. 사용자에게 숫자를 받고   2. 1 2 3등 번호를 추출한 뒤   3. 결과를 출력한다. 
	 */
	public void mainOperator() {
		
		getLottoNum();
		System.out.println(lotto.getLottoNum() + "을/를 포함해서 로또번호를 추출하겠습니다. ");
		setClasses();
		result();
	}
	
	
	int tempLottoNum;
	/**
	 * 사용자의 로또번호를 받는 메소드 
	 * 로또번호가 초기값 0이 아닌 다른수가 될때까지 반복문에서 예외를 잡는다. 
	 * 범위 밖일경우 사용자 정의 예외와 메세지를 호출하고, 범위내일경우 사용자 숫자를 setter을 통해 저장한다.
	 * 예외를 잡을경우 메세지를 한번더 출력하고 경로까지 trace한다. 
	 */
	@Override
	public void getLottoNum() {
		while(lotto.getLottoNum() == 0) {			
			System.out.println("좋아하는 로또 번호를 입력하세요 : ");
			tempLottoNum = Integer.parseInt(sc.nextLine());
			try {
				if(tempLottoNum > 45 || tempLottoNum < 1) {
					throw new LottoNumberException("1 - 45사이만 가능합니다. " + tempLottoNum + "은/는 올바르지 않습니다. ");
				} else lotto.setLottoNum(tempLottoNum);
			} catch (LottoNumberException lne) {
				System.out.println(lne.getMessage());
				lne.printStackTrace();
			} 
		}
	}
	
	/**
	 * 1등 2등 3등 로또번호를 랜덤으로 생성하는 메소드 
	 * 2등번호는 1등과 다른 숫자가 랜덤으로 나올때까지 반복하다 저장한다. (경우의수가 많아 대부분 한번반복시 2등 숫자가 저장된다.)
	 * 3등번호는 1등과 2등과 다른숫자가 랜덤으로 나올때까지 반복하다 저장한다. 
	 */
	public void setClasses() {
		lotto.setFirstClass((int)(Math.random()*44+1));
		
		while(lotto.getSecondClass() == 0) {
			int tempSecondClass = (int)(Math.random()*44+1);
			if(tempSecondClass != lotto.getFirstClass()) {
				lotto.setSecondClass(tempSecondClass);
			}
		}
		
		while(lotto.getThirdClass() == 0) {
			int tempThirdClass = (int)(Math.random()*44+1);
			if(tempThirdClass != lotto.getFirstClass() && tempThirdClass != lotto.getSecondClass()) {
				lotto.setThirdClass(tempThirdClass);
			}
		}
		
	}
	/**
	 * 결과를 출력하는 메소드 
	 */
	public void result() {
		if(lotto.getLottoNum() == lotto.getFirstClass()) {
			System.out.println("1등 당첨! 상금 100원을 수령하십시오. ");
		} else if(lotto.getLottoNum() == lotto.getSecondClass()) {
			System.out.println("2등 당첨! 상금 50원을 수령하십시오. " );
		} else if(lotto.getLottoNum() == lotto.getThirdClass()) {
			System.out.println("3등 당첨! 상금은 없습니다. ");
		} else 
			System.out.println("꽝!");
		
	}
}
/**
 * To. 교수님,
 * 처음 짰던 코드는 
 * while(lotto.getLottoNum() == 0) {			
		System.out.println("좋아하는 로또 번호를 입력하세요 : ");
		tempLottoNum = Integer.parseInt(sc.nextLine());
		try {
			if(tempLottoNum > 45 || tempLottoNum < 1) {
				throw new LottoNumberException("1 - 45사이만 가능합니다. " + tempLottoNum + "은/는 올바르지 않습니다. ");
			} 
		} catch (LottoNumberException lne) {
			System.out.println(lne.getMessage());
			lne.printStackTrace();
			mainOperator();
		} lotto.setLottoNum(tempLottoNum);
	}
	였습니다. try 구문에서 예외에 해당하지 않을시 바로 setLottoNum을 통해 저장한다는 생각을 바로 하지 못했었는데요. 
	catch구문까지 당도했다는것은 예외에 해당한다는것이므로 catch문 마지막에 다시 mainOperator()을 호출하여 처음부터 다시하게 했었습니다.
	하지만 이럴경우 만약 숫자를 77, 66을 입력하고 예외문이 두번 출력된뒤 정상숫자 5를 입력하였을경우 result에 해당하는 출력문이 세번이 반복되서 나오더라구요.
	catch문에서 다시 mainOperator()을 부를때 정상숫자가 나오지 않으면 getLottoNum() 메소드 밑의 setClasses()와 result() 메소드가 실행이 안된것이
	나중에 한꺼번에 나오는듯한데... 예외의 경우이기 때문에 mainOperator()을 다시 호출했을때 전에 mainOperator에서 다 수행하지 못한 메소드들은 호출된 사실이 초기화되는줄알았는데,
	아닌가요..? 그리고 특히 제 코드에서 이런일이 자주 발생하는데, 메소드 안에서 메소드를 호출하는것이 안좋은 방법일까요...?
	감사합니다.
*/