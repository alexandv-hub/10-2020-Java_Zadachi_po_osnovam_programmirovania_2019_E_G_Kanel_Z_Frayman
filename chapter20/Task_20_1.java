package chapter20;

import java.util.Arrays;

public class Task_20_1 {
	/*
	 Напишите метод, который принимает в качестве параметра массив 
целых чисел, в котором могут быть и отрицательные числа, и положи­
тельные, и нули. 
Метод должен возвращать массив, который содержит информацию о 
том, сколько раз в массиве-параметре встречались отрицательные 
значения, сколько раз - положительные, сколько раз - ноль.
	 */

	public static void fillArr (int []a) {
		for (int i=0; i<a.length; i++) {
			a[i] = -9+(int)( (9+9+1)*Math.random() );
		}
	}

	public static int[] counter (int []a) {
		int countZeros=0, countPoz=0, countNeg=0;
		int b[] = {countZeros, countNeg, countPoz};

		
		for (int i=0; i<a.length; i++) {
			
			if (a[i] == 0) {
				countZeros++;
			}

			if (a[i] < 0) {
				countNeg++;
			}

			if (a[i] > 0) {
				countPoz++;
			}
			
			b[0] =countZeros;
			b[1] =countNeg;
			b[2] =countPoz;
		}
		System.out.println("\nКол-во нулей = " + countZeros);
		System.out.println("Кол-во отриц. чисел = " + countNeg);
		System.out.println("Кол-во положит. чисел = " + countPoz);
		System.out.println(Arrays.toString(b));
		return b;	
	}
	

	public static void printArr (int []a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int [] a;
		a = new int[10];
		fillArr(a);
		printArr(a);
		counter(a);
		
	}

}