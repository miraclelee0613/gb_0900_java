package controllStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
//      ����ڿ��� �Ʒ��� �޴��� ����ϰ�
//      ��ȣ�� �Է¹޴´�.
		int inputNum = 0;
		String msg = null;
		final String RED = "������", BLACK = "������", YELLOW = "�����", WHITE = "���";
//      1. ������
//      2. ������
//      3. �����
//      4. ���
		System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\n", RED, BLACK, YELLOW, WHITE);
		System.out.print("�Է� : ");
		Scanner sc = new Scanner(System.in);
		inputNum = Integer.parseInt(sc.next());

//      ����ڰ� �Է��� ��ȣ�� ������ ����� ����Ѵ�.
		switch (inputNum) {
		case 1:
			msg = "red";
			break;
		case 2:
			msg = "black";
			break;
		case 3:
			msg = "yellow";
			break;
		case 4:
			msg = "white";
			break;
		default:
			msg = "�߸� �Է��ϼ̽��ϴ�.";
			break;
		}
		System.out.println(msg);
	}
}