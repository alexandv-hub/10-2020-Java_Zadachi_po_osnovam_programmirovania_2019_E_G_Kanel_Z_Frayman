package chapter14;

public class Task_14_2 {
	/*
	 * В соревнованиях по бегу принимали участие 150 учеников школы. 
Напишите класс, который принимает с клавиатуры время, показанное 
в соревнованиях каждым из учеников, и выводит на экран наилучший 
результат, а также порядковый номер победителя (можно предполо­
жить, что есть только один победитель). 
	 */

	public static void main(String[] args) {
		
		int bestTime, timeRun, minutes, seconds, numRunner;
		
		numRunner = 1;
		
		bestTime = ( (2*60)+(int)(Math.random()*(8*60-2*60+1)) );
		minutes = bestTime/60;
		seconds = bestTime%60;
		System.out.println("Время забега участника №1 = " + bestTime + "сек. (" + minutes + " мин. " + seconds + " сек.)");
		System.out.println("Лучшее время забега - у участника № 1 = " + bestTime + "сек. (" + minutes + " мин. " + seconds + " сек.)");
		
		for (int i=2; i<=150; i++) {
			timeRun = ( (2*60)+(int)(Math.random()*(8*60-2*60+1)) );
			minutes = timeRun/60;
			seconds = timeRun%60;
			System.out.println("\nВремя забега участника № " + i + " = " + timeRun + "сек. (" + minutes + " мин. " + seconds + " сек.)");
			
			if (timeRun<bestTime) {
				bestTime = timeRun;
				numRunner = i;
				minutes = bestTime/60;
				seconds = bestTime%60;
				System.out.println("Лучшее время забега - у участника № " + numRunner + " = " + bestTime + "сек. (" + minutes + " мин. " + seconds + " сек.)");
			}
			
		}
		minutes = bestTime/60;
		seconds = bestTime%60;
		System.out.println("\nЛучшее время забега - у участника № " + numRunner + " = " + bestTime + "сек. (" + minutes + " мин. " + seconds + " сек.)");
	}

}
