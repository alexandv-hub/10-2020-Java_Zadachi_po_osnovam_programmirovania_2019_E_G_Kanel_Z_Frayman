package chapter13;

import java.util.Scanner;

public class Task_13_18 {
	/*
	 * По правилам банка, на вклад ежемесячно начисляется определенная 
сумма, которая зависит от ежемесячного процента на вклад. 
Например, на вкладе в 10000 рублей с месячным процентом 10% через 
месяц будет сумма 11000 рублей (1000 плюс 10% от 1000), а еще через 
месяц - 12100 (11000 плюс 10% от 11000). 
Напишите класс, который принимает с клавиатуры три значения: 
• сумму на вкладе; 
• месячный процент; 
• количество месяцев, в течение которых начисляются проценты на 
вклад. 
Класс подсчитает и выведет на экран итоговую сумму на вкладе. 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int sumInitial, monthlyPercent, numMonths, sumTotal, sumMonthlyCalc;
		
		System.out.println("Введите сумму на вкладе");
		sumInitial = sc.nextInt();
		System.out.println("Введите месячный процент");
		monthlyPercent = sc.nextInt();
		System.out.println("Введите количество месяцев, в течение которых начисляются проценты на вклад");
		numMonths = sc.nextInt();
		
		sumTotal = sumInitial;
		
		for (int i = 1; i<=numMonths; i++) {
			sumMonthlyCalc = sumTotal * monthlyPercent/100;
			sumTotal += sumMonthlyCalc;
			System.out.println("Сумма на вкладе по окончании " + i + " месяца = " + sumTotal);
		}
		
		System.out.println("Итоговая сумма на вкладе через " + numMonths + " месяцев = " + sumTotal);

	}

}
