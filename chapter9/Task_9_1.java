package chapter9;

import java.util.Scanner;

public class Task_9_1 {
	/*
 ���� ��������� ������� � ����������� ���� int: (a>1O && b>1OO) 
1. ��������� �������: 
�        | 20   | 6     | 28    | 10    | 10    |
b        | 231  | 131   | 87    | 10    | 31    |
�������� | true | false | false | false | false |
���������

2. ��� ����� �������� ���������� � �������� ��������� ������ 
����� false?
// ��� a<=10
	 */

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Please input the value of a");
		int a = sc.nextInt();
		System.out.println("Please input  the value of b");
		int b = sc.nextInt();
		boolean c = (a>10 && b>100);
		System.out.println(c);
	}

}
