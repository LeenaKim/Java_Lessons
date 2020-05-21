package kr.ac.kopo.day14.ProfHomework;

public class CheckIDPASSException extends Exception {

	
//	public static final int errorCode = 1; // 에러코드 번호는 아무거나 상관없다. 자기 나름대로 경우를 나눠서 정하면 된다. 
	private static String[] errMsg = {"", "아이디가 올바르지 않습니다.", "패스워드가 잘못되었습니다. "}; // 아니면 에러코드에따라 배열형식으로 메세지 출력해도 된다. 
		// 만약 스태틱이 아니라면 익셉션을 불러오기위해 객체를 만들어야하고, 컴퓨터가 객체를 타고 에러메세지까지 도달하기가 복잡하기때문에 static으로, 클래스 생성시 함께 처음부터 만들어지도록한다. 
	public CheckIDPASSException() {
		super();
	}

	public CheckIDPASSException(String message) {
		super(message);
	}
	
	public CheckIDPASSException(int errorCode) {
		this(errMsg[errorCode]); //Main에서 에러코드를 던져주면 그 인덱스에 해당하는 에러메세지 출력 
	}

	
}
