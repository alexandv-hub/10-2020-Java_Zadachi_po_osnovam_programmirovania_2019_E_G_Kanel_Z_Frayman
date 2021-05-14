package chapter9;

import java.util.Scanner;

public class Task_9_25 {
	/*
	 * Целое трехзначное число называется «ЯМОЙ», если его средняя цифра 
меньше крайних. 
Напишите класс, который принимает с клавиатуры положительное 
трехзначное число и проверяет, является ли оно «ЯМОЙ». 
	 */
	public static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		System.out.println("Введитеположительное трехзначное число");
		int a = sc.nextInt();
		
		int a1, a2, a3;
		a1 = a/100;
		a2 = a%100/10;
		a3 = a%10;
		
		if ( (a1>a2) & (a2<a3) )
		System.out.println("Яма");
		else
			System.out.println("Не яма");
	}

}
