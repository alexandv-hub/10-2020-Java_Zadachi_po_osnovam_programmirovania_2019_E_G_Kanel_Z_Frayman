package chapter11;

import java.util.Scanner;

public class Task_11_7 {
	/*
	 * Напишите вариант предыдущей задачи, исходя из того, что неизвестно, 
какое из вводимых с клавиатуры значений больше, а какое - меньше. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please input the 1st integer number");
		int a = sc.nextInt();
		System.out.println("Please input the 2nd integer number");
		int b = sc.nextInt();

		int s = 0;

		if (a>b) {
			for (int i=1; i<=20; i++) {
				int x = a + (int) (Math.random()*(b-a+1));
				System.out.println(x);
				s++;
			}
		}
		else  
			for (int i=1; i<=20; i++) {
				int x = a + (int) (Math.random()*(b-a+1));
				System.out.println(x);
				s++;
			}
		System.out.println("Кол-во повторов = " + s); 
	}

}




