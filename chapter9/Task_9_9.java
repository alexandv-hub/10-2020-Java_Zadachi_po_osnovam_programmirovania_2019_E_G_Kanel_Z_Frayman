package chapter9;

import java.util.Scanner;

public class Task_9_9 {
	/*
	 * Напишите класс, который принимает с клавиатуры коэффициенты а и 
Ь линейного уравнения (уравнения первой степени - ах+Ь=О) и решает 
его, - то есть выводит на экран или корень (корни) уравнения, или со­
ответствующее смыслу текстовое сообщение. 
	 */

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input the value of a");
		int a = sc.nextInt();
		System.out.println("Please input the value of b");
		int b = sc.nextInt();

		double x = (double) -b/a;

		if ( (a==0) && (b==0) )
		System.out.println("Бесконечное множество решений");
		if ( (a==0) && (b!=0) ) 
			System.out.println("Heт решения"); 
		if (a!=0) 
			System. out. println(x); 
	}

}
