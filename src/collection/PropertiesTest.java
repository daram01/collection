package collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// String타입으로만 저장함. Properties(K = String, V = String)
//		Properties prop = new Properties();
//		
//		//prop.setProperty -> 값을 넣는 것.
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//		
//		//prop.getProperty -> 값을 반환 시키는 것
//		prop.getProperty("myid"); // -> value를 반환시켜줌
//		String value = prop.getProperty("myid");
//		System.out.println(value);
//		
//		Enumeration e = prop.propertyNames();
//		
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();
//			String value1 = prop.getProperty(element);
//			System.out.println(value1);
//		}
		
		Properties prop = new Properties();
		
		//파일 읽어오기. 인식시키기 (로딩작업) try, catch문 필수임
		try {
			prop.load(new FileInputStream("input.txt")); // 파일을 읽는 방식
		} catch(IOException e) {
			System.out.println("지정한 파일이 없습니다.");
			System.exit(0); // 프로그램 강제종료 명령어
		}
		
		String name = prop.getProperty("name"); // Hong Kil Dong
		String[] data = prop.getProperty("data").split(","); // 9,1,5,2,8,13,26,11,35,1
		
		//이름 출력, max, min, sum, 평균 출력해보기.
		
		// 문자열을 숫자로 -> Integer.parseInt(문자열);
		// 숫자를 문자열로 -> String.valueOf(숫자);
		
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i=0; i<data.length;i++) {
			int value = Integer.parseInt(data[i]); //문자열을 숫자로 바꾸는 역할
			if(i==0) {
				max = min = value;
			}
			
			if(max < value) {
				max = value;
			}else if(min > value) {
				min = value;
			}
			sum += value;
		}
//		min = max;
//		
//		for(int i=0; i<data.length;i++) {
//			int value = Integer.parseInt(data[i]); //문자열을 숫자로 바꾸는 역할
//			
//			if(min > value) {
//				min = value;
//			}
//		}
		
		double avg = (double)sum / data.length;
		
		System.out.println("이름 : " + name);
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
		
		
		
		
	} // main end

}
