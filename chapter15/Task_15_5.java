package chapter15;

public class Task_15_5 {
	/*
	 * Напишите класс, который принимает с клавиатуры числа, пока не бу­
дет введено значение 999. 
Класс должен подсчитать, сколько значений было введено с клавиату­
ры (не считая значения 999), и вывести эту информацию на экран. 
	 */

	public static void main(String[] args) {
		
		int num, i=1;
		System.out.println(i);
		num =  0+(int)( Math.random()*(999-0+1) );
		System.out.println(num);
		
		while (num!=999) {
			i++;
			System.out.println(i);
			num =  0+(int)( Math.random()*(999-0+1) );
			System.out.println(num);
		}
		i--;
		System.out.println("\nБыло введено " + i + " значений");

	}

}
