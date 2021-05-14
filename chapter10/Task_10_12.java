package chapter10;

import java.util.Scanner;

public class Task_10_12 {
	/*
	 * Напишите класс, который повторяет предыдущее задание, но предос­
тавляет игроку получить, если он того захочет, еще и четвертую карту. 
Это, например, можно сделать через ввод с клавиатуры значения, и, 
если введено значение 1 (единица), то это означает согласие игрока на 
получение четвертой карты. 

Предыдущее задание:
Как известно, при игре в «двадцать одно» («очко») у каждой карты есть 
численное значение. 
Напишите класс, который «выбрасывает три карты» (генерирует три 
случайных числа - в каких пределах?) и определяет, какой из вариан­
тов (недобор, перебор, «очко») реализовался. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a,b,c, down=2, up=11, sum; 
		a=down+(int)( (up-down+1)*Math. random()); 
		b=down+(int)( (up-down+1)*Math. random()); 
		c=down+(int)((up-down+1)*Math.random()); 
		System.out.println(a+" "+b+" "+c); 
		sum=a+b+c; 
		System.out.println(sum);

		if (sum<21) {
			System.out.println("Недобор. Еще карту? (y/n)");
			String answer = sc.next();
			if (answer.equals("y")) {
				int d = down+(int)((up-down+1)*Math.random()); 
				System.out.println(d);
				sum=a+b+c+d;
				System.out.println(sum);
			}
		}
		if (sum>21) 
			System.out.println("Пepeбop"); 

		if (sum==21) 
			System.out.println("Oчкo"); 
	}
}
