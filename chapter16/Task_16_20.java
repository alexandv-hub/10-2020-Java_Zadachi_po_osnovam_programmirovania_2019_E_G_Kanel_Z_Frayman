package chapter16;

public class Task_16_20 {
	/*
	 * В классе 35 учеников. В конце учебного года каждый ученик получает 
ведомость с оценками по 8 предметам. 
Напишите класс, который генерирует по 8 оценок для каждого ученика 
и подсчитывает для него среднюю годовую оценку. 

Для каждого ученика класс должен выводить на экран в одну строку 
оценки каждого ученика и его среднюю годовую оценку. 
После завершения вывода на экран оценок всех учеников класс должен 
выводить в отдельной строке количество учеников, у которых средне­
годовая оценка выше 4.5, и наивысшую среднегодовую оценку.
	 */

	public static void main(String[] args) {

		int n=35, score, scoreSum=0, numOfBestPupils=0;
		double scoreAverage, scoreAverageMax=0;

		for (int i=1; i<=n; i++) {

			System.out.print("\nОценки по 8 предметам для ученика № " + i + ": ");

			for (int j=1; j<=8; j++) {
				score = 3+(int)( Math.random() * (5-3+1) );
				System.out.print(score + " ");
				scoreSum += score; 
			}
			
			System.out.print(", scoreSum = " + scoreSum);
			scoreAverage = scoreSum/8d; 
			System.out.print(", scoreAverage = " + scoreAverage);

			if (scoreAverage >= 4.5)
				numOfBestPupils++;

			scoreSum = 0;
			
			if (scoreAverage>scoreAverageMax) {
				scoreAverageMax=scoreAverage;
				System.out.print(" / scoreAverageMax=" + scoreAverageMax);
			}
		}
		System.out.println("\n\nколичество учеников, у которых среднегодовая оценка выше 4.5 - " + numOfBestPupils);
		System.out.println("наивысшая среднегодовая оценка - " + scoreAverageMax);
	}
}
