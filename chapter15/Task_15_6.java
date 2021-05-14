package chapter15;

public class Task_15_6 {
	/*
	 * Напишите класс, который принимает с клавиатуры числа, пока небу­
дет введено значение 999. 
Класс должен подсчитать, сколько значений было введено с клавиату­
ры, чему равна сумма этих значений (не считая значения 999), и вы­
вести эту информацию на экран.
	 */

	public static void main(String[] args) {
		
		int num, i=1, sum=0;
		System.out.println(i);
		num =  0+(int)( Math.random()*(999-0+1) );
		System.out.println(num);
		sum=num;
		
		while (num!=999) {
			i++;
			System.out.println(i);
			num =  0+(int)( Math.random()*(999-0+1) );
			sum += num;
			System.out.println(num);
			System.out.println(sum);
		}
		i--;
		System.out.println("\nБыло введено " + i + " значений");
		System.out.println("Сумма введенных значений = " + sum);
	}

}
