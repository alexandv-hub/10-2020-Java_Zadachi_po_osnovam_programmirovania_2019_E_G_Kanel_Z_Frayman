package chapter8;

import java.util.Scanner;

/**
 * Дан следующий класс:
 */

public class Task_8_2 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Bвeди целое число"); 
		int a=sc.nextInt(); 
		System.out.println("Bвeди еще одно целое число"); 
		int b=sc.nextInt(); 
		
		System.out.println("a%b = " + (a%b));
		System.out.println("b%a = " + (b%a));
		
		if (a%b==0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		if(b%a==0) {
			a+=2;
			System.out. println("Good");
		}
		else {
			a=2;
			System.out. println("Bad");
		} 
		
		System.out.println(a); 

	}

}

/**
 1. Заполните таблицу в соответствии с исполнением операторов.

 Ввод с клавиатуры | Вывод на экран
 3 21              | - No, Good, 5
 21 3              | - Yes, Bad, 2
 13 13             | - Yes, Good, 15
 5 12              | - No, Bad, 2

 2. Предложите более соответствующие общему смыслу программы
 сообщения, которые должен выводить на экран класс. Объясните
 свой выбор.
 // "Введенные 2 числа являются делимыми"
 // "Введенные 2 числа являются неделимыми"

 3. Какие значения, введенные с клавиатуры, приведут (на этапе ис-
 полнения) к сообщению об ошибке?
 // Если второе введенное число будет равно 0.

 */


