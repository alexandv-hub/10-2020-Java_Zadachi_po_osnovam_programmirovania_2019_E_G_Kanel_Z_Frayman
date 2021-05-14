package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры две пары целых
 ненулевых чисел: первая пара является числителем и знаменателем од-
 ной дроби, вторая пара - числителем и знаменателем другой дроби.
 Класс должен проверить, равны ли эти дроби друг другу, и вывести на
 экран соответствующее текстовое сообщение.
 */

public class Task_8_29 {

	public static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			System.out.println("Please input the 1st integer number different form zero");
			int a = sc.nextInt();
			System.out.println("Please input the 2nd integer number different form zero");
			int b = sc.nextInt();
			
			System.out.println("Please input the 1st integer number different form zero");
			int c = sc.nextInt();
			System.out.println("Please input the 2nd integer number different form zero");
			int d = sc.nextInt();
			
			double f1 = (double)a/b; 
			double f2 = (double)c/d;
			
			if (f1==f2)
				System.out.println("These 2 fractions are equal");
			else
				System.out.println("These 2 fractions are not equal");

	}

}
