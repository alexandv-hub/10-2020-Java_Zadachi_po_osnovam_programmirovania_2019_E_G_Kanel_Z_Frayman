package chapter12;

import java.util.Scanner;

public class Task_12_10 {
	/*
	 * Контрольная работа считается «провальной», если более половины 
учеников получили неудовлетворительные оценки. 
Напишите класс, который принимает с клавиатуры число учеников в 
группе, а затем - оценку каждого ученика. 
Класс должен определить, была ли контрольная «провальной». 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numPupils, mark;
		int countGood = 0;

		System.out.println("Введите кол-во учеников в группе");
		numPupils = sc.nextInt();

		for (int i=1; i<=numPupils; i++ ) {
			System.out.println("Введите оценку " + i + " ученика");
			mark = sc.nextInt();
			if (mark>=3)
				countGood++;
		}
		if (countGood >= numPupils/2)
			System.out.println("Контрольная была успешной");
		if (countGood < numPupils/2)
			System.out.println("Контрольная была провальной");
	}

}
