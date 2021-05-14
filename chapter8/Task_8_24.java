package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры целое трехзначное
 положительное число и изменяет его следующим образом:
 • для чисел, больших 500, - переставляет местами числа единиц и
 сотен (вместо 672 - 276);
 • в остальных числах переставляются местами числа десятков и
 единиц (вместо 363 - 336).
 Программа должна вывести на экран новое значение переменной.
 */

public class Task_8_24 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please input a positive 3-digit number");
		int a = sc.nextInt();
		int a1 = a/100;
		int a2 = a%100/10;
		int a3 = a%10;

		if (a>500)
			a=a3*100+a2*10+a1;
		else
			a=a1*100+a3*10+a2;
		System.out.println(a);
	}

}
