package chapter10;

public class Task_10_6 {
	/*
	 * Напишите класс, который генерирует случайное положительное дву­
значное число, а затем генерирует три целых двузначных числа, не 
меньших первого. 
	 */
	public static void main(String[] args) {
		
		int a = (int) (100*Math.random());
		System.out.println(a);

		int a1 = (int) (10*Math.random()+a);
		System.out.println(a1);
		int a2 = (int) (10*Math.random()+a);
		System.out.println(a2);
		int a3 = (int) (10*Math.random()+a);
		System.out.println(a3);

	}

}
