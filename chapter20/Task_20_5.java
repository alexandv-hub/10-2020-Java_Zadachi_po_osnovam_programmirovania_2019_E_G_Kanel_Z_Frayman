package chapter20;

import java.util.Arrays;

public class Task_20_5 {
	/*
	 Напишите класс, который генерирует серию из 100 случайных одно­
значных неотрицательных чисел (цифр). 
Класс должен определить, какая из цифр встречалась в серии чаще все­
го, и вывести на экран соответствующую информацию. В случае если 
максимальная «частота появления» в серии была у нескольких цифр, 
следует вывести на экран информацию о каждой такой цифре. 
	 */

	public static void main(String[] args) {
		int []a = new int [100];

		fillArr(a);
		printArr(a);
		searchTheMostCommon(a);
	}

	
	public static void fillArr (int []a) {
		for (int i=0; i<a.length; i++) {
			a[i] = 0+(int)(Math.random()*(9-0+1) );
		}
	}

	
	public static void printArr (int[]a) {

		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// System.out.println(Arrays.toString(a));
	}


	// какая из цифр встречалась в серии чаще всего, и вывести на экран соответствующую информацию
	public static void searchTheMostCommon (int []a) {
		int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int theFigure = 0;
		int[] b = new int [10];
		int theMostCommonFigureCounter = 0;
		System.out.println();
		System.out.println(Arrays.toString(temp));

		for (int i=0; i<a.length; i++) {

			for (int j=0; j<b.length; j++) {

				if (a[i]==j) 
					b[j]++;
			}

		}

		System.out.println(Arrays.toString(b));

		for (int i=0; i<b.length; i++) {
			if (theMostCommonFigureCounter<b[i]) {
				theMostCommonFigureCounter=b[i];
				theFigure = i;
			}
		}
		System.out.println("Самая часто встречающаяся цифра - " + theFigure);

		for (int i=0; i<b.length; i++) {
			if ( (b[i] == theMostCommonFigureCounter) & (i!=theFigure) ){
				System.out.println("Самая часто встречающаяся цифра - " + i);
			}
		}

	}
}
