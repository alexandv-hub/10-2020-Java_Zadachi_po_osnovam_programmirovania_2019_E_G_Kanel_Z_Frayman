package chapter15;

import java.util.Scanner;

public class Task_15_9 {
	/*
	 * Напишите класс, который принимает с клавиатуры целое число, а за­
тем выводит на экран последующие ему целые числа, пока сумма этих 
чисел не превышает квадрата введенного числа. 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num, sum=0, sq;
		
		num =  sc.nextInt();
		
		sum += num;
		sq = num*num;
		
		while (sum<sq) {
			num++;
			sum += num;
			sq = num*num;
			System.out.println(num);
		}

	}

}
