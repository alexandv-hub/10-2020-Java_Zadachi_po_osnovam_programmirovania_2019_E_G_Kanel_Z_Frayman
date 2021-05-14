package chapter16;

public class Task_16_6 {
	/*
	 * Старинная задача: сколько можно купить быков и коров на 100 рублей, 
если плата за быка 10 рублей, за корову- 5 рублей (во всех вариантах). 
Напишите класс, который выводит на экран все возможные варианты 
решения задачи.
	 */

	public static void main(String[] args) {

		int numCows, numBulls; 
		int sum=100;
		int bullPrice = 10;
		int cowPrice = 5;
		
		for (numBulls=1; sum!=0; numBulls++) {
			sum = 100;
			sum -= (numBulls*bullPrice);
			numCows = sum/cowPrice;
			System.out.print("Можно купить быков " + numBulls + " шт., " + "и коров - " + numCows + " шт.");
			System.out.println();
		}

	}

}
