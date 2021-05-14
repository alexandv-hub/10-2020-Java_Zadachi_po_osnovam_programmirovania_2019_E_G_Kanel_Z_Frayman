package chapter9;

import java.util.Scanner;

public class Task_9_5 {
	/*
 На каждом этаже многоэтажного дома расположены три квартиры; 
счет квартир идет слева направо. Например, на первом этаже квартира 
№ 1 расположена слева, квартира № 2 - в центре, квартира № 3 -
справа, и так далее. 
Напишите класс, который принимает с клавиатуры номер квартиры и вы­
водит на экран следующую информацию: на каком этаже она расположе­
на, и какое место (слева, справа или в центре) она занимает на этом этаже.
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please input a flat number");
		int flatNum = sc.nextInt();

		int floor = (flatNum/3);

		if (flatNum <= 3) {

			if (flatNum%3==1)
				System.out.println("Квартира расположена на 1 этаже слева");
			if (flatNum%3==2)
				System.out.println("Квартира расположена на 1 этаже в центре");
			if (flatNum%3==0)
				System.out.println("Квартира расположена на 1 этаже справа");
		}
		else {
			if (flatNum%3==1) {
				floor++;
				System.out.println("Квартира расположена на " + floor + " этаже слева");
			}
			if (flatNum%3==2) {
				floor++;
				System.out.println("Квартира расположена на " + floor + " этаже в центре");
			}
			if (flatNum%3==0)
				System.out.println("Квартира расположена на " + floor + " этаже справа");
		}	
	}
}


