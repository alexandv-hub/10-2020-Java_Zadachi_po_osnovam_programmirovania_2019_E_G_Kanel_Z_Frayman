package chapter20;

import java.util.Arrays;

public class Task_20_14 {
	/*
	 * Напишите класс, который принимает с клавиатуры даты рождения 
20 учеников {три числа - день, месяц, год) и выводит на экран сле-
дующую информацию: 
• сколько дней рождения есть в каждом месяце;  
• в каком месяце (месяцах) больше всего дней рождения; 
• в каком месяце (месяцах) нет ни одного дня рождения. 
	 */

	public static void main(String[] args) {
		int [][] M = new int [3][20];
		fillArray(M);
		printArrays(M);
		getNumOfBirthdaysInMonth(M);
	}


	public static void fillArray(int[][]M) {
		for (int i=0; i<20; i++) {
			M [0][i] = 1+(int)( Math.random()*(31-1+1) );
		}
		for (int i=0; i<20; i++) {
			M[1][i] = 1+(int)( Math.random()*(12-1+1) );
		}
		for (int i=0; i<20; i++) {
			M[2][i] = 2010+(int)( Math.random()*(2011-2010+1) );
		}
	}


	public static void printArrays (int[][]M) {
		for (int i=0; i<M.length; i++) {
			System.out.println(Arrays.toString(M[i]));
		}
	}


	// сколько дней рождения есть в каждом месяце; 
	public static void getNumOfBirthdaysInMonth (int [][]M) {

		int [][]numOfBirthdaysInMonth = new int [2][12];

		for (int i=0; i<M[0].length; i++) {

			int cellNumber = M[1][i]-1;

			if (M[2][i] == 2010) 		
				numOfBirthdaysInMonth[0][cellNumber]++; 

			if (M[2][i] == 2011) 		
				numOfBirthdaysInMonth[1][cellNumber]++; 
		}
		System.out.print("\nКол-во дней рождения в 2010 году : ");
		System.out.print(Arrays.toString(numOfBirthdaysInMonth[0]));
		System.out.print("\nКол-во дней рождения в 2011 году : ");
		System.out.print(Arrays.toString(numOfBirthdaysInMonth[1]));

		//  в каком месяце (месяцах) больше всего дней рождения;
		int monthMax = 0;
		int monthNum = 0;
		int yearNum = 0;
		int year = 0;

		for (int j=0; j<numOfBirthdaysInMonth.length; j++) {

			for (int i = 0; i<numOfBirthdaysInMonth[0].length; i++) {
				if (monthMax<numOfBirthdaysInMonth[j][i]) {
					monthMax = numOfBirthdaysInMonth[j][i];
					monthNum = i+1;
					yearNum = j+1;
					if (yearNum==1)
						year = 2010;
					if (yearNum==2)
						year = 2011;
				}
			}

		}

		System.out.println();
		System.out.println();

		for (int i = 0; i<numOfBirthdaysInMonth.length; i++) {

			for (int j = 0; j<numOfBirthdaysInMonth[0].length; j++) {

				if (monthMax==numOfBirthdaysInMonth[i][j]) {
					monthNum = j+1;
					yearNum = i+1;
					if (yearNum==1)
						year = 2010;
					if (yearNum==2)
						year = 2011;
					System.out.println("Больше всего дней рождений (" + monthMax + " шт.) в " + monthNum  + " месяце " + year + " года");	
				}

			}
		}

		// в каком месяце (месяцах) нет ни одного дня рождения. 
		System.out.println();
		for (int i = 0; i<numOfBirthdaysInMonth.length; i++) {

			for (int j = 0; j<numOfBirthdaysInMonth[0].length; j++) {

				if (numOfBirthdaysInMonth[i][j]==0) {
					monthNum = j+1;
					yearNum = i+1;
					if (yearNum==1)
						year = 2010;
					if (yearNum==2)
						year = 2011;
					System.out.println("Нет дней рождений в " + monthNum  + " месяце " + year + " года");	
				}
			}
		}
	}
}

