package chapter9;

import java.util.Scanner;

public class Task_9_8 {
	/*
	 Назовем билет с шестизначным номером «счастливым», если сумма 
первых трех его цифр равна сумме последних трех его цифр и обе эти 
суммы являются четными. 
Напишите класс, который принимает с клавиатуры шестизначный но­
мер билета и проверяет, является ли он «счастливым» или не является. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input a 6-digit number");
		int a = sc.nextInt();
		int a1 = a/100000;
		int a2 = a%100000/10000;
		int a3 = a%10000/1000;
		int n1 = (a1+a2+a3);
		int a4 = a%1000/100;
		int a5 = a%100/10;
		int a6 = a%10;
		int n2 =(a4+a5+a6);

		if ( (n1==n2) & (n1%2==0) & (n2%2==0) ) 		
		System.out.println("Билет является счастливым");
		else
			System.out.println("Билет не является счастливым");
	}

}
