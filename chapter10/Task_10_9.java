package chapter10;

public class Task_10_9 {
	/*
	 *Напиши класс, представляющий версию игры из предыдущего зада­
ния - только в этом случае компьютер должен играть сам с собой, то 
есть и первое значение должно не вводиться с клавиатуры, а генериро­
ваться классом. 
	 */

	public static void main(String[] args) {

		int a = (int) ( 100*Math.random() ) ;
		System.out.println(a);

		int up = a+11;
		int down = a-11;

		int guess = down + (int)( (up-down+1)*Math.random() ); 
		System.out.println(guess);

		if (guess == a)
			System.out.println("Угадал");
		if (guess > a)
			System.out.println("Слишком большое");
		if (guess < a)
			System.out.println("Слишком маленькое");	

	}

}
