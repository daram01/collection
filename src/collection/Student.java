package collection;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Comparable {
	
	String name;
	int ban;
	int no;
	int kor,eng,math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTotal() / 3.0f;
		
		
	}

	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Student) {
			Student tmp = (Student)o;
//			return this.ban - tmp.ban; // 오름차순 // 여기서 값이 0 이 나오면 같은 값, 양수가 나오면 앞이 큰 값, 음수가 나오면 뒤가 큰 값
			return tmp.ban - this.ban; // 내림차순
		}
		
		return -1; // 기본값으로 만드는 과정
	}


	
}
