package chapter10;

public class Task_10_3 {
	/*
	 * �������� �����, ������� ���������� � ������� �� ����� 2 ��������� 
����� ����� �� ��������� ������������ (������� � �������������, 
� �������������). 
����� ����� � ��������� ������ ����� ������ ������� ���������� �� 
���� ���� ����� - � ��������������� ��������� ����������, � � ��� 
����� ������ - ���������� �� ���� ���� �����, ���� � �������������
��� ��������� ����������. 
	 */

	public static void main(String[] args) {
		
		int a = (int) (10*Math.random()-10);
		int b = (int) (10*Math.random()-10);
		System.out.println(a);	
		System.out.println(b);
		
		if (a>b)
			System.out.println("���������� ����� - ��� " + a);
		if (a<b)
			System.out.println("���������� ����� - ��� " + b);
		if (a>b)
			System.out.println("���������� ����� - ��� " + b);
		if (a<b)
			System.out.println("���������� ����� - ��� " + a);

	}

}
