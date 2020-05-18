package kr.ac.kopo.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map : key, value 쌍으로 이루어진 집합(순서 X, key 중복 X)
 *  - HashMap
 *  - TreeMap
 */

public class MapMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// key : id, value : password 저장 
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("패스워드 변경서비스입니다. ");
		System.out.println("변경할 아이디를 입력하세요 : ");
		
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다. ");
			System.exit(0);
		}
		
		//굳이 else를 써서 id를 key로 갖고있는 경우를 쓸 필요가 없다. 왜? 이미 system.exit을 수행하지 않고, 즉 프로그램이 종료되지 않고 내려왔다는것은 입력 id를key로 가지고있다는것이기때문.
		System.out.print("현재 패스워드를 입력하세요: ");
		String password = sc.nextLine();
		
		// equals()를 쓸때, 객체.equals(상수) 보다, 상수.equals(객체)를 권장한다.왜? 객체가 null이 될 수 있어서.
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다. ");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		// 여기까지 프로그램이 종료되지 않고 내려왔다는것은 이제 정말 패스워드를 바꿀 수 있다는 것.
		System.out.print("변경할 패스워드를 입력하세요. :");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("비밀번호가 변경됬습니다. ");
		
		// map 출력하기 
		System.out.println("< 전체 회원 목록 >");
		
		Set<Entry<String, String>> entry = map.entrySet(); // or Set<Map.Entry<String, String>>
			// map 클래스 안에는 Entry라는 작은 클래스가 있다. map을 출력할때. 
		
		// <방법 3> : 반환형이 set이니 iterator를 이용할 수 있다.
		Iterator<Entry<String, String>> ite = entry.iterator();
		while(ite.hasNext()) {
			Entry<String, String> e = ite.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println("id : " + key + ", password : " + value);
		}
		
		/*
		// <방법 2> : entrySet() - 키와 밸류 모두 필요할때 
		for(Entry e : entry) {
			System.out.println("id : " + e.getKey() + ", password : " + e.getValue());
		}
		*/
		/* <방법 1> : keySet() - 키만 필요할때 
		Set<String> keys = map.keySet(); // entrySet() : map의 모든 쌍을 set으로 바꿔준다. keySet() : key값으로 구성되있는 set형태로 반환.
		for(String key : keys) {
			System.out.println("id : " + key + ", password : " + map.get(key)); // key밖에 리턴을 안하므로 밸류는 map.get(key) 해줘야한다. 
		}
		*/
		
	}

}
