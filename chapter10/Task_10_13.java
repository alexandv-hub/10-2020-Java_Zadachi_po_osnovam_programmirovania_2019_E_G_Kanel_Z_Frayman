package chapter10;

public class Task_10_13 {
	/*
	 * Два человека играют в кости по следующим правилам: в каждом раун­
де игры (а она состоит из 10 раундов) каждый из участников бросает 
«кость» (кубик, на гранях которого значения от 1 до 6). В каждом раун­
де определяется победитель или фиксируется состояние «ничья», в за­
висимости от значения, которое выпало на кубике участника. 
Напишите класс, который моделирует эту игру, указывая для каждого 
раунда, кто из игроков набрал в этом раунде больше очков - или сооб­
щая О СОСТОЯН�?�? «Н�?ЧЬЯ». 
	 */

	public static void main(String[] args) {
		
		for (int round = 1; round <= 10; round++) {
		
		int a = 1+(int)((6-1+1)*Math.random());
		System.out.println(a);
		int b = 1+(int)((6-1+1)*Math.random());
		System.out.println(b);
		if (a>b)
			System.out.println("Round " + round + "- Player 1 wins");
		if (a<b)
			System.out.println("Round " + round + "- Player 2 wins");
		if (a==b)
			System.out.println("Round " + round + "- Drawn game");
		}
	}

}
