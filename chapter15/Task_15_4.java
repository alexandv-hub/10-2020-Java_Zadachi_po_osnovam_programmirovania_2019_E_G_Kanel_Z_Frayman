package chapter15;

public class Task_15_4 {
	/*
	 * Напишите класс, который принимает с клавиатуры числа, пока не бу­
дет введено значение О. Для каждого введенного с клавиатуры поло­
жительного числа класс должен выводить на экран текст Плюс, для 
каждого отрицательного - текст Минус. 
	 */

	public static void main(String[] args) {
		
		int num;
		num =  -99+(int)( Math.random()*(99+99+1) );
		
		while (num!=0) {
			if (num>0)
				System.out.println("Плюс");
			if (num<0)
				System.out.println("Минус");
			num =  -99+(int)( Math.random()*(99+99+1) );
		}
		
	}

}
