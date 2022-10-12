package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList
		
//		ArrayList list = new ArrayList(20); // Object Ÿ������ ����ȯ �Ǿ�����.
//		// �پ��� ���·� ����
//		list.add("1"); 
//		list.add("1"); 
//		list.add(new Integer(1));
//		list.add(1);
//		list.add("2");
//		list.add(2);
		
//		list.add("1"); //String Ÿ�������� Object Ÿ������ ����ȯ �߻�
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		String str = (String)list.get(0); // ���� ĳ�����ؾ���. Object -> String 
//		
//		System.out.println(str); // 1
//		
//		int sum = 0;
//		
//		//���� for��
//		for(Object obj : list) {
//			String str2 = (String)obj; // ���ڿ� "1", "2", "3", "4", "5"
//			System.out.println(str2); // 1 ~ 5
//			int num = Integer.parseInt(str2); // ���ڿ��� ���ڷ� ������ִ� �۾�
//			sum += num;
//		}
//		System.out.println("sum = " + sum);
//		
//		for(int i=0;i<list.size();i++) { // list.size() ���� �����Ͱ� ����ִ� ũ�⸦ ���� �� �ִ�.
//			System.out.println(list.get(i));
//		} // 1,2,3,4,5
//		
//		list.remove(3); // �ε����� �ִ� ���� ����� ���
//		
//		for(int i=0;i<list.size();i++) { 
//			System.out.println(list.get(i));
//		} // 1,2,3,5
		
		
		// Stack
		
//		Stack st = new Stack(); // ���� ���� ���� ���� �������� ������.
//		st.push("1"); // �����͸� �ִ� ������ �Ѵ�.
//		st.push("2");
//		st.push("3");
//		
//		try {
//		System.out.println((String)st.pop()); // 3 // .pop -> �����͸� ������ ������ �Ѵ�. (���ÿ��� ����)
//		System.out.println((String)st.pop());		// .peek -> �����͸� �д� ������ �Ѵ�. 
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());
//		} catch(EmptyStackException e) {
//			System.out.println("stack�� ����ֽ��ϴ�.");
//		}
//		
//		while(!st.empty()) {
//			System.out.println((String)st.pop());
//		}
		
//		ArrayList list = new ArrayList();
		
//		list.add("1"); //String Ÿ�������� Object Ÿ������ ����ȯ �߻�
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		//iterator (�ݺ��� ����)
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) { //������ ���� ���� Ȯ��
//			String str = (String)it.next(); //.next -> ���� ���� ��, ������ ���� ����
//			System.out.println(str);
//		}
		
		
		//���׸� -> Ÿ���� ������Ų��.
		
//		ArrayList<String> list = new ArrayList<String>(); // String Ÿ���� �����͸� �ްڴٴ� ��. 
//		
//		list.add("1"); // ok. StringŸ���̱� ������.
//		//list.add(1); // x
//		//list.add(new Integer(1)); // x
//		//list.add(3.14); // x
//		
//		ArrayList<Integer> list2 = new ArrayList<Integer>(); // Integer Ÿ���� �����͸� �ްڴٴ� ��. 
//		
//		//list2.add("1"); // x
//		list2.add(1); // ok. IntegerŸ���̱� ������.
//		list2.add(new Integer(1)); // ok. IntegerŸ���̱� ������.
//		//list2.add(3.14); // x
		
		
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("1"); 
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0); 
//		
//		Iterator<String> it = list.iterator();
//		
//		while(it.hasNext()) { //������ ���� ���� Ȯ��
//			String str = it.next(); //.next -> ���� ���� ��, ������ ���� ����
//			System.out.println(str);
//		}
		
		//Set -> �����Ͱ� ���� ������ ���� ����. addó�� ������ΰ� �ƴ�. �ߺ� ������� ����.
		
//		HashSet set = new HashSet();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add(new Integer(1));
//		
//		System.out.println(set); //[1, 1, 2, 4]
		
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
		
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add("5");
//		
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
		
		
		// �ߺ����� ������ �����
//		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int[5][5];
//		
//		for(int i=0;set.size()<25;i++) {
//			set.add((int)(Math.random() * 50)+1);
//		}
//		
//		// ������ �����ִ� ��� 
//		ArrayList list = new ArrayList(set);
//		Collections.shuffle(list); // �׳� ��� ��ĸ� ������ ��.
//		
//		
//		Iterator<Integer> it = list.iterator();
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				bingo[i][j] = it.next();
//			}
//		}
//		
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				System.out.print(bingo[i][j] + " ");	
//			}
//			System.out.println();
//		}
		
		// TreeSet
		// Ư¡ : ���� ���ĵǾ�����.
		// 		�ݵ�� ������ ���Ǵ� �ش� Ŭ���� �ȿ����� ���� ������ �������̵� �Ǿ��־�� �Ѵ�.
		//		implements Comparable (Integer, String....)
//		TreeSet<Integer> set = new TreeSet<Integer>();
//		set.add(new Integer(2)); // ��Ƽ�� �ȿ� ������������ �����ش޶�� �̹� �Ǿ�����.
//		set.add(5);
//		set.add(1);
//		set.add(4);
//		set.add(3);
//		
//		System.out.println(set); // set�� ���� ������ ���µ� ����ϸ� 1,2,3,4,5 �� ���´�.
//		
//		Iterator<Integer> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Integer intg = it.next();
//			System.out.println(intg);
//		}
		
		
//		TreeSet<Student> set = new TreeSet<Student>();
//		
//		Student s1 = new Student("kim",1,1,10,10,10); // ��ü ����
//		Student s2 = new Student("pim",3,1,10,10,10);
//		Student s3 = new Student("aim",6,1,10,10,10);
//		Student s4 = new Student("sim",9,1,10,10,10);
//		Student s5 = new Student("fim",4,1,10,10,10);
//		
//		set.add(s1);
//		set.add(s2);
//		set.add(s3);
//		set.add(s4);
//		set.add(s5);
//		
//		Iterator<Student> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s.toString());
//		}
		
	}

}
