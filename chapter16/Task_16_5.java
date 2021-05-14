package chapter16;

public class Task_16_5 {
	/*
	 * Напишите класс, который выводит на экран: 
в первой строке все четные двузначные числа, 
во второй строке - двузначные числа, делящиеся на 3 без остатка, 
в третьей строке - двузначные числа, делящиеся на 4 без остатка, 
и так далее. 
	 */

	public static void main(String[] args) {

		int n = 2;

		for (int j=10; j<=99; j++) {
			for (int i = 10; i<=99; i++) {
				if (i%n==0)
					System.out.print(i + " ");
			}
			n++;
			System.out.println();
		}

	}
}
