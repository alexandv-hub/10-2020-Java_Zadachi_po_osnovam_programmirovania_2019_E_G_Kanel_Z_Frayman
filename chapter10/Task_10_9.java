package chapter10;

public class Task_10_9 {
	/*
	 *������ �����, �������������� ������ ���� �� ����������� ����
��� - ������ � ���� ������ ��������� ������ ������ ��� � �����, �� 
���� � ������ �������� ������ �� ��������� � ����������, � ��������
������ �������. 
	 */

	public static void main(String[] args) {

		int a = (int) ( 100*Math.random() ) ;
		System.out.println(a);

		int up = a+11;
		int down = a-11;

		int guess = down + (int)( (up-down+1)*Math.random() ); 
		System.out.println(guess);

		if (guess == a)
			System.out.println("������");
		if (guess > a)
			System.out.println("������� �������");
		if (guess < a)
			System.out.println("������� ���������");	

	}

}
