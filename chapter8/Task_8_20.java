package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры трехзначное поло­
 жительное число и проверяет, содержится ли в нем хотя бы один ноль.
 По результатам проверки надо вывести на экран соответствующее тек­
 стовое сообщение.
 */

public class Task_8_20 {

	public static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			System.out.println("Please input a positive 3-digit number");
			int a = sc.nextInt();
			int a1 = a/100;
			int a2 = (a%100)/10;
			int a3 = a%10;
			if ( (a1==0) || (a2==0) || (a3==0) )
				System.out.println("Данное число содержит хотя бы один ноль");
			else 
				System.out.println("Данное число не содержит ни одного ноля");
	}

}
