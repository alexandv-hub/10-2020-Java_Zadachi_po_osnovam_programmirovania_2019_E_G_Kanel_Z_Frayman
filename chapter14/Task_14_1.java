package chapter14;

public class Task_14_1 {
	/*
	 * В соревнованиях по бегу принимали участие 150 учеников школы. 
Напишите класс, который принимает с клавиатуры время, показанное 
в соревнованиях каждым из учеников, и выводит на экран наилучший 
результат.
	 */

	public static void main(String[] args) {

		int timeRun, bestTime, minutes, seconds;
		
			bestTime = (2*60) + (int) ( (8*60-3*60+1)*(Math.random() ) )  ;
			minutes = bestTime/60;
			seconds = bestTime%60;
			System.out.println("Время забега ученика № 1 - "+ bestTime + "сек. (" + minutes + " мин. " + seconds + " сек.)");
			System.out.println("bestTime = " + bestTime);
			
			for (int i=2; i<=150; i++) {
				timeRun = (2*60) + (int) ( (8*60-3*60+1)*(Math.random() ) )  ;
				
				minutes = timeRun/60;
				seconds = timeRun%60;
				System.out.println("\nВремя забега ученика № " + i + " - "+ timeRun + "сек. (" + minutes + " мин. " + seconds + " сек.)");
				
			if(timeRun<bestTime) {
				bestTime=timeRun;  

				System.out.println("bestTime = " + bestTime);
			}
			
		}
			System.out.println();
			minutes = bestTime/60;
			seconds = bestTime%60;
			System.out.println("Наилучший результат - " + bestTime + " сек. (" + minutes + " мин. " + seconds + " сек.)" );	
		
	}

}
