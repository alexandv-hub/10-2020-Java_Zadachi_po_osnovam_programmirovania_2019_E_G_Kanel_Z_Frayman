package chapter9;

import java.util.Scanner;

public class Task_9_16 {
	/*
	 * Определим следующие периоды в течение суток: утро - с 6 (включая) 
до 10 (не включая) часов, день - с 10 (не включая) до 18 (включая}, ве­
чер - с 18 (не включая) до 22 (включая}, ночь - с 22 (не включая) до 
6 часов следующего дня (не включая). 
Напишите класс, который принимает с клавиатуры целое число, кото­
рое должно указывать на определенный час в сутках, и выводит на эк­
ран сообщение, к какому периоду в сутках этот час относится. В случае 
если введенное значение не позволяет выполнить указанное действие, 
следует вывести на экран соответствующее текстовое сообщение. 
	 */

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Введите целое число, которое должно указывать на определенный час в сутках");
		int a = sc.nextInt();
		
		boolean morning = (6 <= a) & (a < 10);
		boolean day = (10 <= a) & (a < 18);
		boolean evening = (18 <= a) & (a <= 22);
		boolean night = ( (22 < a) & (a <= 24) || ( (0 <= a) & (a < 6) ) );
		
		if (morning == true)
			System.out.println("Утро");
		if (day == true)
			System.out.println("День");
		if (evening == true)
			System.out.println("Вечер");
		if (night == true)
			System.out.println("Ночь");
		
	}

}
