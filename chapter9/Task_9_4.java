package chapter9;

import java.util.Scanner;

public class Task_9_4 {
	/*
 «Красивое» число - это целое число между 40 и 100 (включительно). 
Цель следующих четырех фрагментов - проверка, является ли целое чис­
ло number «красивым».

1. 
if (number>=40 || number<=100) 
System.out.println("Да"); 
else System.out.println ("Нет"); 
// не выполняет

2. 
if (number>=40 && number<=100) 
System.out.println ("Да"); 
else System.out.println ("Нет"); 
// выполняет

3. 
if (number<40 && number> 100) 
System.out.println ("Нет"); 
else System.out.println ("Да"); 
// не выполняет

4. 
if (number > 39 && number < 101) 
System.out.println ("Да"); 
System.out.println ("Нет"); 
// выполняет

1. Для каждого фрагмента отметьте, выполняет ли он поставленную 
задачу. 

2. Для фрагмента, который НЕ выполняет поставленную задачу, 
приведите пример, доказывающий его ошибочность. 
1-30
3-40
4-41

(Фрагмент выполняет поставленную задачу, если он печатает сообщение 
Да для всех «красивых» чисел и сообщение Нет для всех остальных чисел.) 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input the value of number");
		int number = sc.nextInt();

		if (number>=40 || number<=100) 
			System.out.println("Да"); 
		else System.out.println ("Нет"); 
		// не выполняет

		if (number>=40 && number<=100) 
			System.out.println ("Да"); 
		else System.out.println ("Нет"); 
		// выполняет


		if (number<40 && number> 100) 
			System.out.println ("Нет"); 
		else System.out.println ("Да"); 
		// не выполняет


		if (number > 39 && number < 101) 
			System.out.println ("Да"); 
		System.out.println ("Нет"); 
		// не выполняет

	}

}
