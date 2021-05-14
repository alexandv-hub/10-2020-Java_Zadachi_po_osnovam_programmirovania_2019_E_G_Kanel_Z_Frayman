package chapter15;

public class Task_15_8 {
	/*
	 * Напишите класс, который принимает с клавиатуры значения, пока их 
сумма остается меньше 150. По окончании ввода следует вывести на 
экран информацию о количестве введенных значений и их сумме. 
	 */

	public static void main(String[] args) {
		int num, i=1, sum=0;

		num =  0+(int)( Math.random()*(99-0+1) );
		System.out.println(num);
		sum=num;

		while (sum<150) {
			i++;
			num =  0+(int)( Math.random()*(99-0+1) );
			sum += num;
			if (sum<150)
				System.out.println(num);
		}
		i--;
		sum -= num;
		System.out.println("\nБыло введено " + i + " значений");
		System.out.println("Сумма введенных значений = " + sum);

	}

}
