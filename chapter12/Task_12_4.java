package chapter12;

import java.util.Scanner;

public class Task_12_4 {
	/*
	 * Напишите класс, который принимает с клавиатуры 17 целых чисел и 
выводит на экран информацию о том, сколько из них были больше, 
чем предыдущее число.
	 */
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		 System.out.println("Введите целое число № 1");
			
		  int prior = sc.nextInt(); 
		  int count = 0;
					
		  for (int i=2; i<=17; i++) {
				
		    System.out.println("Введите целое число № " + i);	
		    int a = sc.nextInt();
		    if (a>prior) count++;
		    prior = a; 		
		  }
		  System.out.println("Из введенных 17ти чисел, " + count + " были больше предыдущего");	
		}
}
		



