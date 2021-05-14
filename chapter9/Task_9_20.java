package chapter9;

import java.util.Scanner;

public class Task_9_20 {
	/*
	 * Напишите класс, который принимает с клавиатуры промежуток вре­
мени, выраженный в секундах, и выводит на экран его же, но выра­
женный в минутах и секундах. 
Если промежуток времени превышает час, то надо не производить пе­
ресчет, а просто вывести на экран текстовое сообщение Расчет не 
производится.
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Введите  промежуток времени, выраженный в секундах");
		int a = sc.nextInt();
		int min, sec; 

		if ( (a <= 0 ) || (a>3600) )
			System.out.println("Расчет не производится");
		else {
			min = a/60;
			sec = a%60;
			System.out.println(min + " минут " + sec + " секунд");
		}
	}
}
