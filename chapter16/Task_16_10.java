package chapter16;

public class Task_16_10 {
	/*
	 * Целое число называется «Полноценным», если сумма делителей (вклю­
чая 1, но, не включая само число) числа равна самому числу. 
Напишите класс, который выводит на экран все «полноценные» числа 
ОТ 1 ДО 100000. 
	 */

	public static void main(String[] args) {

		int sumOfDividers=0, divider;

		for (int i=1; i<=100000; i++) {
			sumOfDividers=0;
			for (divider=1; divider<=100000; divider++) {

				if (i%divider==0) {
					sumOfDividers += divider;
					// System.out.println("Сумма делителей числа " + i + " - " + sumOfDividers);
					if ((sumOfDividers-i)==i) {
						sumOfDividers -= i;
						//System.out.println("Сумма делителей числа " + i + " не включая само число = " + sumOfDividers);
						System.out.println("Полноценное число - " + i);
					}
				}				
			}

		}

	}

}
