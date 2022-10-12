package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
				//<String,String> ���׸����� StringŸ������ �����ϴ� ��
		HashMap<String,String> map = new HashMap(); // �⺻Ÿ���� ������Ʈ
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // �ַ� ���̵� �н������ ����. ����.
		map.put("abcd", "1234");
		
		//key���� �������� ���
		Set<String> keys = map.keySet(); //keySet() : key�� ��ü�� ��ȯ�Ѵ�.
		Iterator<String> it = keys.iterator(); //�ݺ��� ����
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		System.out.println("==========================");
		
		//���� ����� ���� for������ �ϸ� �ڵ尡 ����������.
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("==========================");
		
		//value���� �������� ���
		Collection<String> values = map.values();  // values(); : values�� ��ü�� ��ȯ�Ѵ�.
		Iterator<String> itv = values.iterator(); 
		
		while(itv.hasNext()) {
			String value = itv.next();
			System.out.println(value);
		}
		
		System.out.println("==========================");
		
		//�� �� �������� ���
		Set<Entry<String, String>> entry = map.entrySet(); //.entrySet ��ü�� ���
		Iterator<Map.Entry<String, String>> ite = entry.iterator();
		
		while(ite.hasNext()) {
			Map.Entry<String, String> ent = ite.next();
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:" + key + ", [value]:" + value);
		}
		
		System.out.println("==========================");
		
		//���� for���� ����ؼ� �������� ���
		for(Map.Entry<String, String> ent : map.entrySet()) { 
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:" + key + ", [value]:" + value);			
		}
		
		
//		System.out.println(map); // ���� 3���� �־��µ�, 2���� ��µ� {myid=1234, asdf=1234} �ߺ��� ���ϰ� ���Ƴ��� �����̴�.
//								 // �ߺ��� ��� ������ �ߺ������Ͱ� ���� �����ͷ� ó���ȴ�.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		//���ѹݺ��� �����
//		while(true) {
//			System.out.println("���̵� �Է� : ");
//			String id = sc.next();
//			
//			System.out.println("��й�ȣ �Է� : ");
//			String password = sc.next();
//			
//			//hashmap�� ���� �о���� ���. get(key) -> value�� ��ȯ
//			//get("myid") -> "1234"�� ��ȯ�ȴ�.
//			//containKey(key) -> key���� ������ �ʿ� �ִ� ���� ã�Ƴ��� ��. �������� Ȯ��(��ȯ���� ������ true, ������false)
//			if(!map.containsKey(id)) { // �Է��� ���� key�� �߿� ���ٸ�.
//				System.out.println("���̵� �������� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
//				continue; // ���̵� ���� �� ���� ��� ���� ���� // �ݺ����� ���� �ܰ� �ߴ�
//			} else {
//				if(!map.get(id).equals(password)) { // ���� �Է��� ���̵�� ��й�ȣ�� �´��� Ȯ���Ѵ�.
//					System.out.println("��й�ȣ�� Ʋ���ϴ�. �ٽ� �Է��� �ּ���.");
//				} else {
//					System.out.println("�α��� ����");
//					break;
//				}
//			}
//			
//		} //while end
//		
//		map.remove("myid"); // myid ����
//		System.out.println(map); // ����� : {asdf=1234}
		

	} //main end

} //class end
