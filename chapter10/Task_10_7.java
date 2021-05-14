package chapter10;

public class Task_10_7 {
	/*
	 * Напишите класс, который генерирует два случайных положительных дву­
значных числа, обозначающих границы некоторого интервала, а затем 
генерирует три целых положительных числа внутри данного интервала. 
	 */

	public static void main(String[] args) {
		
		int a = (int) (100*Math.random());
		System.out.println(a);
		int b = (int) (100*Math.random());
		System.out.println(b);
		
		if (a<b) {
			int ab1 = (int) (a + Math.random()*(b-a+1) );
			System.out.println(ab1);
			int ab2 = (int) (a + Math.random()*(b-a+1) );
			System.out.println(ab2);
			int ab3 = (int) (a + Math.random()*(b-a+1) );
			System.out.println(ab3);
		}
		if (a>b) {
			int ab1 = (int) (b + Math.random()*(a-b+1) );
			System.out.println(ab1);
			int ab2 = (int) (b + Math.random()*(a-b+1) );
			System.out.println(ab2);
			int ab3 = (int) (b + Math.random()*(a-b+1) );
			System.out.println(ab3);
		}
			
	}

}
