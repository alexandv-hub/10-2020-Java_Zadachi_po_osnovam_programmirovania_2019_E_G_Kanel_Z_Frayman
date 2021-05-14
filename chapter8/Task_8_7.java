package chapter8;

import java.util.Scanner;

/**

 Напишите класс, который принимает с клавиатуры два целых положи-
 тельных числа и затем выводит на экран:
 • разницу между первым и вторым, - в случае если первое больше
 второго;
 • разницу между вторым и первым, - в случае если второе больше
 первого;
 • произведение введенных значений, - в случае если они равны.

 */

public class Task_8_7 {

	public static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {

			 System.out.println("Please input the 1st number");
			 int a = sc.nextInt();
			 System.out.println("Please input the 2nd number");
			 int b = sc.nextInt();
			 
			 if (a>b) 
				 System.out.println(a-b);

			 if (a<b) 
				 System.out.println(b-a);

			 if (a==b) 
				 System.out.println(a*b); 		 
	}

}
