package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
				//<String,String> 제네릭으로 String타입으로 고정하는 것
		HashMap<String,String> map = new HashMap(); // 기본타입은 오브젝트
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // 주로 아이디 패스워드로 사용됨. 페어구조.
		map.put("abcd", "1234");
		
		//key값만 가져오는 방법
		Set<String> keys = map.keySet(); //keySet() : key값 전체를 반환한다.
		Iterator<String> it = keys.iterator(); //반복자 패턴
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		System.out.println("==========================");
		
		//위의 방식을 향상된 for문으로 하면 코드가 간결해진다.
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("==========================");
		
		//value값만 가져오는 방법
		Collection<String> values = map.values();  // values(); : values값 전체를 반환한다.
		Iterator<String> itv = values.iterator(); 
		
		while(itv.hasNext()) {
			String value = itv.next();
			System.out.println(value);
		}
		
		System.out.println("==========================");
		
		//둘 다 가져오는 방법
		Set<Entry<String, String>> entry = map.entrySet(); //.entrySet 전체값 출력
		Iterator<Map.Entry<String, String>> ite = entry.iterator();
		
		while(ite.hasNext()) {
			Map.Entry<String, String> ent = ite.next();
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:" + key + ", [value]:" + value);
		}
		
		System.out.println("==========================");
		
		//향상된 for문을 사용해서 가져오는 방법
		for(Map.Entry<String, String> ent : map.entrySet()) { 
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:" + key + ", [value]:" + value);			
		}
		
		
//		System.out.println(map); // 값을 3개를 넣었는데, 2개만 출력됨 {myid=1234, asdf=1234} 중복을 못하게 막아놨기 때문이다.
//								 // 중복일 경우 마지막 중복데이터가 실제 데이터로 처리된다.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		//무한반복문 만들기
//		while(true) {
//			System.out.println("아이디 입력 : ");
//			String id = sc.next();
//			
//			System.out.println("비밀번호 입력 : ");
//			String password = sc.next();
//			
//			//hashmap의 값을 읽어오는 기능. get(key) -> value값 반환
//			//get("myid") -> "1234"가 반환된다.
//			//containKey(key) -> key값만 가지고 맵에 있는 것을 찾아내는 것. 존재유무 확인(반환값은 있으면 true, 없으면false)
//			if(!map.containsKey(id)) { // 입력한 값이 key값 중에 없다면.
//				System.out.println("아이디가 존재하지 않습니다. 다시 입력해 주세요.");
//				continue; // 아이디가 맞을 때 까지 계속 돌게 만듬 // 반복문의 현재 단계 중단
//			} else {
//				if(!map.get(id).equals(password)) { // 내가 입력한 아이디와 비밀번호가 맞는지 확인한다.
//					System.out.println("비밀번호가 틀립니다. 다시 입력해 주세요.");
//				} else {
//					System.out.println("로그인 성공");
//					break;
//				}
//			}
//			
//		} //while end
//		
//		map.remove("myid"); // myid 삭제
//		System.out.println(map); // 결과값 : {asdf=1234}
		

	} //main end

} //class end
