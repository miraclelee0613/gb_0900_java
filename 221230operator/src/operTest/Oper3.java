package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��) 183 -> 183 ���
//			183.5 -> 183.5 ���
//		���� �����ڸ� ���!
		// 1��°
		double num = 0;	// �Է��� ���� ����. �Է¹��� ���� ������ ���� �Ǽ��� ����
		boolean tof = false;	// ����/�Ǽ� ���θ� ������ ����
		String result = null;	// ���Ĺ��ڸ� �����ϴ�, ����� ���ڿ� �޽����� ���� ����
		
		Scanner sc = new Scanner(System.in);	// ��ĳ�� ����
//		�Է� �ȳ��� ���� �޽��� ���
		System.out.println("����/�Ǽ� �Ǻ����Դϴ�.\n���ڸ� �Է����ּ���.");
		System.out.print("�Է� : ");
		num = sc.nextDouble();	// �Է°��� ������ ����.
		
		tof = num - (int)num == 0;	// �Ǽ� - ������ ���� 0�̶�� true�� ������ ������� �� �� �� ����.
		result = tof ? "�ᱣ��(����) : %.0f" : "�ᱣ��(�Ǽ�) : %.1f";	// �� ���ǽ��� ����� ���ǿ� ���� ���Ĺ��ڸ� �ٸ��� ����
		
//		System.out.printf(result, tof ? (int)num : num);	// ������ %f�� ����� �Ǽ��̹Ƿ� �Ķ���Ϳ����� ���׿����ڸ� ����� �ʿ䰡 ����.
		System.out.printf(result, num);
		
		
		// ���ο� �� �ڵ�
//      key > 0 ? ��� : ����
//      ��� -> �Ǽ� > ����
//      ���� -> �Ǽ� < ����
//      key > 0 ? ���(�Ǽ� > ���� ? �Ǽ� : ����) : ����(�Ǽ� < ���� ? �Ǽ� : ����)
//      String.valueOf
      
//      result = key > 0 ? 
//            key > (int)key ? key : (int)key 
//                  : key < (int)key ? key : (int)key;
		// �õ��غ����� �����
//		result = "" + (num > 0 ? (num > (int)num ? num : (int)num) : (num < (int)num ? num : (int)num));
//		result = num > 0 ? (num > (int)num ? "%.0f" : "%.0f") : (num < (int)num ? "%.0f" : "%.0f");
//		System.out.printf(result, num > 0 ? /*���*/ (num > (int)num ? /**/num : (int)num)
//				: /*����*/(num < (int)num ? num : (int)num));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}