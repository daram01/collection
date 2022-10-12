package collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// StringŸ�����θ� ������. Properties(K = String, V = String)
//		Properties prop = new Properties();
//		
//		//prop.setProperty -> ���� �ִ� ��.
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//		
//		//prop.getProperty -> ���� ��ȯ ��Ű�� ��
//		prop.getProperty("myid"); // -> value�� ��ȯ������
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
		
		//���� �о����. �νĽ�Ű�� (�ε��۾�) try, catch�� �ʼ���
		try {
			prop.load(new FileInputStream("input.txt")); // ������ �д� ���
		} catch(IOException e) {
			System.out.println("������ ������ �����ϴ�.");
			System.exit(0); // ���α׷� �������� ��ɾ�
		}
		
		String name = prop.getProperty("name"); // Hong Kil Dong
		String[] data = prop.getProperty("data").split(","); // 9,1,5,2,8,13,26,11,35,1
		
		//�̸� ���, max, min, sum, ��� ����غ���.
		
		// ���ڿ��� ���ڷ� -> Integer.parseInt(���ڿ�);
		// ���ڸ� ���ڿ��� -> String.valueOf(����);
		
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i=0; i<data.length;i++) {
			int value = Integer.parseInt(data[i]); //���ڿ��� ���ڷ� �ٲٴ� ����
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
//			int value = Integer.parseInt(data[i]); //���ڿ��� ���ڷ� �ٲٴ� ����
//			
//			if(min > value) {
//				min = value;
//			}
//		}
		
		double avg = (double)sum / data.length;
		
		System.out.println("�̸� : " + name);
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("��� : " + avg);
		
		
		
		
		
		
		
	} // main end

}
