package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3���� ������ �ѹ��� �Է¹��� ��
//		�� ������ ���� ���
//		next()�� ���.
		
//		�Է��� �ޱ����� Scanner�� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
//		�Է¹��� ������ ������ ������ �����Ѵ�.
		int num1 = 0, num2 = 0, num3 = 0;
		int result = 0;
		
//		������ �Է¹ޱ� ���� ����Ѵ�.
		System.out.println("�� ���� ������ ���⸦ ���������� �Ͽ� �Է����ּ���.");
		System.out.print("�Է� : ");
		
//		������ �� �� �Է¹޴´�.
//		�Է¹��� ���ڿ��� ������ ����ȯ�Ѵ�.
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		num3 = Integer.parseInt(sc.next());
		
//		����ȯ�� ������ �������Ѵ�.
		result = num1 * num2 * num3;
		
//		������� ����Ѵ�.
		System.out.print("��� : " + result);
	}
}