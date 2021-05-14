package chapter17;

import java.util.Scanner;

public class Task_17_10 {
	/*
	 * Напишите метод, который принимает в качестве параметров целое 
число и возвращает сумму его цифр.
	 */

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num, x;
		System.out.println("Please input a number");
		num = sc.nextInt();
		x = getSumOfNumbers(num);
		System.out.println(x);
	}

	public static int getSumOfNumbers (int num) {
		int sum=num%10; 
		while (num>0) { 
			num=num/10; 
			if (num%10<10) 
				sum = sum+num%10; 
		} 
		return sum;
	} 

}
