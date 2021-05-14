package chapter8;

import java.util.Scanner;

public class Task_8_26 {
	/**
	 Симметричным («палиндромом») называется число, которое дает оди-
наковое значение при чтении его справа налево и слева направо (на-
пример, 787). 
Напишите класс, который принимает с клавиатуры положительное чис-
ло (не большее 99999) и проверяет, является ли это число палиндромом. 
Класс должен выводить на экран соответствующее текстовое сооб-
щение. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please input a positive up to 5-digit integer number");
		int a = sc.nextInt();

		int a1 = a/10000;
		int a2 = a%10000/1000;
		int a3 = a%1000/100;
		int a4 = a%100/10;
		int a5 = a%10;

		if (a1!=0) 
			if ( (a1==a5) & (a2==a4) )
				System.out.println("Данное число является палиндромом");
		else 
			System.out.println("Данное число не является палиндромом");
		
		if ( (a1==0)&(a2!=0) )
			if ( (a2==a5) & (a3==a4) )
					System.out.println("Данное число является палиндромом");
		else 
			System.out.println("Данное число не является палиндромом");

		if ( (a2==0)&(a2==0)&(a3!=0) ) 
			if (a3==a5) 
				System.out.println("Данное число является палиндромом");
		else 
			System.out.println("Данное число не является палиндромом");

		if ( (a1==0)&(a2==0)&(a3==0)&(a4!=0) ) 
			if (a4==a5) 
				System.out.println("Данное число является палиндромом");
		else 
			System.out.println("Данное число не является палиндромом");
	}

}



