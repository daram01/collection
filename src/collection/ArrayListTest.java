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
		
//		ArrayList list = new ArrayList(20); // Object 타입으로 형변환 되어있음.
//		// 다양한 형태로 가능
//		list.add("1"); 
//		list.add("1"); 
//		list.add(new Integer(1));
//		list.add(1);
//		list.add("2");
//		list.add(2);
		
//		list.add("1"); //String 타입이지만 Object 타입으로 형변환 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		String str = (String)list.get(0); // 값을 캐스팅해야함. Object -> String 
//		
//		System.out.println(str); // 1
//		
//		int sum = 0;
//		
//		//향상된 for문
//		for(Object obj : list) {
//			String str2 = (String)obj; // 문자열 "1", "2", "3", "4", "5"
//			System.out.println(str2); // 1 ~ 5
//			int num = Integer.parseInt(str2); // 문자열을 숫자로 만들어주는 작업
//			sum += num;
//		}
//		System.out.println("sum = " + sum);
//		
//		for(int i=0;i<list.size();i++) { // list.size() 실제 데이터가 들어있는 크기를 구할 수 있다.
//			System.out.println(list.get(i));
//		} // 1,2,3,4,5
//		
//		list.remove(3); // 인덱스에 있는 값을 지우는 방법
//		
//		for(int i=0;i<list.size();i++) { 
//			System.out.println(list.get(i));
//		} // 1,2,3,5
		
		
		// Stack
		
//		Stack st = new Stack(); // 먼저 들어온 것이 가장 마지막에 나간다.
//		st.push("1"); // 데이터를 넣는 역할을 한다.
//		st.push("2");
//		st.push("3");
//		
//		try {
//		System.out.println((String)st.pop()); // 3 // .pop -> 데이터를 꺼내는 역할을 한다. (스택에서 삭제)
//		System.out.println((String)st.pop());		// .peek -> 데이터를 읽는 역할을 한다. 
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());
//		} catch(EmptyStackException e) {
//			System.out.println("stack이 비어있습니다.");
//		}
//		
//		while(!st.empty()) {
//			System.out.println((String)st.pop());
//		}
		
//		ArrayList list = new ArrayList();
		
//		list.add("1"); //String 타입이지만 Object 타입으로 형변환 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		//iterator (반복자 패턴)
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) { //데이터 존재 유무 확인
//			String str = (String)it.next(); //.next -> 값을 읽은 뒤, 가지고 오는 역할
//			System.out.println(str);
//		}
		
		
		//제네릭 -> 타입을 한정시킨다.
		
//		ArrayList<String> list = new ArrayList<String>(); // String 타입의 데이터를 받겠다는 뜻. 
//		
//		list.add("1"); // ok. String타입이기 때문에.
//		//list.add(1); // x
//		//list.add(new Integer(1)); // x
//		//list.add(3.14); // x
//		
//		ArrayList<Integer> list2 = new ArrayList<Integer>(); // Integer 타입의 데이터를 받겠다는 뜻. 
//		
//		//list2.add("1"); // x
//		list2.add(1); // ok. Integer타입이기 때문에.
//		list2.add(new Integer(1)); // ok. Integer타입이기 때문에.
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
//		while(it.hasNext()) { //데이터 존재 유무 확인
//			String str = it.next(); //.next -> 값을 읽은 뒤, 가지고 오는 역할
//			System.out.println(str);
//		}
		
		//Set -> 데이터가 들어가는 순서가 따로 없다. add처럼 순서대로가 아님. 중복 허용하지 않음.
		
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
		
		
		// 중복없는 빙고판 만들기
//		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int[5][5];
//		
//		for(int i=0;set.size()<25;i++) {
//			set.add((int)(Math.random() * 50)+1);
//		}
//		
//		// 강제로 섞어주는 기능 
//		ArrayList list = new ArrayList(set);
//		Collections.shuffle(list); // 그냥 사용 방식만 익히면 됨.
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
		// 특징 : 값이 정렬되어진다.
		// 		반드시 값으로 사용되는 해당 클래스 안에에는 정렬 조건이 오버라이딩 되어있어야 한다.
		//		implements Comparable (Integer, String....)
//		TreeSet<Integer> set = new TreeSet<Integer>();
//		set.add(new Integer(2)); // 인티저 안에 오름차순으로 정렬해달라고 이미 되어있음.
//		set.add(5);
//		set.add(1);
//		set.add(4);
//		set.add(3);
//		
//		System.out.println(set); // set은 원래 순서가 없는데 출력하면 1,2,3,4,5 로 나온다.
//		
//		Iterator<Integer> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Integer intg = it.next();
//			System.out.println(intg);
//		}
		
		
//		TreeSet<Student> set = new TreeSet<Student>();
//		
//		Student s1 = new Student("kim",1,1,10,10,10); // 객체 생성
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
