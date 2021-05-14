package chapter17;

import java.util.Scanner;

public class Task_17_15 {
	/*
	 * Напишите метод, который принимает в качестве параметра целое чис­
ло и возвращает значение true, если это число простое; в ином случае 
метод возвращает значение false. 
	 */

	public static Scanner sc = new Scanner(System.in);

	public static boolean checkIfNumberIsSimple (int num) {
		boolean a = true;

		if (num==0) 
			a = false;
		else 
			for (int i=2; i<num; i++) {
				if ( (num!=0) & (num%i==0) )
					a = false;
			}
		return a;
	}

	public static void main(String[] args) {
		int num;
		System.out.println("Please input a number");
		num=sc.nextInt();
		System.out.println(checkIfNumberIsSimple(num));

	}

}
