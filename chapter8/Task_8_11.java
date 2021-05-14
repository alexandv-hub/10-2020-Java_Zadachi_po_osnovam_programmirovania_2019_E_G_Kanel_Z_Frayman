package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры два числа: первое -
 количество учеников в классе, второе - количество стульев в классной
 комнате.
 Программа проверит соответствие между этими двумя значениями и
 выведет на экран соответствующую информацию (например, для зна­
 чений 35 и 39 на экран выводится 4 стула лишних).
 */

public class Task_8_11 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		 System.out.println("Please input the number of pupils");
		 int a = sc.nextInt();
		 System.out.println("Please input the number of chairs");
		 int b = sc.nextInt();
		 int c;
		 
		 if (a<b) {
			 c = b - a;
			 System.out.println(c + " стула лишние");
		 }
		 else {
			 c = a - b;
			 System.out.println("Не хватает " + c + " стульев");
		 }

	}

}
