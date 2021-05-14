package chapter13;

public class Task_13_30 {
	/*
	 * Производственный участок выпускает стальные шарики, диаметр ко­
торых должен быть равен 24 миллиметрам (допустимое отклонение не 
более 2 миллиметров), а вес - 74 граммам (допустимое отклонение не 
более 3 грамм). 
Напишите класс, который принимает данные 120 шариков, для каждо­
го из них определяет, соответствуют ли его параметры указанным 
стандартам, и выводит на экран для каждого шарика соответствующее 
текстовое сообщение. 
	 */

	public static void main(String[] args) {

		int ballWeight, ballDiam; 

		for (int i=1; i<=120; i++) {

			ballWeight = 20 + (int) ( Math.random() * (28-20+1) );
			System.out.println("Масса шарика № " + i + " = " + ballWeight);

			ballDiam = 69 + (int) ( Math.random() * (79-69+1) );
			System.out.println("Вес шарика № " + i + " = " + ballDiam);

			if ( (ballWeight <= 26) & (ballWeight >= 22) & (ballDiam<=77) & (ballDiam>=71) ) {
				System.out.println("Параметры (масса и вес) шарика № " + i + " - соответствуют указанным стандартам");
				System.out.println();
			}
			else {
				System.out.println("Параметры (масса и вес) шарика № " + i + " - НЕ соответствуют указанным стандартам");
				System.out.println();
			}
		}


	}

}
