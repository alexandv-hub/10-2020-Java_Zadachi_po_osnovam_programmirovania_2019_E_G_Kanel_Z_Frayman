package chapter13;

import java.util.Scanner;

public class Task_13_4 {
	/*
	 * Напишите класс, который принимает с клавиатуры положительное 
целое число и выводит на экран все его делители. 
Кроме того, класс должен определять количество и сумму делителей и 
выводить результаты на экран. 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a, sumDividers=0, numDividers=0;
		
		System.out.println("Введите положительное целое число");
		a = sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			if (a%i==0) {
				System.out.println(i + " - делитель");
				numDividers++;
				sumDividers = sumDividers + i;
			}
		}
		System.out.println("Кол-во делителей - " + numDividers);
		System.out.println("Сумма всех делителей = " + sumDividers);
	}

}
