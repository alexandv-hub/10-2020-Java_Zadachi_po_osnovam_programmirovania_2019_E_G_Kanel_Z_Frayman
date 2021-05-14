package chapter10;

public class Task_10_5 {
	/*
	 * Напишите класс, который генерирует случайное положительное дву­
значное число, а затем генерирует три целых положительных числа, 
меньших первого. 
	 */

	public static void main(String[] args) {
		
		int a = (int) (100*Math.random());
		System.out.println(a);

		int a1 = (int) (a*Math.random());
		System.out.println(a1);
		int a2 = (int) (a*Math.random());
		System.out.println(a2);
		int a3 = (int) (a*Math.random());
		System.out.println(a3);

	}

}
